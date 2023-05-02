package a03interfacedemo3;

public class PingpangAthlete extends Athlete implements SpeakingEglish {
    public PingpangAthlete() {
    }

    public PingpangAthlete(String name, int age) {
        super(name, age);
    }

    @Override
    public void learing() {
        System.out.println("学习乒乓球");
    }

    @Override
    public void speakingeglish() {
        System.out.println("说英语");
    }
}
