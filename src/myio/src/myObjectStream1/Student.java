package myObjectStream1;

import java.io.Serializable;
////需要让javabean类实现Serializable接口
public class Student implements Serializable{
   //设置版本号
    //修改Javabean类,不会出现异常
    private static final long serialVersionUID = 3628034917421196603L;
    private  String name;
    private  int age;
    //transient 瞬态关键字
    //作用:不会把当前属性序列化到本地文件中
    private transient String address;


    public Student() {
    }

    public Student( String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return " {, name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
