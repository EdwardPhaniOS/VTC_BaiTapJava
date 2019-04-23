/**
 * Chuong6Bai3
 */
public class Chuong6Bai3 {

    public static void main(String[] args) {
        boolean result = isTriangle(3, 4 , 5);
        System.out.println("Result: " + result);
    }

    public static boolean isTriangle(int a, int b, int c) 
    {
        if (a + b < c || a + c < b || b + c < a || a < 0 || b < 0 || c < 0) {
            return false;
        } else {
            return true;
        }   
    }
}