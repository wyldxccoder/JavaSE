package polymorphismtest02;

public class Test {
    public static void main(String[] args) {
        Person p1=new Person("老王",30);
        Dog dog=new Dog(2,"黑");
        p1.keepPet(dog,"骨头");
        Person p2=new Person("老李",25);
        Cat cat=new Cat(3,"灰");
        p2.keepPet(cat,"鱼");
    }
}
