/**
 * Chuong8Bai9
 */
import java.io.*;

public class Chuong8Bai9 {

    public static void main(String[] args) throws FileNotFoundException, IOException
    {
        String fileName = "/Users/tanvinhphan/Downloads/VTC/Java/Hoc-Java-master/BaiTapJava_Offline/App.java/Chuong 9/words.txt";
        try {
            processFile(fileName); 
        } catch (Exception ex) {
            System.out.println("That's didn't work. Here's why:");
            ex.printStackTrace();
        }

        String str = "palindromeemordnilap";
        
        // char result = first("");
        // System.out.println("result: " + result);

        String resultMiddleMethod = middle(str);
        System.out.println("resultMiddleMethod: " + resultMiddleMethod);

        boolean resultIsPalindrome = isPalindrome(str);
        System.out.println("resultIsPalindrome: " + resultIsPalindrome);

    }

    public static void processFile(String filename) throws FileNotFoundException, IOException
    {
        FileReader fileReader = new FileReader(filename);
        BufferedReader in = new BufferedReader(fileReader);

        while (true) 
        {
            String s = in.readLine();
            if (s == null) break;

            if (isPalindrome(s) == true) {
                System.out.print(s + "\n");
            }
           
        }
    }

    //Chiến lược: 
    //Sử dụng vòng lặp so sánh firstLetter và lastLetter rồi tính ra MiddleString
    //Sau đó dựa vào MiddleString để tiếp tục so sánh firstLetter và lastLetter mới
    //Trong quá trình so sánh nếu phát hiện False thì dừng vòng lặp, trả kết quả cuối về false
    //Nếu quá trình so sánh vẫn True thì tiếp tục vòng lặp cho tới khi MiddleString = ""
    //Nếu đã hết vòng lặp (MiddleString = "") mà vẫn không phát hiện false 
    //thì trả kết quả cuối cùng về True
    public static boolean isPalindrome(String str) {
        char firstChar = first(str);
        char lastChar = last(str);
        String middleString = middle(str);

        if (firstChar != lastChar) {
            return false;

        } else {
            while (middleString.length() != 0) {
                boolean result = isPalindrome(middleString);
                return result;
            }
        }

        return true;
    }

    public static char first(String str) {
        if (str.length() < 1) {
            return ' ';
        } else {
            return str.charAt(0);
        }
    }

    public static char last(String str) {
        int length = str.length();
        if (length < 1) {
            return ' ';
        } else {
            return str.charAt(length - 1);
        }
    }

    public static String middle(String str) {
        int length = str.length();
        if (length <= 2) {
            return "";
        } else {
            return str.substring(1, length - 1);
        }
    }
}