/**
 * Chuong12Bai13
 */
public class Chuong12Bai13 {

    public static void main(String[] args) {
        boolean result = isAnagram("allen downey", "well annoyed");
        System.out.print("result: " + result);
    }

    //Hàm nhận vào 2 String rồi trả về True nêú chúng có chứa cùng những chữ cái 
    //(đồng thời cùng số lượng)
    public static boolean isAnagram(String str, String convertedStr) {
        
        int strLength = str.length();

        if (strLength != convertedStr.length()){
            return false;
        }

        int[] count1 = letterHist(str);
        int[] count2 = letterHist(convertedStr);

        for (int i = 0; i < count1.length; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }

    //Hàm tính nhận một chuỗi làm tham số rồi trả lại histogram của các chữ cái trong chuỗi 
    //theo alphabet
    public static int[] letterHist(String str) 
    {   
        int[] count = new int[26];
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 
        'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 
        'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        int stringLength = str.length();
        String lowerCaseString = str.toLowerCase();

        for (int i = 0; i < stringLength; i++) {
            for (int j = 0; j < alphabet.length; j++) 
            {   
                if (alphabet[j] == lowerCaseString.charAt(i))
                    count[j]++;
            }
        }
        
        return count;
    }
}