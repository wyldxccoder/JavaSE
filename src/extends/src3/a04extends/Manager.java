package a04extends;
//父类中成员变量,成员方法,构造方法的调用和成员方法的重写
public class Manager extends Employee{
    private double bouns;//私有化成员变量
    //构造空参方法
    public Manager(){}
    //构造全参方法  父类+子类
    public Manager(String id, String name, double salary, double bouns) {
        super(id, name, salary);//调用父类中的构造方法
        this.bouns = bouns;
    }

    public double getBouns() {
        return bouns;
    }

    public void setBouns(double bouns) {
        this.bouns = bouns;//调用本类里面的成员变量
    }

    @Override
    public void work() {   //重写工作方法
        System.out.println("管理其他人");
    }

    @Override
    public void eat() {   //重写吃饭方法
        System.out.println("吃大鱼大肉");
    }
}
