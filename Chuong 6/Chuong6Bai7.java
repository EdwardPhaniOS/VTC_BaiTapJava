/**
 * Chuong6Bai7
 */
public class Chuong6Bai7 {

    public static void main(String[] args) 
    {
        ack(1, 2);
        System.out.println("KQ: " + ack(2, 2));
    }

    public static int ack(int m, int n) 
    {
        if (m < 0 || n < 0) {
            System.out.println("Vui long nhap m, n >= 0");
            return 0;

        } else {
            if (m == 0) {
                //System.out.println("n + 1 = " + (n + 1));
                return n + 1;
            } else {
                if (n == 0) {
                    return ack(m - 1, 1);
                
                } else {
                    return ack(m - 1, ack(m, n - 1));
                }
            }
        } 
        
    }
}