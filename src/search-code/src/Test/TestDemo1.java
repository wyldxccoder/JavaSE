package Test;

import java.util.Arrays;

public class TestDemo1 {
    public static void main(String[] args) {
        GirlFriend g1=new GirlFriend("DDD",18,167);
        GirlFriend g2=new GirlFriend("XXX",19,172);
        GirlFriend g3=new GirlFriend("CCC",19,178);
        GirlFriend[]arr={g1,g2,g3};
//匿名内部类,或者lembda表达式o1-o2升序,o2-o1降序
        //字符串做比较用compareTo
        Arrays.sort(arr, (GirlFriend o1, GirlFriend o2)-> {
           int temp=o1.getAge()-o2.getAge();
           temp = temp == 0 ? o1.getHight() - o2.getHight() : temp;
           temp = temp == 0 ? o1.getName() .compareTo(o2.getName()) : temp;
                if(temp>0){
                    return 1;
                }

                if (temp==0){
                    return 0;
                }
                return -1;

        });
        System.out.println(Arrays.toString(arr));

    }
}
