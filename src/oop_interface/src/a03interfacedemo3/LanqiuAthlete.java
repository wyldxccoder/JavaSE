package a03interfacedemo3;

public class LanqiuAthlete extends Athlete  {
    public LanqiuAthlete() {
    }

    public LanqiuAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learing() {
        System.out.println("学习篮球");
    }


}
