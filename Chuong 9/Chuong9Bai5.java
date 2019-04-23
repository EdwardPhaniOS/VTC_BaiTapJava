/**
 * Chuong9Bai5
 */
import java.math.BigInteger;

public class Chuong9Bai5 {

    public static BigInteger pow(int x, int n) { 
        
        if (n == 0) return BigInteger.valueOf(1);

        // tính x mũ n/2 bằng cách đệ quy
        //int t = pow(x, n/2);
        BigInteger t = pow(x, n/2);
        
        // nếu n chẵn, kết quả là t bình phương
        // nếu n lẻ, kết quả là t bình phương nhân với x
        if (n%2 == 0) {
            return t.multiply(t);
          
        } else {
            BigInteger bigX = BigInteger.valueOf(x);
            return t.multiply(t).multiply(bigX);
        } 
    }

    public static void main(String[] args) {
        BigInteger result = pow(20000, 2);
        System.out.print("result: "+ result);
    }
}