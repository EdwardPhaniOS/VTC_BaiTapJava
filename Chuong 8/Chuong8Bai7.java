/**
 * Chuong8Bai7
 */
public class Chuong8Bai7 {

    public static void main(String[] args) {
        int number = 62;
        int lastDigit = number%10;
        int firstDigit = number/10; 
        System.out.println(lastDigit + firstDigit); //SAI
        //Chương trình sẽ in ra tổng của lastDigit và firstDigit 
        //thay vì in ra số đảo ngược của đối số được đưa vào như ý định ban đầu của phương thức

        //Sửa lại như sau:
        System.out.println("result: " + lastDigit + firstDigit);
    }
}