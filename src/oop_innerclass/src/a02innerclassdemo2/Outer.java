package a02innerclassdemo2;
//成员内部类
public class Outer {
    private int a=10;
    public class Inner{
        private int a=20;
        public void show(){
            int a=30;
            //Outer.this 获取外部类对象的地址值
            System.out.println(a);//30
            System.out.println(this.a);//20
            System.out.println(Outer.this.a);//10
        }
    }
}
