package a05extends;

public class Test {
    public static void main(String[] args) {
        Tutor t=new Tutor("heima001","王云龙");
        System.out.println(t.getId()+" "+t.getName());
        t.work();
        AdminStaff a=new AdminStaff("heima002","董晓畅");
        System.out.println(a.getId()+" "+a.getName());
        a.work();
    }
}
