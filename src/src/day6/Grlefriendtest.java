package day6;

public class Grlefriendtest {
    public static void main(String[] args) { //测试类(有mian 有static)
        Grlefriend gf1=new Grlefriend();//创建对象gf1
        //使用对象
        gf1.age=18;  //访问属性
        gf1.sex="萌妹";
        gf1.name="大美女";
        gf1.weight=90;
        System.out.println(gf1.age);
        System.out.println(gf1.sex);
        System.out.println(gf1.name);
        System.out.println(gf1.weight);
        gf1.eat();   //访问行为
        gf1.sleep();
        gf1.dadouodu();
    }
}
