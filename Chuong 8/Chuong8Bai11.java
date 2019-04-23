/**
 * Chuong8Bai11
 */
public class Chuong8Bai11 {

    public static void main(String[] args) {
        
        boolean result = isDupledrome("ssaabb");
        System.out.print("result: " + result);
    }

    public static boolean isDupledrome(String str) {
        
        if (str.length() % 2 != 0) {
            return false;
        }
        
        char firstLetter = str.charAt(0);
        char nextLetter = str.charAt(1);
        String restString = str.substring(2, str.length());

        if (firstLetter != nextLetter) {
            return false;
        
        } else {
            while (restString.length() > 1) {
                boolean result = isDupledrome(restString);
                return result; 
            }
        }

        return true;
    }
}