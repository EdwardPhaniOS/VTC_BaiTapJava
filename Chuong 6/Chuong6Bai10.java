/**
 * Chuong6Bai10
 */
public class Chuong6Bai10 {

    public static void main(String[] args) 
    {
        int result = gcd(20, 100);
        System.out.println("result: " + result);
    }

    //Cách tìm ước số chung lớn nhất giữa 2 số nguyên
    public static int gcd(int a, int b) 
    {
        if (a % b != 0) {
            int recurse = gcd(b, a%b);
            return recurse; 
        } else {
            return b;    
        }    
    }
}