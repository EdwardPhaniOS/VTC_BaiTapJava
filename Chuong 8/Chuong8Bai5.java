/**
 * Chuong8Bai5
 */
public class Chuong8Bai5 {

    public static void main(String[] args) {
        String a = "Vinh";
        char b = 'P';
        boolean c = true;
        int d = 94;

        int x1 = 1;
        char x2 = 'c';

        System.out.print("x1: " + (++x1) + "\n");
        System.out.print("x2: " + (++x2) + "\n");
        //x2 = x2 + 1: kết quả trả về x2 là kiểu Int nhưng x2 được khai báo là kiểu char nên có lỗi.
        //++x2: kết quả tính toán là kiểu Int sau đó được chuyển thành kiểu char rồi trả về x2.

        String result = a + d;
        System.out.print("result: " + result);

        //boolean + boolean = boolean
        //char + boolean = error
        //int + boolean = error
        //String + boolean = error
        //boolean + char = error
        //char + char = int
        //int + char = int
        //String + char = String (nối char vào chuỗi String)
        //boolean + int = error
        //char + int = int
        //int + int = int
        //String + int = String (noi vao chuoi)
        //boolean + String = error
        //char + String = String (nối char vào chuỗi String)
        //int + String = String (noi vao chuoi)  
        //String + String = String (nối 2 chuỗi)

        
    }
    
    
}