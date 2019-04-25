/**
 * Chuong12Bai2
 */
public class Chuong12Bai2 {

    public static void main(String[] args) {
        double result = randomDouble(1.0, 1.0);
        System.out.print("result: " + result);
    }

    public static double randomDouble(double low, double high) {
        double randomNumber = Math.random();
        double result = high - randomNumber;
        if (result < low) {
            result = low;
        }

        return result;
    }
}