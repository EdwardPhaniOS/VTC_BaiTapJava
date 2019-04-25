/**
 * Chuong12Bai4
 */
public class Chuong12Bai4 {

    public static void main(String[] args) {
        int[] scores = randomArray(50);
        int[] result = makeHist(scores);

        for (int i = 0; i < scores.length; i++) {
            System.out.println("Score: " + i + " - Count: " + result[i]);
        }
    }

    public static int[] randomArray(int n) { 
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) 
        {
            a[i] = Chuong12Bai3.randomInt(0, 100); 
        }
        return a; 
    }

    public static int[] makeHist(int[] scores) {
        int[] counts = new int[100];
        for (int i = 0; i < scores.length; i++) {
          int index = scores[i];
          counts[index]++;
        } 
        
        return counts;
    }

}