/**
 * Chuong9Bai3
 */

import java.awt.Rectangle;
import java.awt.Point;
public class Chuong9Bai3 {

    public static void printPoint(Point p) 
    { 
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width/2; 
        int y = box.y + box.height/2; 
        return new Point(x, y);
    }

    public static void main(String[] args) {
    Rectangle box1 = new Rectangle(2, 4, 7, 9);
    Point p1 = findCenter(box1); 
    printPoint(p1); 
    
    box1.grow(1, 1); //(1, 3, 9, 11)
    Point p2 = findCenter(box1); //(5.5, 8.5)
    printPoint(p2);
    }

}

//KQ:
//(5, 8)
//(5, 8)


//p1 và p2 không cùng bí danh vì p2 sẽ không thay đổi dù p1 đã thay đổi