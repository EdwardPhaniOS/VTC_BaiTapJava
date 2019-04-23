/**
 * Chuong8Bai12
 */
public class Chuong8Bai12 {

    public static void main(String[] args) {
        String result = captainCrunch("ABGHZ abcghzyyy", 13);
        String decodeResult = decode(result, 13);

        System.out.print("message: " + "ABGHZ abcghzyyy" + "\n");
        System.out.print("ma khoa: " + result + "\n");
        System.out.print("giai ma: " + decodeResult + "\n");
    }

    public static String captainCrunch(String str, int number) {
        int i = 0;
        int length = str.length();
        String result = "";

        while (i < length) {
            int letter = str.charAt(i);

            if (str.charAt(i) + number > 126) {
                letter = str.charAt(i) - number;
            } else {
                letter = str.charAt(i) + number;
            }
            result += (char)letter;
            i++;
        }

        return result;
    }

    public static String decode(String str, int number) {
        int i = 0;
        int length = str.length();
        String result = "";

        while (i < length) {
            int letter = str.charAt(i);

            if (letter + number < 123 && letter > 103) {
                letter = str.charAt(i) + number;
            } else {
                letter = str.charAt(i) - number;
            }
           
            //System.out.print("letter: " + letter + "\n");
            result += (char)letter;
            i++;
        }

        return result;
    }
}