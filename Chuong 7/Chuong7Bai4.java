/**
 * Chuong7Bai4
 */
public class Chuong7Bai4 {

    public static void main(String[] args) {
        System.out.println(factorial(3));
    }

    public static double factorial(int number) {
        double result = 1.0;
        int n = number;

        while (n > 1) {
            result = result * n;
            n--;
        }

        return result;
    }
}