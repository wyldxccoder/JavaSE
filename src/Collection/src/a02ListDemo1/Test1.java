package a02ListDemo1;

public class Test1 {
    public static void main(String[] args) {
        MyArrylist<String> list=new MyArrylist<>();
        list.add("ddd");
        list.add("xxx");
        list.add("ccc");
        System.out.println(list);
        MyArrylist<Integer>list1=new MyArrylist<>();
        list1.add(111);
        list1.add(222);
        list1.add(333);
        System.out.println(list1);
    }
}
