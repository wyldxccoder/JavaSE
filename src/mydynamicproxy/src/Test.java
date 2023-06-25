public class Test {
    //动态代理  应用面向切面编程 AOP. 优点:无侵入式修改代码,容易维护
    public static void main(String[] args) {
        //创建大明星的对象
        BigStar bigStar=new BigStar("鸡哥");
        //获取代理的对象 (静态方法 类名.方法)
        Star proxy = ProxyUtil.createProxy(bigStar);
        String dance = proxy.dance("坤舞");
        System.out.println(dance);
        proxy.sing("只因你太美");
    }
}
