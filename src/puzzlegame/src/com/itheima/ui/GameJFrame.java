package com.itheima.ui;
//1.创建一个游戏的主界面

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //创建二维数组
    int [][]data=new int[4][4];
    //记录空白方块在数组中的位置
    int x=0;
    int y=0;
    //定义一个变量记录图片路径
    String path="C:\\Users\\30804\\Dreameveryday\\puzzlegame\\image\\animal\\animal4\\";//在此修改玩的图片
    int [][]win={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,0},
    };
    //定义变量记录步数
    int step=0;
    //创建选项对象上面的条目对象
    JMenuItem replayItem=new JMenuItem("重新游戏");
    JMenuItem reloginItem=new JMenuItem("重新登录");
    JMenuItem closeItem=new JMenuItem("关闭游戏");
    JMenuItem lovephoneItem=new JMenuItem("神秘照片");
    public  GameJFrame(){
        //初始化界面
        initJFrame();
        //初始化菜单
        initJMenuBar();
        //初始化数据(打乱)
        initData();
        //初始化图片(打乱后去加载数据)
        initImage();
        //让界面最后显示出来
        this.setVisible(true);
    }

    //初始化数据(打乱)
    private void initData() {
        //1定义一个一维数组
        int[]tempArr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        //2获取索引
        Random R=new Random();
        //打乱
        for (int i = 0; i < tempArr.length; i++) {
            int  index = R.nextInt(tempArr.length);
            int temp=tempArr[i];
            tempArr[i]=tempArr[index];
            tempArr[index]=temp;
        }

        //将打乱的数据存入二维数组中

        for (int i = 0; i < tempArr.length; i++) {
            if(tempArr[i]==0){
                x=i/4;
                x=i%4;
            }
                data[i/4][i%4]=tempArr[i];
            }


        }



    //初始化图片(打乱后去加载数据)
    private void initImage() {
        //清空原有的所有图片
        this.getContentPane().removeAll();
        if (victory()){
            //显示胜利图标
            JLabel winjlabel=new JLabel(new ImageIcon("C:\\Users\\30804\\Dreameveryday\\puzzlegame\\image\\win.png"));
            winjlabel.setBounds(203,283,197,73);
            this.getContentPane().add(winjlabel);
        }
        JLabel stepjlabel=new JLabel("步数"+step);
        stepjlabel.setBounds(50,30,100,20);
        this.getContentPane().add(stepjlabel);
        //外循环---内循环重复执行4次
       for (int i = 0; i < 4; i++) {
           for (int j = 0; j < 4; j++) {
               //获取当前要加载的图片序号
               int num=data[i][j];
               //创建一个JLabel的对象(管理容器)
               JLabel jLabel=new JLabel(new ImageIcon(path+num+".jpg"));
               //指定图片位置
               jLabel.setBounds(105*j+83,105*i+134,105,105);
               //给图片添加边框
               jLabel.setBorder(new BevelBorder(0));
               //把容器添加到界面中
               this.getContentPane().add(jLabel);

           }
       }
        //添加背景图片(先添加的在上方)
        JLabel background=new JLabel(new ImageIcon("C:\\Users\\30804\\Dreameveryday\\puzzlegame\\image\\background.png"));
        background.setBounds(40,40,508,560);
        //把背景图片添加到界面当中
        this.getContentPane().add(background);
        //刷新界面
        this.getContentPane().repaint();






    }

    //初始化菜单
    private void initJMenuBar() {

        //创建整个的菜单对象
        JMenuBar jMenuBar=new JMenuBar();
        //创建菜单对象上面的选项对象(功能,选项)
        JMenu functionJMenu=new JMenu("功能");
        JMenu aboutJMenu=new JMenu("关于我们");

        //将条目对象添加到选项对象中
        functionJMenu.add(replayItem);
        functionJMenu.add(reloginItem);
        functionJMenu.add(closeItem);
        aboutJMenu.add(lovephoneItem);
        //给条目绑定事件
        replayItem.addActionListener(this);
        reloginItem.addActionListener(this);
        closeItem.addActionListener(this);
        lovephoneItem.addActionListener(this);

        //将选项对象添加到菜单对象中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }
    //初始化界面
    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消默认的居中放置,只有取消了才会按照xy轴的形式添加组件
        this.setLayout(null);
        //给整个绑定键盘事件
        this.addKeyListener(this);



    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
    //按下a不松时调用这个方法

    @Override
    public void keyPressed(KeyEvent e) {
        int code=e.getKeyCode();
        if(code==65){
            //把界面中所有的图片全部删除
            this.getContentPane().removeAll();
            //加载第一张完整照片
            JLabel all=new JLabel(new ImageIcon(path+"all.jpg"));
            all.setBounds(83,134,420,420);
            this.getContentPane().add(all);
            //加载背景图片
            JLabel background=new JLabel(new ImageIcon("C:\\Users\\30804\\Dreameveryday\\puzzlegame\\image\\background.png"));
            background.setBounds(40,40,508,560);
            //把背景图片添加到界面当中
            this.getContentPane().add(background);
            //刷新界面
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(victory()){
            return;
        }
        int code=e.getKeyCode();
        if(code==37){
            //把空白方块右数字往左移动
            System.out.println("向左移动");
            if(y==3){
                return;
            }
            data[x][y]=data[x][y+1];
            data[x][y+1]=0;
            y++;
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        }else if(code==38){
            //把空白方块右数字往上移动
            System.out.println("向上移动");
            if(x==3){
                return;
            }
            data[x][y]=data[x+1][y];
            data[x+1][y]=0;
            x++;
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        }else if(code==39){
            //把空白方块右数字往右移动
            System.out.println("向右移动");
            if(y==0){
                return;
            }
            data[x][y]=data[x][y-1];
            data[x][y-1]=0;
            y--;
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        }else if (code==40){
            //把空白方块右数字往下移动
            System.out.println("向下移动");
            if(x==0){
                return;
            }
            data[x][y]=data[x-1][y];
            data[x-1][y]=0;
            x--;
            step++;
            //调用方法按照最新的数字加载图片
            initImage();
        }else if(code==65){
            initImage();
        }else if(code==87){
            data=new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0},
            };
            initImage();
        }

    }
    public boolean victory(){
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j]!=win[i][j]){
                    return false;
                }
            }
        }return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj=e.getSource();
        if(obj==replayItem){
            System.out.println("重新游戏");
            //计步器清零
            step=0;
            //再次打乱二维数组中的数据
            initData();
            //重新加载图片
            initImage();
        }else if(obj==reloginItem){
            System.out.println("重新登录");
            //关闭当前游戏
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();
        }else if(obj==closeItem){
            System.out.println("关闭游戏");
            //直接关闭虚拟机
            System.exit(0);
        }else if(obj==lovephoneItem){
            System.out.println("神秘照片");
            JDialog jDialog=new JDialog();
            JLabel jLabel=new JLabel(new ImageIcon("C:\\Users\\30804\\Dreameveryday\\puzzlegame\\love\\微信图片_202211191207324.jpg"));
            jLabel.setBounds(0,0,1280,1710);
            jDialog.getContentPane().add(jLabel);

            jDialog.setSize(1200,1400);
            jDialog.setAlwaysOnTop(true);
            jDialog.setLocationRelativeTo(null);
            jDialog.setModal(true);
            //设置关闭模式
            this.setDefaultCloseOperation(3);
            jDialog.setVisible(true);
        }

    }
}
