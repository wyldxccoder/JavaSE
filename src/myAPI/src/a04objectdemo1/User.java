package a04objectdemo1;

import java.util.StringJoiner;
//Cloneable
//如果一个接口里面没有抽象方法
//表示当前接口是一个标志性接口
//现在Cloneable表示一旦了实现,那么当前类的对象就可以被克隆
//如果没有实现,就不能被克隆
public class User implements Cloneable{
    private  int id;
    private  String username;
    private  String password;
    private  String path;
    private  int[]data;
    public User(){}

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "User{id = " + id + ", username = " + username + ", password = " + password + ", path = " + path + ", data = " +arrtostring()+ "}";
    }
    public String arrtostring(){
        StringJoiner sj=new StringJoiner(",","[","]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i]+" ");
        }return sj.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //调用父类中的克隆方法
        return super.clone();
    }
}
