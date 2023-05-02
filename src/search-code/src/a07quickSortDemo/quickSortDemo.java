package a07quickSortDemo;
//快速排序 找基数,比基数大的排在基数右边,比基数小的排在基数左边
public class quickSortDemo {
    public static void main(String[] args) {
        int[] arr = {2, 5, 4,8, 6, 3, 1, 7, 9};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void quickSort(int[] arr, int i, int j) {

        int star = i;
        int end = j;
        if(star>end){
            return;
        }
        int basenumber = arr[i];
        //利用循环找出要交换的数字
        while (star != end) {
            //利用end从后往前找比基数小的数字
            while (true) {
                if (end <= star || arr[end] < basenumber) {
                    break;
                }
                end--;
            }
            //利用star从前往后找比基数大的数字
            while (true) {
                if (end <= star || arr[star] > basenumber) {
                    break;
                }
                star++;
            }
            int temp=arr[star];
            arr[star]=arr[end];
            arr[end]=temp;
        }
        int temp=arr[i];
        arr[i]=arr[star];
        arr[star]=temp;
        quickSort(arr,i,star-1);//递归
        quickSort(arr,star+1,j);

    }
}