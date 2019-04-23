/**
 * Chuong7Bai3
 */
/**
 * Chuong7Bai3
 */
public class Chuong7Bai3 {

    public static void main(String[] args) {
        System.out.println("result: " + power(4, 2));
    }

    public static double power(double x, int n) {
        double result = 1.0;

        while (n > 0) {
            result = result * x;
            n--;
        }

        return result;
    }
}

