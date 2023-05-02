package a04extends;

public class Cook extends Employee{

    public Cook(){}//构造空参方法
    public Cook(String id, String name, double salary){//构造全参方法
        super(id, name, salary);//调用父类构造方法
    }


    @Override
    public void work() {
        System.out.println("做饭");
    }

    @Override
    public void eat() {    //重写吃饭方法
        System.out.println("吃米饭");
    }
}
