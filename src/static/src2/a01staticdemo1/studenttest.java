package a01staticdemo1;

public class studenttest {
    public static void main(String[] args) {
        student.teatername="阿伟老师";//对象名调用
        student s1=new student();
        s1.setName("张三");
        s1.setAge(19);
        s1.setGender("男");
        s1.teatername="阿伟老师";//类名调用 (推荐)
        s1.study();
        s1.show();
        student s2=new student();
        s2.setName("李四");
        s2.setAge(20);
        s2.setGender("男");
        s2.study();
        s2.show();

    }
}
