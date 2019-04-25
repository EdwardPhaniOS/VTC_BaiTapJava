/**
 * Chuong12Bai6
 */
public class Chuong12Bai6 {
    public static void main(String[] args) {
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = i + 1;
        }

        int result = targetIndex(randomArray, 3);
        System.out.print("result: " + result);
    }
    
    public static int targetIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }

        return -1;
    }
}

