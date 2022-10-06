package top.horon.demo1;

import java.awt.*;

public class TestFrame2 {
    public static void main(String[] args) {
        //展示多个窗口
        MyFrame myFrame1 = new MyFrame(100, 100, 200, 200, Color.RED);
        MyFrame myFrame2 = new MyFrame(300, 100, 200, 200, Color.GREEN);
        MyFrame myFrame3 = new MyFrame(100, 300, 200, 200, Color.BLUE);
        MyFrame myFrame4 = new MyFrame(300, 300, 200, 200, Color.YELLOW);
    }
}

class MyFrame extends Frame{
    static int id = 0;//可能存在多个窗口id，所以要有一个计数器
    public MyFrame(int x,int y,int w ,int h,Color color){
        super("MyFrame"+(++id));
        setBackground(color);
        setBounds(x,y,w,h);
        setVisible(true);
    }
}
