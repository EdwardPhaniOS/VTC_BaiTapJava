/**
 * Chuong12Bai15
 */
public class Chuong12Bai15 {

    public static void main(String[] args) {
        boolean result = canSpell("Hello__a_V", "Hello Vinh");
        System.out.print("result: " + result);
    }

    //Hàm có 2 tham số là 2 chuỗi, 1 chuỗi ngẫu nhiên (randomStr) và 1 chuỗi có nghĩa (word)
    //Sau đó hàm trả về True nếu như chuỗi có nghĩa là thành phần của chuỗi ngẫu nhiên
    public static boolean canSpell(String randomStr, String word) 
    {
        boolean result = true;
        int[] letterHistOfWord = letterHist(word);
        int[] letterHistOfRandomStr = letterHist(randomStr);

        
         //Tính số lượng thẻ tuỳ ý trong chuỗi ngẫu nhiên (countEmptyCard)
        int countEmptyCard = 0;

        for (int i = 0; i < randomStr.length(); i++) {
            if (randomStr.charAt(i) == '_') {
                countEmptyCard++;
            }
        }

        //Tính tổng số lượng thẻ còn thiếu (countRequiredCard) để tạo thành từ có nghĩa (word),
        //trong chuỗi ngẫu nhiên
        int countRequiredCard = 0;

        for (int i = 0; i < letterHistOfWord.length; i++) {
            if (letterHistOfWord[i] > letterHistOfRandomStr[i]) {
                countRequiredCard += (letterHistOfWord[i] - letterHistOfRandomStr[i]);
            }
        }

        //Nếu số lượng thẻ còn thiếu để tạo thành từ có nghĩa lớn hơn số thẻ tuỳ ý thì tức là
        //chuỗi ngẫu nhiên không đủ ký tự để tạo thành từ có nghĩa
        //result = false
        if (countRequiredCard > countEmptyCard) {
            result = false;
        }
       
        return result;
    }

    //Hàm có tham số là str kiểu String
    //Hàm trả về một Histogram của các kí tự trong str theo index từ 0 -> 25, 
    //tương đương với Alphabet từ a -> z
    //Ví dụ: Với tham số "abb" ==> 0 - 1, 1 - 2, 2 - 0, 3 - 0, 4 - 0,....
    //                 tương đương a - 1, b - 2, c - 0, d - 0, e - 0,....
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