package top.horon.demo1;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//可以看做一个空间，但是不能单独纯在
public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //布局的概念
        Panel panel = new Panel();
        //设置布局
        frame.setLayout(null);
        //坐标
        frame.setBounds(300,300,500,500);
        frame.setBackground(new Color(28, 144, 209));
        //panel设置坐标，相对于frame
        panel.setBounds(60,80,400,400);
        panel.setBackground(new Color(28, 186, 186));
        //frame.add(panel)
        frame.add(panel);
        frame.setVisible(true);
        //监听时间，监听的窗口关闭时间
        //适配器模式
        frame.addWindowListener(new WindowAdapter() {
            //窗口关闭的时候需要做的事情
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
