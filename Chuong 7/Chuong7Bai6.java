/**
 * Chuong7Bai6
 */
public class Chuong7Bai6 {

    public static void main(String[] args) {
        
        double x = 1;
        double result1 = gauss(x,20);
        System.out.println("result1: " + result1);

        double result2 = Math.exp(-1);
        System.out.println("result2_check: " + result2);
    }

    public static double gauss(double number, int n) {

        if (n == 1) {
            return 1;
        }
        double x0 = number * number;
        int a = -1;
        double result = 1 - x0;
        int i = 3;
        double denominator = 1;
        double numerator = 1;

        while (n > 2) {
            numerator = a*(-1) * x0 * number * number;
            denominator = denominator * (i - 1);
            double x1 = numerator / denominator;
            // System.out.println("tu so: " + numerator);
            // System.out.println("mau so: " + denominator);
            // System.out.println("x1: " + x1);
           
            result += x1;
            // System.out.println("result_loop: " + (result));
            n--;
            x0 = x0 * number * number;
            a = a*(-1);
            i++;
        }

        return result;
    }
}