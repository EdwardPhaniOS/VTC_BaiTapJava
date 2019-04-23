/**
 * Chuong9Bai6
 */

import java.awt.*;
import javax.swing.*;

public class Chuong9Bai6 extends Canvas {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Japan Flag");
        Canvas canvas = new Chuong9Bai6();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        canvas.setSize(800, 400);
        canvas.setBackground(Color.white);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(250, 50, 300, 300);
    }
}