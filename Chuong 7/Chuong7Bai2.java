/**
 * Chuong7Bai2
 */
public class Chuong7Bai2 {

    public static void main(String[] args) {
        System.out.println(squareRoot(16));
    }

    public static double squareRoot(double number) {
        double result = 0.0;
        int n = 5;
        double x0 = number / 2.0;
        double x1 = (x0 + number/x0) / 2;

        while (n > 0) {
            double x2 = (x1 + number/x1) / 2;
            x1 = x2;
            result = x2;
            n--;
        }

        return result;
    }
}