package a03interfacedemo3;

public class Test {
    public static void main(String[] args) {
        PingpangCoach p=new PingpangCoach("马龙",20);
        System.out.println(p.getName()+", "+p.getAge());
        p.teaching();
        p.speakingeglish();
    }
}
