/**
 * Chuong12Bai1
 */
public class Chuong12Bai1 {
    public static void main(String[] args) {
        //
        int[] randomArray = new int[4];
        for (int i = 0; i < 4; i++) {
            randomArray[i] = i + 1;
        }

        int[] cloneArray =  cloneArray(randomArray);
        for (int i = 0; i < cloneArray.length; i++) {
            System.out.println("cloneArray" + i + ": " + cloneArray[i]);
        }
       
    }

    public static int[] cloneArray(int[] array) 
    {
        int[] cloneArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            cloneArray[i] = array[i];
        }

        return cloneArray;
    }

}