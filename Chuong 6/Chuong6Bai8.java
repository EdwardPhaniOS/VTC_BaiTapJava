
/**
 * Chuong6Bai8
 */
public class Chuong6Bai8 {

    public static void main(String[] args) 
    {
        String s = "Vinh";
        int length = length(s);
        char firstChar = first(s);
        String restString = rest(s);

        System.out.println("first char: " + firstChar + "\nRest String: " + restString + "\nLength: " + length);
        printString(s);
        printBackward(s);
        System.out.println(reverseString(s));
        
    }
    
    // first: trả lại kí tự đầu tiên của String cho trước
    public static char first(String s) 
    {
        return s.charAt(0);
    }

    // last: trả lại một String mới có chứa toàn bộ 
    // chỉ trừ kí tự đầu của String cho trước
    public static String rest(String s) 
    {
        return s.substring(1, s.length()); 
    }

    public static String restString(String s) 
    {
        return s.substring(0, s.length() - 1); 
    }
    // length: trả lại chiều dài của String cho trước
    public static int length(String s) {
        return s.length();
    }

    public static void printString(String str) 
    {
        if (length(str) == 0) {
            return;
        } else {
            System.out.print(str.charAt(0) + "\n");
            String restStr = rest(str);
            printString(restStr);
        }
    }

    public static void printBackward(String str) {
        if (length(str) == 0) {
            return;
        } else {
            System.out.print(str.charAt(length(str) - 1) + "\n");
            String restStr = restString(str);
            printBackward(restStr);
        }
    }


    public static String reverseString(String str) {
        
        if (length(str) == 1) {
            return str.charAt(0) + "";
        } else {
            String ch = str.charAt(length(str) - 1) + "";
            String restStr = restString(str);
            String recurse = reverseString(restStr);
            
            String result = ch + recurse;
            return result;
        }

    }
}