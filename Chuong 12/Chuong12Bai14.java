/**
 * Chuong12Bai14
 */
public class Chuong12Bai14 {

    public static void main(String[] args) {
        boolean result = canSpell("Hi Vinh Helloabcdefgh", "Hello Vinh");
        System.out.print("result: " + result);
    }

    //Hàm có 2 tham số là 2 chuỗi, 1 chuỗi ngẫu nhiên và 1 chuỗi có nghĩa
    //Sau đó hàm trả về True nếu như chuỗi có nghĩa là thành phần của chuỗi ngẫu nhiên
    public static boolean canSpell(String randomStr, String word) 
    {
        boolean result = true;
        int[] letterHistOfWord = letterHist(word);
        int[] letterHistOfRandomStr = letterHist(randomStr);

        for (int i = 0; i < letterHistOfWord.length; i++) {
            if (letterHistOfWord[i] > letterHistOfRandomStr[i]) {
                result = false;
            }
        }
       
        return result;
    }

    //Hàm có tham số là str kiểu String
    //Hàm trả về một Histogram của các kí tự trong str theo Alphabet từ a -> z
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