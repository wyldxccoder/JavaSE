package a01MyReflectDemo1;
//获取class对象的三种方式
public class MyReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //方法一  Class.forName("全类名")
        Class clazz1 = Class.forName("a01MyReflectDemo1.Student");
        System.out.println(clazz1);
        //方法二  类名.class
        Class clazz2 = Student.class;
        System.out.println(clazz2);
        System.out.println(clazz1==clazz2);
        //方法三 对象.getClass
        Student s=new Student();
        Class clazz3 = s.getClass();
        System.out.println(clazz3);


    }
}
