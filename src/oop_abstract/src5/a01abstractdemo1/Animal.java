package a01abstractdemo1;
//抽象类和抽象方法,抽象方法在子类中必须重写
//抽象类不能被其他类创建对象
public abstract class Animal {//抽象类
    private String name;
    private int age;
    public Animal() {

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //喝水
    public void drink(){
        System.out.println("动物在喝水");
    }
    //吃
    public abstract void eat();//抽象方法:没有方法结构,直接以分号结尾
}
