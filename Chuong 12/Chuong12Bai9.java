/**
 * Chuong12Bai9
 */
public class Chuong12Bai9 {

    public static void main(String[] args) {
        int[] d = {11, 1323, 23, 12, 2222, 12, 2323, 212, 11, 999999, 222};
        int result = maxInRange(d, 0, d.length - 1);
        System.out.println("result: " + result);

        int max = max(d);
        System.out.println("max: " + max);

        int findNumberResult1 = findFromIndex(d, 999999, 0);
        System.out.println("findNumberResult1: " + findNumberResult1);
        int findNumberResult2 = find(d, 999999);
        System.out.println("findNumberResult2: " + findNumberResult2);
       
    }
    
    public static int max(int[] arr) {
        return maxInRange(arr, 0, arr.length - 1);
    }

    public static int maxInRange(int[] array, int lowIndex, int highIndex) 
    {   
        int maxValue = array[lowIndex];

        int midIndex = (lowIndex + highIndex) / 2;
        if (lowIndex < midIndex && midIndex < highIndex) {
            int leftMaxValue = maxInRange(array, lowIndex, midIndex - 1);           
            int righttMaxValue = maxInRange(array, midIndex, highIndex);

            if (leftMaxValue >= righttMaxValue) {
                return leftMaxValue;
            } else {
                return righttMaxValue;
            }
        }

        if (lowIndex == highIndex) {
            return maxValue;
        }

        if (lowIndex < highIndex) {
            int recurse = maxInRange(array, lowIndex + 1, highIndex);
            if (recurse > maxValue) {
                maxValue = recurse;
            }
        } 

        return maxValue;
    }

    public static int find(int[] arr, int target) {
        
        return findFromIndex(arr, target, 0);
    }

    public static int findFromIndex(int[] arr, int target, int fromIndex) {
       
        if (target == arr[fromIndex]) {
            return fromIndex;
        }

        if (fromIndex == arr.length - 1) {
            return -1;
        }

        int recurse = findFromIndex(arr, target, fromIndex + 1);
        return recurse;
    }

    
}