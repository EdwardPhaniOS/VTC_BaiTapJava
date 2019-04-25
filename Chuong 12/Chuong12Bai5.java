/**
 * Chuong12Bai5
 */
public class Chuong12Bai5 {

    public static void main(String[] args) {
        int[] randomIntArray = Chuong12Bai4.randomArray(5);
        int[] d = new int[3];
        d[0] = 1;
        d[1] = 5;
        d[2] = 2;
        boolean result = areFactors(10, randomIntArray);
        boolean result2 = areFactors(10, d);

        System.out.println("result: " + result);
        System.out.println("result2: " + result2);
    }

    public static boolean areFactors(int n, int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0 || n % array[i] != 0) {
                return false;
            }
        }

        return true;
    }

}