package a03threadcase1;
//实现Callable接口 有泛型(接收的数据)
import java.util.concurrent.Callable;

public class MyCallable implements Callable <Integer>{
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i <= 100; i++) {
            sum=sum+i;
        }
        return sum;
    }
}
