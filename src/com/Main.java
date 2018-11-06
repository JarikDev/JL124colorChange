package com;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

public class Main {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());
    }
    static class MyComponent extends JComponent {
        @Override
        public void paint(Graphics g) {
            Graphics2D g2 = (Graphics2D) g;
            Ellipse2D e2=new Ellipse2D.Double(0,0,200,100);
            g2.setPaint(new GradientPaint(new Point(0,0),Color.RED,new Point(200,100),Color.YELLOW));
            g2.fill(e2);
        }
    }
    static JFrame getFrame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 250, dimension.height / 2 - 150, 500, 500);
        return jFrame;
    }
}