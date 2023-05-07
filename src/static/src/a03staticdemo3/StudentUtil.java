package a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    //私有化构造方法
    private StudentUtil(){}
    //定义静态方法,方便调用
    public static int getMaxAgeStudent(ArrayList<Student> list){
        int Max = list.get(0).getAge();
        for (int i = 0; i < list.size(); i++) {
            int tempAge = list.get(i).getAge();
            if(tempAge>Max){
                Max=tempAge;
            }
        }
        return Max;
    }



}
