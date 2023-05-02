package a01innerclassdemo1;
//内部类,在一个类里面定义另一个类 车的引擎,人的心脏
public class Car {
    //内部类可以直接访问外部类的成员,包括私有
    //外部类要访问内部类的成员,必须创建对象
    private String Carbank;
    private  String Carage;
    private String Carcolor;
    Engine e=new Engine();//创建对象
    public void show(){

        System.out.println(e.engineAge);//外部类要访问内部类的成员,必须创建对象
    }
    class Engine{
        private String Engine;
        private String engineAge;
        public void show(){
            System.out.println(Carbank);//内部类可以直接访问外部类的成员,包括私有
        }
    }
}
