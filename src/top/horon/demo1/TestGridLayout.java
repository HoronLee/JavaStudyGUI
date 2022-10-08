package top.horon.demo1;

import java.awt.*;

public class TestGridLayout {
    public static void main(String[] args) {
        Frame frame = new Frame("TestGridLayout");
        Button but1 = new Button("but1");
        Button but2 = new Button("but2");
        Button but3 = new Button("but3");
        Button but4 = new Button("but4");
        Button but5 = new Button("but5");
        Button but6 = new Button("but6");
        frame.setLayout(new GridLayout(3,2));
        frame.add(but1);
        frame.add(but2);
        frame.add(but3);
        frame.add(but4);
        frame.add(but5);
        frame.add(but6);
        frame.setVisible(true);
        frame.pack();
    }
}
