/**
 * Chuong7Bai5
 */
public class Chuong7Bai5 {

    public static void main(String[] args) {
        
        check(1, 5);
        check(1, 18);

        double x2 = - 0.1;

        while (x2 >= -100) {
            check(x2, 30);
            double result = Math.exp(x2) - myexp(30, x2);
            System.out.println("result: " + result);
            x2 = x2 * 10; 
        }
    }

    public static double myexp(int count, double number) {
        //Cach 1:
        
        // double result = 1;
        // while (count > 1) {
        //     result = result + (Chuong7Bai3.power(number, count - 1)/Chuong7Bai4.factorial(count - 1));
        //     count--;
        // }

        // return result;


         //Cach 2:
        if (count == 1) {
            return 1;
        }
       
        double x0 = number;
        double denominator = 1;
        double i = 1;
        double result = 1 + x0;

        while (count > 2) {
            count--;
            i++;
            denominator = denominator * i;

            double x1 = (number * x0) / denominator;

            x0 = x0 * number;
            result = result + x1;
        }

         return result;
    }

    public static void check(double x, int count) {
        System.out.println("check method: " + x + "\t" + myexp(count, x) + "\t" + Math.exp(x));
    }
}