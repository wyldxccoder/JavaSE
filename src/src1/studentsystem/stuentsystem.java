package studentsystem;

import java.util.ArrayList;
import java.util.Scanner;

public class stuentsystem {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<student>list=new ArrayList<>();
       loop: while (true) {
            System.out.println("------------学生管理系统-------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择");
            Scanner sc=new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1"-> addstudent(list);
                case "2"-> deletestudent(list);
                case "3"->updetestudent(list);
                case "4"-> chaxunstudent(list);
                case "5"-> {System.out.println("退出");
                    break loop;//跳出整个循环,而不是switch循环

                }
                default -> System.out.println("没有这个选项");
            }
        }

    }


    //1.添加学生
    public static void addstudent(ArrayList<student>list){
        System.out.println("添加学生");
        //创建学生对象
        student stu=new student();
        Scanner sc=new Scanner(System.in);
        while (true) {
            System.out.println("请输入学生id");
            String id = sc.next();
            //调用contain方法判断id是否存在
            boolean falge = contain(list, id);
            if(falge){
                //表示id已经存在,需要重新录入
                System.out.println("id已经存在,需要重新录入");
            }else   {
                //表示id不存在,可以录入
                stu.setId(id);
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.next();
        stu.setName(name);
        System.out.println("请输入学生年龄");
        int age = sc.nextInt();
        stu.setAge(age);
        System.out.println("请输入学生家庭住址");
        String address = sc.next();
        stu.setAddress(address);
        //添加学生对象到集合
        list.add(stu);
        System.out.println("学生信息添加成功");
    }




    //2.删除学生
    public static void deletestudent(ArrayList<student>list){
        System.out.println("删除学生");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要删除学生的id");
        String id = sc.next();
        //调用getindex方法获取学生id索引
        int index = getindex(list,id);
        if(index>=0){
            //根据id删除学生对象
            list.remove(index);
            System.out.println("id为"+id+"的学生信息删除成功");
        }else {
            System.out.println("id不存在,删除失败");
        }

    }

    //3.修改学生
    public static void updetestudent(ArrayList<student>list){
        System.out.println("修改学生");
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改学生的id");
        String id = sc.next();
        //调用getindex方法获取学生id索引
        int index = getindex(list, id);
        if(index==-1){
            System.out.println("id不存在,请重新输入");
            //返回重新开始这个方法
            return;
        }
        //修改学生信息
        student stu = list.get(index);
        System.out.println("请输入要修改的学生姓名");
        String newname = sc.next();
        stu.setName(newname);
        System.out.println("请输入要修改的学生年龄");
        int newage = sc.nextInt();
        stu.setAge(newage);
        System.out.println("请输入要修改的学生家庭住址");
        String newaddress = sc.next();
        stu.setAddress(newaddress);
        System.out.println("修改成功");
    }
    //4.查询学生
    public static void chaxunstudent(ArrayList<student>list){
        System.out.println("查询学生");
        if(list.size()==0){
            System.out.println("当前无学生信息,请添加后再来查询");
            return;//重新开始这个方法
        }
        System.out.println("id\t\t姓名\t年龄\t家庭地址");
        for (int i = 0; i < list.size(); i++) {
            //遍历每个对象
            student stu = list.get(i);
            System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
        }
    }

    //5.查询id是否唯一
    public static boolean contain(ArrayList<student>list,String id){
        for (int i = 0; i < list.size(); i++) {
            //遍历学生对象
            student stu = list.get(i);
            //比较id是否存在存在返回ture
            if(stu.getId().equals(id)){
                return true;
            }
            //不存在返回false
        }return false;
    }
    //6.获取id索引
    public static int getindex(ArrayList<student>list,String id){
        for (int i = 0; i < list.size(); i++) {
            //遍历学生对象
            student stu = list.get(i);
            //比较id是否存在存在返回i
            if(stu.getId().equals(id)){
                return i;
            }
            //不存在返回-1
        }return -1;
    }

}

