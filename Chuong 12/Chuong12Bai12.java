/**
 * Chuong12Bai12
 */
public class Chuong12Bai12 {

    public static void main(String[] args) {
        String randomString = "intestines";
        boolean result = isDoubloon(randomString);
        System.out.println("result: " + result);
    }

    public static boolean isDoubloon(String str) {
        int stringLength = str.length();
        String upperCaseString = str.toUpperCase();
        int[] count = new int[stringLength];
        char[] alphabet = new char[stringLength];

        for (int i = 0; i < stringLength; i++) {
            alphabet[i] = upperCaseString.charAt(i);
        }

        for (int i = 0; i < stringLength; i++) {
            for (int j = 0; j < stringLength; j++) 
            {   
                if (alphabet[j] == upperCaseString.charAt(i))
                    count[j]++;
            }
        }

        for (int i = 0; i < stringLength; i++) {
            if (count[i] != 2) {
                return false;
            }
        }

        return true;
    }
}