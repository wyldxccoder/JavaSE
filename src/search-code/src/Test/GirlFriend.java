package Test;

public class GirlFriend {
    private String name;
    private int age;
    private int hight;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, int hight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
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
     * @return hight
     */
    public int getHight() {
        return hight;
    }

    /**
     * 设置
     * @param hight
     */
    public void setHight(int hight) {
        this.hight = hight;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + ", hight = " + hight + "}";
    }
}
