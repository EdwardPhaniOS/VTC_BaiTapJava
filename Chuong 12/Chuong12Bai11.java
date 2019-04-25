/**
 * Chuong12Bai11
 */
public class Chuong12Bai11 {

    public static void main(String[] args) {
        
        String randomString = "aAaAbBbcdeeeezzz";
        letterHist(randomString);
    }

    public static void letterHist(String str) {
        int[] count = new int[26];
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 
        'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        
        int Stringlength = str.length();
        String lowerCaseString = str.toLowerCase();

        for (int i = 0; i < Stringlength; i++) 
        {
            for (int j = 0; j < alphabet.length; j++) 
            {   
                if (alphabet[j] == lowerCaseString.charAt(i))
                    count[j]++;
            }
        }

        for (int i = 0; i < alphabet.length; i++) {
            System.out.print("alphabetHistogram: " + alphabet[i] + "--" + count[i] + "\n");
        }
       
    }
}
