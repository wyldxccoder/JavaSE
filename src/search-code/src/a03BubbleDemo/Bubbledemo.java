package a03BubbleDemo;
//冒泡排序
public class Bubbledemo {
    public static void main(String[] args) {
        int []arr={5,4,1,3,2};
        //外循环,一共循环四轮
        for (int i = 0; i < arr.length-1; i++) {
            //内循环,每次循环都比上次少一次
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j]> arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
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

