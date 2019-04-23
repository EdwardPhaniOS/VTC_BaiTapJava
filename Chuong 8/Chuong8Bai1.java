/**
 * Chuong8Bai1
 */
public class Chuong8Bai1 {

    public static void main(String[] args) {
        reverseString("Vinh Phan");
    }

    public static void reverseString(String str) 
    {
        int length = str.length();
        String result = "";
        while (length > 0) {
            result += str.charAt(length - 1);
            length--;
        } 
        
        System.out.print(result);
    }
}