package day8;
//标准的Javabean类
public class User {
    //属性
    private String username;
    private String password;
    private String emial;
    private String gender;
    private int age;
    //空参构造
    public User(){
    }
    //带全部参数的构造
    public User(String username,String password,String emial,String gender,int age){
        this.age=age;
        this.username=username;
        this.password=password;
        this.emial=emial;
        this.gender=gender;
    }
    //方法
    public void setUsername(String username){
        this.username=username;
    }
    public String getUsername(){
        return username;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public String getPassword(){
        return password;
    }
    public void setEmial(String emial){
        this.emial=emial;
    }
    public String getEmial(){
        return  emial;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public String getGender(){
        return gender;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return age;

    }
}
