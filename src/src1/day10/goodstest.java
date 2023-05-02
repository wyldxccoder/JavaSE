package day10;

public class goodstest {
    public static void main(String[] args) {
        goods []arr=new goods[3]; //创建一个数组
        goods g1=new goods("001","华为手机",5999,50);//创建对象
        goods g2=new goods("002","小米手机",3999,60);
        goods g3=new goods("003","oppo手机",2999,70);
      arr[0]=g1;//将商品插入数组中
      arr[1]=g2;
      arr[2]=g3;
        for (int i = 0; i < arr.length; i++) {
            goods goods=arr[i];
            System.out.println(goods.getId()+" "+goods.getName()+" "+goods.getPrice()+" "+goods.getCount());

        }


    }
}
