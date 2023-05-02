package a05extends;

public class Teacher extends Employee {
    public Teacher() {
    }

    public Teacher(String id, String name) {
        super(id, name);//调用父类构造方法
    }

    @Override
    public void work() {
        System.out.println("教学");
    }
}
