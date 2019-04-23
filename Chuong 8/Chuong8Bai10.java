/**
 * Chuong8Bai10
 */
public class Chuong8Bai10 {

    public static void main(String[] args) {
        String randomString = "abdest";
        boolean result = isAbecedarian(randomString);
        System.out.println("result: " + result);
    }

    //Chiến lược:
    //Sử dụng vòng lặp so sánh kí tự đầu tiên trong chuỗi và kí tự kế bên chuỗi,
    //rồi tính ra restString (là chuỗi không bao gồm kí tự đầu tiên), sau đó tiếp tục so sánh
    //kí tự đầu tiên và kí tự liền kề của restString

    //Trong quá trình so sánh
    //nếu kí tự đầu tiên lớn hơn kí tự kế bên thì dừng vòng lặp trả kết quả cuối về False
    //nếu không thì tiếp tục vòng lặp với đối số là restString mới (là chuỗi không bao gồm kí tự đầu tiên của restString cũ)
    //nếu hết vòng lặp (restString.length() == 1) cũng tức là các kí tự in thường trong chuỗi được xếp theo
    //thứ tự alphaB, trả về kết quả cuối cùng là True

    public static boolean isAbecedarian(String str) 
    {
        char firstChar = str.charAt(0);
        char nextChar = str.charAt(1);
        String restString = str.substring(1, str.length());
        System.out.println("restString: " + restString);
        if (nextChar <= firstChar) {
            return false;

        } else {
            while (restString.length() > 1) {
                boolean result = isAbecedarian(restString);
                return result;
            }
        }

        return true;
    }
}