package a03SetDemo1;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private String mane;
    private int age;

    public Student() {
    }

    public Student(String mane, int age) {
        this.mane = mane;
        this.age = age;
    }

    /**
     * 获取
     * @return mane
     */
    public String getMane() {
        return mane;
    }

    /**
     * 设置
     * @param mane
     */
    public void setMane(String mane) {
        this.mane = mane;
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





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(mane, student.mane);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mane, age);
    }

    public String toString() {
        return "Student{mane = " + mane + ", age = " + age + "}";
    }

    @Override
    public int compareTo(Student o) {
        return this.getAge()-o.getAge();

    }
}
