package a01CollectionDemo1;

import java.util.ArrayList;
import java.util.Collection;

//Lambda遍历
public class CollectionDemo4 {
    public static void main(String[] args) {
        Collection <String>coll=new ArrayList<>();
        coll.add("ddd");
        coll.add("ccc");
        coll.add("xxx");
        coll.add("aaa");
        //内名内部类
        /*coll.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        //lambda
        coll.forEach( s-> System.out.println(s));

    }

}
