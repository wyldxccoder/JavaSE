package a04extends;

public class Employee {
    private String id;//构造私有化成员变量
    private String name;
    private double salary;

    public Employee() {//构造空参方法
    }

    public Employee(String id, String name, double salary) {//构造全参方法
        this.id = id;//调用本类成员变量
        this.name = name;
        this.salary = salary;
    }


    public String getId() {//构造get,set方法
        return id;
    }//成员方法


    public void setId(String id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public double getSalary() {
        return salary;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }
         //定义方法 工作
    public void work(){
        System.out.println("员工正在工作");
    }
        //定义方法   吃饭
    public void eat(){
        System.out.println("员工正在吃饭");
    }


}
