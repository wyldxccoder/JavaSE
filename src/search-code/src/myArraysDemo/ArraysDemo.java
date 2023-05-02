package myArraysDemo;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        System.out.println("------------toString------------");
        //toString:将数组转化为字符串
        int []arr={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------binarySearch-----------");
        //binarySearch:二分查找法,数组必须有序
        System.out.println(Arrays.binarySearch(arr, 6));
        System.out.println("-----------copyOf-------------");
        //copyOf:拷贝数组 长度大于原数组,补充0;
        int []arr1=Arrays.copyOf(arr,10);
        System.out.println(Arrays.toString(arr1));
        System.out.println("----------copyOfRange--------------");
        //copyOfRange:拷贝数组  包头不包尾,包左不包右
        int []arr2=Arrays.copyOfRange(arr,0,4);
        System.out.println(Arrays.toString(arr2));
        System.out.println("-------------fill-----------");
        //填充  默认填充0
        Arrays.fill(arr,1);
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------sort-----------");
        //快速排序
        int[]arr3={1,5,4,6,7,9,8,2,3};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        System.out.println("-------------sort-----------");
        //自定义排序,o1-o2,升序,o2-o1,降序
        Integer []arr4={1,5,4,6,7,9,8,2,3};
        /*Arrays.sort(arr4, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }

        });*/
        //Lambda完整格式
        /*Arrays.sort(arr4, (Integer o1, Integer o2)-> {
                    return o2-o1;
                }

        );*/


        //Lambda简化格式
        Arrays.sort(arr4,(o1,o2)->o2-o1);
        System.out.println(Arrays.toString(arr4));

    }
}
