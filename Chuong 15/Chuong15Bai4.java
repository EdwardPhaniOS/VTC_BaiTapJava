/**
 * Chuong15Bai4
 */
public class Chuong15Bai4 {

    public static void main(String[] args) 
    {
        Rational2 randomNumber = new Rational2();
        Rational2 addNumberResult = new Rational2();
        Rational2 number = new Rational2(20, 50); //Chosen number
        double numberToDouble = number.toDouble();
        Rational2 reducedNumber = number.reduce();
        
        randomNumber.numerator = 10;
        randomNumber.denominator = 2;
        addNumberResult = number.add(randomNumber);

        System.out.println("randomNumber: " + randomNumber.numerator + "/" + randomNumber.denominator);
        System.out.println("chosenNumberToDouble: " + numberToDouble);
        System.out.println("reducedNumber: " + reducedNumber.numerator + "/" + reducedNumber.denominator);
        System.out.println("addNumberResult: " + addNumberResult.numerator + "/" + addNumberResult.denominator);

        /*  Câu 4.2:
            Rational2.negate(number); 
            number.gcd(number, number);
                Lỗi đối số truyền vào không phù hợp với phương thức đã được khai báo 
                ==> Xem lại khai báo phương thức

            Rational2.negate(); 
                Lỗi sử dụng phương thức non-static dưới dạng phương thức static
                ==> Xem lại khai báo phương thức
        */
        
        number.negate();
        number.invert();
        System.out.println("number after negate and invert: " + number.numerator + "/" + number.denominator);  
    
    /*  Câu 4.3:
            Phương thức đối tượng viết gọn hơn phương thức lớp
            Phương thức đối tượng diễn đạt tính toán một cách tự nhiên hơn
            Phương thức lớp phù hợp khi đoạn code thực thi của phương thức lớp cần dễ dàng được chia sẻ
            ra bên ngoài lớp và không cần tạo một đối tượng nào trước đó để gọi phương thức lớp
            Phương thức lớp còn phù hợp khi ta chắc chắn rằng phương thức lớp này sẽ không cần override
            vì phương thức lớp (static) không thể bị override
        */
    }
}

class Rational2 {

    int numerator, denominator;

    public Rational2() 
    {
        this.numerator = 0;
        this.denominator = 1;    
    }

    public Rational2(int numerator, int denominator) 
    {
        this.numerator = numerator;
        this.denominator = denominator;    
    }

    public void printRational() {
        System.out.println(numerator + "/" + denominator);
    }

    public void negate() {
        this.numerator *= (-1);
    }

    public void invert() {
        if (this.numerator == 0) {
            System.out.println("Không thể hoán đổi tử số và mẫu số vì tử số bằng 0");
            return;
        }
        
        int temp = this.denominator;
        this.denominator = this.numerator;
        this.numerator = temp;
    }

    public double toDouble() {
        double result = (double)numerator / denominator;
        return result;
    }

    public Rational2 reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        int reducedNumerator = this.numerator/gcd;
        int reducedDenominator = this.denominator/gcd;

        Rational2 result = new Rational2(reducedNumerator, reducedDenominator);
        return result;
    }

    public int gcd(int a, int b) 
    {
        if (a % b != 0) {
            int recurse = gcd(b, a%b);
            return recurse; 
        } else {
            return b;    
        }    
    }

    public Rational2 add( Rational2 secondtNumber) {
        int totalNumerator = this.numerator * secondtNumber.denominator
                             + secondtNumber.numerator * this.denominator;
        
        int totalDenominator = this.denominator * secondtNumber.denominator;

        Rational2 result = new Rational2(totalNumerator, totalDenominator);

        return result.reduce();
    }
}