package day7;
//private 权限修饰符
public class man1 {
    //属性
    private String name;
    private int age;
    private String gender;

    //对于每一个私有化成员变量,都要有提供set和get方法
    //set方法:给成员变量赋值
    //get方法:对外提供成员变量的值

    //方法
    public void setName(String name){   //给成员变量name赋值
        //局部变量表示测试类中调用方法传递过来的数据
        //等号左边:就表示成员位置的name
        this.name=name;
    }

    public String getName(){        //对外提供成员变量name的值
        return name;
    }
    public void setAge(int age){     //给成员变量age赋值
        if(age<=50&&age>=18){
        this.age=age;
        }else {
            System.out.println("非法参数");
        }
    }
    public int getAge(){                //对外提供成员变量age的值
        return age;
    }
    public void setGender(String gender){    //给成员变量gender赋值
        this.gender=gender;
    }
    public String getGender(){            //对外提供成员变量gender的值
        return gender;
    }


}
