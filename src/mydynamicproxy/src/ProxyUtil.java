import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {

//静态方法
    public static Star createProxy(BigStar bigStar){
        //Proxy.newProxyInstance 产生代理对象的方法
      Star star= (Star) Proxy.newProxyInstance(
                ProxyUtil.class.getClassLoader(),//参数一:用于指定那个类加载器,去加载生成的代理类
                new Class[]{Star.class},//参数二:指定接口,这些接口指定生成的代理是什么,也就是有那些方法
                new InvocationHandler() {
                    @Override//参数三:用来指定生成的代理对象用来干什么
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //参数一:代理的对象
                        //参数二:要运行的方法
                        //参数三:调用方法要传递的实参
                        if("sing".equals(method.getName())){
                            System.out.println("准备话筒,收钱");
                        }else {
                            System.out.println("准备场地,收钱");
                        }
                        return method.invoke(bigStar,args);
                    }
                }
        );
return star;
    }
}
