package day6;

//对象 初步认识
public class GrlefriendtestPLUS {
    public static void main(String[] args) { //测试类(有mian 有static)
       Grlefriend gf1=new Grlefriend();//获得类的对象
        Gf(gf1);

    }
    public static void Gf(Grlefriend gf1){
        gf1.age=18;
        gf1.sex="萌妹";
        gf1.name="大美女";
        gf1.weight=90;
        System.out.println(gf1.age);
        System.out.println(gf1.sex);
        System.out.println(gf1.name);
        System.out.println(gf1.weight);
        gf1.eat();
        gf1.sleep();
        gf1.dadouodu();
    }
}
