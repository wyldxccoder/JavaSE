package a01abstractdemo1;

public class Frog extends Animal{

    public Frog(){}

    public Frog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("青蛙再吃虫子");
    }
}
