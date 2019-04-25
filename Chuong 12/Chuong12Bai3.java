/**
 * Chuong12Bai3
 */
public class Chuong12Bai3 {
    public static void main(String[] args) {
        int result = randomInt(1, 100);
        System.out.print("result: " + result);
    }

    public static int randomInt(int low, int high) {
        double randomNumber = Math.random();
        if (randomNumber == 0.0) {
            randomInt(low, high);
        }

        double result = (double)high * randomNumber;
        if (result < low) {
            result = low;
        }
        
        return (int)result;
    }
}