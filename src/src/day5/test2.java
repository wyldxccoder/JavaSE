package day5;

public class test2 {
        //设计一个方法求数组的最大值,并返回最大值
        //我想干什么  求最大值
        //我干这件事需要什么才能完成 获取数组
        //方法是否需要返回? 是
        public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        getMax(arr);
        System.out.println(getMax(arr));
    }

    public static int getMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];

            }

        }
        return max;//返回调用值
    }
}