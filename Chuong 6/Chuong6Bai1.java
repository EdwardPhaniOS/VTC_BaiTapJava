/**
 * Chuong6Bai1
 */
public class Chuong6Bai1 {

    public static void main(String[] args) 
    {
        boolean result = isDivisible(6, 2);
        System.out.println(result);
    }

    public static boolean isDivisible(int n, int m) 
    {
        if (m != 0 && n % m == 0) {
            return true; 
        } else {
            return false; 
        }
    }
}