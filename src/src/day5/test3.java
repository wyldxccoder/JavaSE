package day5;

public class test3 {
    //设计一个方法判断数组中的某一个数是否存在,返回调用值
    ////我想干什么  判断数是否存在
    //我干这件事需要什么才能完成  遍历数组
    //方法是否需要返回? 是
    public static void main(String[] args) {
        int arr[]={15,23,45,60,17,25};//定义原数组
        contains(arr,15);
        System.out.println(contains(arr,16));
    }
    public static boolean contains( int arr[], int num){   //定义一个方法
        for (int i = 0; i < arr.length; i++) {
            if(num==arr[i]){
             return true;//发现存在输出true
            }
        }return false;//遍历完所有数值,没有存在,输出false

    }
}
