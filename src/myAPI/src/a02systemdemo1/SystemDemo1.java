package a02systemdemo1;

public class SystemDemo1 {
    public static void main(String[] args) {
        //0表示虚拟机正常停止
        //非0表示虚拟机异常停止
        System.exit(0);
         System.out.println("看看我有没有执行");

        //返回系统时间,以毫米计算
        long l = System.currentTimeMillis();
        System.out.println(l);
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        //拷贝数组 把arr1数据拷贝到arr2中
        //参数一:数据源,要拷贝的数据从那个数组而来
        //参数二:从数据源数组中的第几个索引开始拷贝
        //参数三:目的地,我要把数据拷贝到那个数组中
        //参数四:目的地数组的索引
        //参数五:拷贝的个数
        //细节:1.如果数据源数组和目的地数组都是基本数据类型,那么两者的数据类型必须一致
        //2.在拷贝的时候需要考虑数组的长度
        //3.如果数据源数组和目的地数组都是引用数据类型,那么子类可以赋值给父类类型

        System.arraycopy(arr1,0,arr2,0,10);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");

        }
    }
}
