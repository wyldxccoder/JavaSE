package a02extends;
//成员变量的调用特点
public class a02extendsDemotest {
    public static void main(String[] args) {
        zi zi=new zi();
        zi.zishow();
    }

}
class fu{
    String name="fu";
}
class zi extends fu {
    String name="zi";//成员变量
    public  void zishow(){//成员方法
        String name="zishow";
        System.out.println(name);//zishow ,就近原则,离谁近选谁
        System.out.println(this.name);//zi,从本类中找,若没有离谁近选谁
        System.out.println(super.name);//fu,从父类中找,若没有离谁近选谁
    }
}

