package top.horon.demo1;

import java.awt.*;

public class TestFrame {
    public static void main(String[] args) {
        //Frame
        Frame frame = new Frame("Minecraft Java Edition multiplayer");
        //设置可见性
        frame.setVisible(true);
        //设置窗口大小
        frame.setSize(800,400);
        //设置背景颜色
        Color color = new Color(237, 97, 97);
        frame.setBackground(color);
        //弹出的初始位置
        frame.setLocation(500,500);
        //设置大小固定
        frame.setResizable(false);
    }
}
