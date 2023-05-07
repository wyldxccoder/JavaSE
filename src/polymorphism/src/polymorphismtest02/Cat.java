package polymorphismtest02;

public class Cat extends Animal{
    public Cat() {
    }

    public Cat(int age, String color) {
        super(age, color);//调用父类构造方法
    }

    @Override
    //方法的重写
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+ getColor() +"色的猫眯着眼侧着头吃"+something);
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
