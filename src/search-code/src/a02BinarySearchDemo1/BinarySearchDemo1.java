package a02BinarySearchDemo1;
//二分法查找 *数据必须是有序的
public class BinarySearchDemo1 {
    public static void main(String[] args) {
        int[]arr={112,115,116,145,154,161};
        int i = binarySearch(arr, 112);
        System.out.println(i);


    }



    public static int binarySearch(int []arr,int number){
        int min=0;
        int max=arr.length-1;
        while (true){
            if(min>max){
                return -1;
            }
            int mid=(min+max)/2;//取中间值
            for (int i = 0; i < arr.length; i++) {
                if(arr[mid]<number){//查找的数字在mid右边,max不变,min=mid+1
                    min=mid+1;
                }
                if(arr[mid]>number){//查找的数字在mid左边,min不变,max=mid-1
                    max=mid-1;
                }
                if(arr[mid]==number){
                    return mid;
                }
            }
        }
    }
}
