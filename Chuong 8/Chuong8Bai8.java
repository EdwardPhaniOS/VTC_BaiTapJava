/**
 * Chuong8Bai8
 */
public class Chuong8Bai8 {

    //Phương thức enigma chuyển int x thành dạng bit
    public static void main(String[] args) { 
        enigma(5);
        System.out.println("");
    }

    public static void enigma(int x) {
        if (x == 0) {
          return;
        } else {
          enigma(x/2);
        }
    System.out.print(x%2); 
    }
}