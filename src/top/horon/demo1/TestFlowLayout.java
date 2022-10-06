package top.horon.demo1;

import java.awt.*;

public class TestFlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //组建-按钮
        Button button1 = new Button("鸡你");
        Button button2 = new Button("太美");
        Button button3 = new Button("114514");
        //设置为流试布局
        //frame.setLayout(new FlowLayout());
        frame.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.setSize(200,200);
        frame.setVisible(true);
        //把按钮添加上去
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

    }
}
