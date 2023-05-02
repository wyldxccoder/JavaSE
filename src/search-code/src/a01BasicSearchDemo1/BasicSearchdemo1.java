package a01BasicSearchDemo1;
//顺序查找
public class BasicSearchdemo1 {
    public static void main(String[] args) {
        int []arr={1,2,4,8,9,10};
        boolean b = basicSearch(arr, 10);
        System.out.println(b);

    }
    public static boolean basicSearch(int arr[],int nmuber){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==nmuber){
                return true;
            }
        }
        return false;
    }
}
