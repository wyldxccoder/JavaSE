package test;
//动作事件  动作监听
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class myJFrame1 extends JFrame implements ActionListener {
    //创建一个按钮对象
    JButton jbt1=new JButton("点我啊");
    JButton jbt2=new JButton("再点我啊");
    public myJFrame1() {
        //设置界面的宽高
        this.setSize(603, 680);
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


        //设置位置和宽高
        jbt1.setBounds(0, 0, 100, 50);
        jbt2.setBounds(100, 0, 100, 50);
        //给按钮绑定动作事件
        jbt1.addActionListener(this);
        jbt2.addActionListener(this);
        //将按钮添加到整个界面中
        this.getContentPane().add(jbt1);
        this.getContentPane().add(jbt2);
        //让整个界面显示出来
        this.setVisible(true);



        }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source=e.getSource();
        if(source==jbt1){
            jbt1.setSize(200,200);

        }else if(source==jbt2){
            Random r=new Random();
            jbt2.setSize(r.nextInt(500),r.nextInt(500));
        }
    }
}
