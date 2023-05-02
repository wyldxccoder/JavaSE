package a03interfacedemo3;

public class PingpangCoach extends Coach implements SpeakingEglish {
    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teaching() {
        System.out.println("教打乒乓球");
    }

    @Override
    public void speakingeglish() {
        System.out.println("说英语");
    }
}
