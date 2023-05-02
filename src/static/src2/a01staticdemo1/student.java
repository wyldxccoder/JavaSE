package a01staticdemo1;
//static 表示静态,是Java的一个修饰符,可修饰成员方法(静态方法),成员变量(静态变量)
//静态变量特点:1.被所有对象共享2.不属于对象,属于类3.随着类的加载而加载,优先于对象
public class student {
    private String name;
    private  int age;
    private String gender;
    public static String teatername;
    public student() {
    }

    public student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }
    //方法
    public void show(){
        System.out.println(name+" "+age+" "+gender+" "+teatername);
    }
    public void study(){
        System.out.println(name+"在学习");
    }

    public String toString() {
        return "student{name = " + name + ", age = " + age + ", gender = " + gender + "}";
    }
}
