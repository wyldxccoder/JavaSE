package a05InsertDemo;
//插入排序   扑克牌,先找一个有序的,然后往里面插入
public class InsertDemo {
    public static void main(String[] args) {
        int []arr={3,44,38,5,15,16,26,54,22};
        int starindex=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>arr[i+1]){
                 starindex=i+1;
                break;
            }//找到起始索引
        }
        for (int i = starindex; i < arr.length; i++) {//第一次循环
            // 找到一共需要插序的数据个数
            int j=i;
            for ( j = j; j > 0; j--) {// 第二次循环 插入排序
                if(arr[j]<arr[j-1]){
                   int temp= arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
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
