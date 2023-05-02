package a04extends;

public class Test {
    public static void main(String[] args) {
        //创建经理对象
        Manager m=new Manager("heima001","王云龙",20000,1000);
        System.out.println(m.getId()+" "+m.getName()+" "+m.getSalary()+" "+m.getBouns());
        m.eat();
        m.work();
        //创建厨师对象
        Cook c=new Cook("heiam002","薛傧阳",2000);
        System.out.println(c.getId()+" "+c.getName()+" "+c.getSalary());
        c.eat();
        c.work();




    }
}
