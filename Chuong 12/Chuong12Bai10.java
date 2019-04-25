/**
 * Chuong12Bai10
 */
public class Chuong12Bai10 {

    public static void main(String[] args) {
        int[] d = {11, 1323, 23, 12, 2222, 12, 2323, 212, 11, 999999, 222};
        int result = indexOfMaxInRange(d, 0, d.length - 1);
        System.out.println("result: " + result);
        
        selectionSort(d);
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + "\n");
        }
       
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int indexOfMaxValue = indexOfMaxInRange(arr, i, arr.length - 1);
            swapElement(arr, i, indexOfMaxValue);
        }
    }

    public static int indexOfMaxInRange(int[] arr, int fromIndex, int toIndex) 
    {
        int result = fromIndex;
        int maxValue = arr[fromIndex];

        for (int i = fromIndex; i <= toIndex; i++) {

            if (arr[i] > maxValue) {
                maxValue = arr[i];
                result = i;
            }    
        }
        
        return result;
    }

    public static void swapElement(int[] arr, int firstIndex, int secondIndex) {
        if (firstIndex == secondIndex) {
            return;
        }
        int tempValue = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = tempValue;
    }
}