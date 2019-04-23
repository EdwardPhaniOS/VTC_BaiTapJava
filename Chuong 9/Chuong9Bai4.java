/**
 * Chuong9Bai4
 */
import java.math.BigInteger;

public class Chuong9Bai4 {

    public static void main(String[] args) {
        
        int i = 0;
        while (i < 30) {

            BigInteger big = factorial(i);
            System.out.print(i +" : " + big + "\n");
            i++;
        }

        // int x = 11;
        // BigInteger big = BigInteger.valueOf(x);
        // System.out.print("big: " + big + "\n");

        // BigInteger small = BigInteger.valueOf(2);
        // System.out.print("small: " + small + "\n");

        // BigInteger total = big.pow(2);
        // System.out.print("total: " + total + "\n");

        //Tầm i = 15, kết quả không còn đúng nữa vì giá trị vượt quá khả năng biểu diễn của kiểu int;
        //(Giá trị tính toán trả về Int tuy đúng nhưng giá trị quá dài nên kiểu Int không thể hiện đúng được)
       
    }

    public static BigInteger factorial(int number) {
        BigInteger result = BigInteger.valueOf(1);
        int n = number;

        while (n > 1) {
            BigInteger big = BigInteger.valueOf(n);
            result = result.multiply(big);
            n--;
        }

        return result;
    }
}