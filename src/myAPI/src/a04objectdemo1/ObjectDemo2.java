package a04objectdemo1;
//equals
public class ObjectDemo2 {
    public static void main(String[] args) {
        Student s1=new Student("zhangsan",23);
        Student s2=new Student("zhangsan",23);
        boolean result = s1.equals(s2);
        System.out.println(result);
        //结论:默认equals方法是比较两个对象地址值,需要重写才能比较属性值
    }
}
