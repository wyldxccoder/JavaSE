package a04interfacedemo4;
//匿名内部类   包含了继承或者实现,方法重写,创建对象
/*匿名内部类的格式
new 类名或者接口名(){
重写方法
};
 */
public class Test {
    public static void main(String[] args) {
       new  Swim(){

           @Override
           public void swim() {
               System.out.println("重写了swim方法");
           }
       };
       new Animal(){

           @Override
           public void eat() {
               System.out.println("重写了eat方法");
           }
       };



    }
}
