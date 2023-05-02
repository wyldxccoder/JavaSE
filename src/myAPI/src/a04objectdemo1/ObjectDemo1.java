package a04objectdemo1;
//to string
public class ObjectDemo1 {
    public static void main(String[] args) {
        Student s=new Student("zhangsan",23);
        String s1=s.toString();
        System.out.println(s1);
    }
}
