package day3;

public class ArrayDemo1静态存储 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6,7,8,9,10};
        int cont=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2!=0){
             arr[i] =arr[i]*2;
                System.out.println("该数为奇数,扩大两倍后为"+arr[i]);
            }else {
              arr[i]=  arr[i]/2;
                System.out.println("该数为偶数,缩小两倍后为"+arr[i]);
            }

        }




        }
    }

