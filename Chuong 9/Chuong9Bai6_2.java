/**
 * Chuong9Bai6_2
 */
import java.awt.*;
import javax.swing.*;

public class Chuong9Bai6_2 extends Canvas{

    public void boxOval(Graphics g, Rectangle bb) {
        g.fillOval(bb.x, bb.y, bb.width, bb.height);
    }

        public void mickey(Graphics g, Rectangle bb) {
            boxOval(g, bb);

            if (bb.width < 3) {
                return;
            }
        
            int dx = bb.width/2;
            int dy = bb.height/2;
            Rectangle half = new Rectangle(bb.x, bb.y, dx, dy);
        
            half.translate(-dx/2, -dx/2);
            boxOval(g, half);
            mickey(g, half);
            
            half.translate(dx*2, 0);
            boxOval(g, half);
            mickey(g, half);
        }
        
    
        public void paint(Graphics g) {
        Rectangle bb = new Rectangle(100, 150, 200, 200);
        g.setColor(Color.gray);
        mickey(g, bb);
           
        }
    
        public static void main(String[] args) {
        // make the frame
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        // add the canvas
        Canvas canvas = new Chuong9Bai6_2();
            canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
            frame.getContentPane().add(canvas);
    
        // show the frame
            frame.pack();
            frame.setVisible(true);
        }
}