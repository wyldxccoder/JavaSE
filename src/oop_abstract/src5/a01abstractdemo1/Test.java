package a01abstractdemo1;

public class Test {
    public static void main(String[] args) {
        Frog f = new Frog("小绿", 1);
        System.out.println(f.getName() + ", " + f.getAge());
        f.eat();
        f.drink();


    }
}