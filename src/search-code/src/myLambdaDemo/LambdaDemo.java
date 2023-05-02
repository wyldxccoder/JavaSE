package myLambdaDemo;
//Lambda
import java.util.Arrays;

public class LambdaDemo {
    public static void main(String[] args) {
        String[]arr={"aaa","a","aa","aaaa"};
        /*Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });*/
        //Lambda完整格式
        /*Arrays.sort(arr, (String o1, String o2)-> {
                    return o1.length()-o2.length();
                }
        );*/
        //Lambda简化格式
        Arrays.sort(arr,(o1,o2)->o1.length()-o2.length());

        System.out.println(Arrays.toString(arr));

    }

}
