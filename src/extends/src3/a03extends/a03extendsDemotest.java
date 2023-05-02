package a03extends;
//成员方法的调用特点
public class a03extendsDemotest {
    public static void main(String[] args) {
        OverseasStudent student=new OverseasStudent();
        student.lunch();
    }
}
//父类
 class Person{
    public void eat(){
        System.out.println("吃米饭");
    }
    public void drink(){
        System.out.println("和开水");
    }
}
//子类留学生
class OverseasStudent extends Person{
    public void lunch(){
        this.eat();
        this.drink();
        super.eat();
        super.drink();


    }
    //方法重写应用场景:当父类中方法,不能满足子类现在需求时,我们需要把这个方法进行重写
    //注意:子类中重写的方法上面需要加上@Override  ,重写的方法尽量和父类保持一致
    @Override
    public void eat(){
        System.out.println("吃意大利面");
    }
    @Override
    public void drink(){
        System.out.println("喝凉水");
    }

}
//子类学生
class studnt extends Person{
    public void lunch(){
        this.eat();
        this.drink();
        super.eat();
        super.drink();
    }
}