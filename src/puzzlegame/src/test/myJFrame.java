package test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myJFrame {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();
        //设置界面的宽高
        jFrame.setSize(603,680);
        //设置界面的标题
        jFrame.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(3);
        //取消默认的居中放置,只有取消了才会按照xy轴的形式添加组件
        jFrame.setLayout(null);
        //创建一个按钮对象
        JButton jbt=new JButton("点我啊");
        //设置位置和宽高
        jbt.setBounds(0,0,100,50);
        //给按钮添加动作监听
        //jbt.addActionListener表示我给组件添加那个事件监听(动作监听包括鼠标左键点击,空格)
        jbt.addActionListener(new ActionListener() {//当接口或继承只用一次时一般用匿名内部类
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("不要点我哦");
            }
        });
        //把按钮添加到界面当中
        jFrame.getContentPane().add(jbt);
        //让整个界面显示出来
        jFrame.setVisible(true);

    }
}
