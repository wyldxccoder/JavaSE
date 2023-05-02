package day8;

public class Usertest2 {
    public static void main(String[] args) {
        User us=new User("wyl","123456","3080433063","MAN",18);
        System.out.println(us.getUsername());
        System.out.println(us.getPassword());
        System.out.println(us.getEmial());
        System.out.println(us.getGender());
        System.out.println(us.getAge());
    }

}
