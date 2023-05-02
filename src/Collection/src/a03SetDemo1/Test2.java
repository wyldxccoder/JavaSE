package a03SetDemo1;

import java.util.Comparator;
import java.util.TreeSet;

public class Test2 {
    public static void main(String[] args) {
        //方法二指定排序规则
        Student2 s1=new Student2("zhangsan",23,90,99,50);
        Student2 s2=new Student2("lisi",24,90,98,50);
        Student2 s3=new Student2("wangwu",25,95,100,30);
        Student2 s4=new Student2("zhaoliu",26,60,99,70);
        Student2 s5=new Student2("qianqi",26,70,80,70);
        TreeSet<Student2> ts=new TreeSet<>(new Comparator<Student2>() {
            @Override
            public int compare(Student2 o1, Student2 o2) {
                int sum1=o1.getChinese()+o1.getMath()+o1.getEnglish();
                int sum2=o2.getChinese()+o2.getMath()+o2.getEnglish();
                int i=sum1-sum2;
                i = i == 0 ? o1.getChinese() - o2.getChinese() : i;
                i = i == 0 ? o1.getMath() - o2.getMath() : i;
                i = i == 0 ? o1.getEnglish() - o2.getEnglish() : i;
                i = i == 0 ? o1.getAge() - o2.getAge(): i;
                i = i == 0 ? o1.getName().compareTo(o2.getName()) : i;
                return i;
            }
        });
        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);
        for (Student2 t : ts) {
            System.out.println(t);
        }
    }
}
