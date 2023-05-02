package a04objectdemo1;
//clone

//浅克隆,把所有的东西都克隆
//深克隆,把基本数据类型克隆,数组,创建新的地址存放,字符串在串池复用
public class ObjectDemo3 {
    public static void main(String[] args) throws CloneNotSupportedException {

        //创建对象
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        User u1 = new User(1, "zhangsan", "1234qwer", "meiyou", data);
        //克隆对象
        User u2 = (User) u1.clone();
        int[] data1 = u1.getData();
        data1[0]=100;

        System.out.println(u1);
        System.out.println(u2);
    }
}