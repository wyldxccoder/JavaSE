package polymorphismtest02;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(int age, String color) {
        super(age, color);
    }

    @Override
    //方法的重写
    public void eat(String something) {
        System.out.println(getAge()+"岁的"+getColor()+"色的狗两只前腿死死的抱着"+something+"啃");
    }
    public void LookHome(){
        System.out.println("狗在看家");
    }
}
