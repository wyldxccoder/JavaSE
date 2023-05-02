package day5;

public class test1 {
        //设计一个方法数组遍历,要求遍历的结果是在同一行上的 如[1,2,3,4,5]
       // System.out.println("abc");//先打印abc,然后换行
       // System.out.print("abc");//只打印abc,不换行
       // System.out.println();//不打印任何数据,只做换行
        public static void main(String[] args) {
        int arr[]={1,2,3,4,5};//定义一个数组
        printArr(arr);
    }
    //我想干什么  遍历数组
    //我干这件事需要什么才能完成  获取数组
    //方法是否需要返回?  不
    public static void printArr( int arr[]){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }


        }
        System.out.println("]");
    }
}
