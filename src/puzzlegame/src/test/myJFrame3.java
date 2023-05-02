package test;
//键盘事件 键盘监听
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class myJFrame3 extends JFrame implements KeyListener {
    //创建一个按钮对象
    JButton jbt=new JButton("点我啊");
    public myJFrame3() {
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
        jbt.setBounds(0, 0, 100, 50);
        //给按钮绑定键盘事件
       jbt.addKeyListener(this);
        //把按钮添加到整个界面当中
        this.getContentPane().add(jbt);
        //让整个界面显示出来
        this.setVisible(true);
}

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按住键盘");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开键盘");
        //获取键盘上每一个按键的编号
        int code=e.getKeyCode();
        if(code==65){
            System.out.println("现在按的A");
        }else if(code==66){
            System.out.println("现在按的是B");
        }
    }
}

