package a02staticdemo2;
//static 表示静态,是Java的一个修饰符,可修饰成员方法(静态方法),成员变量(静态变量)
//静态方法特点1.多用在测试类和工具类中
//工具类
public class TestDemo {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        String str = ArrayUtil.printArr(arr1);
        System.out.println(str);
        double arr2[]={1.1,1.2,1.3};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println(average);
    }
}
class ArrayUtil {
    //私有化构造方法
    private ArrayUtil() {
    }

    //定义静态方法,方便调用
    public static String printArr(int arr[]) {
        StringBuilder sb = new StringBuilder();//创建对象
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
            String str = sb.toString();
        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double arr[]) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum / arr.length;

    }

    class TestDemo {
        public static void main(String[] args) {
            int []arr1 = {1, 2, 3, 4, 5};
            String str = ArrayUtil.printArr(arr1);
            System.out.println(str);
            double []arr2 = {1.1, 1.2, 1.3};
            double average = ArrayUtil.getAverage(arr2);
            System.out.println(average);
        }
    }
}
