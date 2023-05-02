package a03interfacedemo3;

public class LanqiuCoach extends Coach{
    public LanqiuCoach() {
    }

    public LanqiuCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teaching() {
        System.out.println("教打篮球");
    }
}
