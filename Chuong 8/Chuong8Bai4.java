/**
 * Chuong8Bai4
 */
public class Chuong8Bai4 {

    public static void main(String[] args) {
        String s = "((3 + 7) * 2)";
        count(s);
    }


    //Phương thức này tính HIỆU SỐ giữa số lượng "(" với số lượng ")"
    //Cach 1:
    // public static int count(String str) {
    //     int len = str.length();
    //     int i = 0;
    //     int count = 0;
        
    //     while (i < len) 
    //     {
    //         char c = str.charAt(i);
    //         if (c == '(') {
    //             count = count + 1;
                
    //         } else if (c == ')') 
    //         { 
    //             count = count - 1;
    //         }
        
    //         i = i + 1; 
    //     }
        
    //     System.out.println(count);
    //     return count;
    // }

    //Cach 2:

    public static int count(String str) {
        int len = str.length();
        int i = 0;
        int count1 = 0;
        int count2 = 0;
        
        while (i < len) 
        {
            char c = str.charAt(i);
            if (c == '(') {
                count1 = count1 + 1;
                
            } else if (c == ')') 
            { 
                count2 = count2 + 1;
            }
        
            i = i + 1; 
        }
        
        System.out.println((count1 - count2));
        return count1 - count2;
    }
}