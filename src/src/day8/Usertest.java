package day8;

public class Usertest {
    public static void main(String[] args) {
        User us=new User();
        us.setUsername("wyl");
        us.setPassword("123456");
        us.setGender("MAN");
        us.setEmial("3080433063");
        us.setAge(18);
        System.out.println(us.getUsername());
        System.out.println(us.getPassword());
        System.out.println(us.getEmial());
        System.out.println(us.getGender());
        System.out.println(us.getAge());

    }

}
