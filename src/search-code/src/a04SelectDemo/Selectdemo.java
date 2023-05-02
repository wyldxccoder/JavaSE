package a04SelectDemo;
//选择排序
public class Selectdemo {
    public static void main(String[] args) {
        int []arr={5,4,1,3,2};
        //外循环,一共循环四轮
        for (int i = 0; i < arr.length-1; i++) {
            //内循环,拿i和i后面的数字比较交换
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]> arr[j]){
                    int temp= arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        print(arr);

    }
    private static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
