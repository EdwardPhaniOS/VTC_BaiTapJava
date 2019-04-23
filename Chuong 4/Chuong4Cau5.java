/**
 * Chuong4Cau5
 */
public class Chuong4Cau5 {

    public static void main(String[] args) {
        
        check_fermet(1 , 2, 3, 4);
        check_fermet(3, 4, 5, 2);
    }

    public static void check_fermet(int a, int b, int c, int n) 
    {
        if (n >  2) {
           int aRaiseToN = raiseToPow(a, n);
           int bRaiseToN = raiseToPow(b, n);
           int cRaiseToN = raiseToPow(c,n);

           if (aRaiseToN + bRaiseToN == cRaiseToN) {
                System.out.println("Trời, Fermat đã lầm!");
           } else {
                System.out.println("Không, vẫn không đúng");
           }

        } else {
            System.out.println("Vui long nhap n > 2");
        }
        
    }

    public static int raiseToPow(int number, int caps) {
        return (int)Math.pow(number, caps);
    }
}