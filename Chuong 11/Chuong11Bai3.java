/**
 * Chuong10Bai3
 */
public class Chuong11Bai3 {

    public static void main(String[] args) {
        Rational randomNumber = new Rational();
        Rational addNumberResult = new Rational();
        Rational number = new Rational(20, 50); //Chosen number
        double numberToDouble = Rational.toDouble(number);
        Rational reducedNumber = Rational.reduce(number);
        
        randomNumber.numerator = 10;
        randomNumber.denominator = 2;
        addNumberResult = Rational.add(number, randomNumber);

        System.out.println("randomNumber: " + randomNumber.numerator + "/" + randomNumber.denominator);
        System.out.println("chosenNumberToDouble: " + numberToDouble);
        System.out.println("reducedNumber: " + reducedNumber.numerator + "/" + reducedNumber.denominator);
        System.out.println("addNumberResult: " + addNumberResult.numerator + "/" + addNumberResult.denominator);

        Rational.negate(number);
        Rational.invert(number);
        System.out.println("number after negate and invert: " + number.numerator + "/" + number.denominator);  
    }
}

class Rational {

    int numerator, denominator;

    public Rational() 
    {
        this.numerator = 0;
        this.denominator = 1;    
    }

    public Rational(int numerator, int denominator) 
    {
        this.numerator = numerator;
        this.denominator = denominator;    
    }

    public static void printRational(Rational number) {
        System.out.println(number.numerator + "/" + number.denominator);
    }

    public static void negate(Rational number) {
        number.numerator *= (-1);
    }

    public static void invert(Rational number) {
        if (number.numerator == 0) {
            System.out.println("Không thể hoán đổi tử số và mẫu số vì tử số bằng 0");
            return;
        }
        
        int temp = number.denominator;
        number.denominator = number.numerator;
        number.numerator = temp;
    }

    public static double toDouble(Rational number) {
        double result = (double)number.numerator / number.denominator;
        return result;
    }

    public static Rational reduce(Rational number) {
        int gcd = gcd(number.numerator, number.denominator);
        int reducedNumerator = number.numerator/gcd;
        int reducedDenominator = number.denominator/gcd;

        Rational result = new Rational(reducedNumerator, reducedDenominator);
        return result;
    }

    public static int gcd(int a, int b) 
    {
        if (a % b != 0) {
            int recurse = gcd(b, a%b);
            return recurse; 
        } else {
            return b;    
        }    
    }

    public static Rational add(Rational firstNumber, Rational secondtNumber) {
        int totalNumerator = firstNumber.numerator * secondtNumber.denominator
                             + secondtNumber.numerator * firstNumber.denominator;
        
        int totalDenominator = firstNumber.denominator * secondtNumber.denominator;

        Rational result = new Rational(totalNumerator, totalDenominator);

        return Rational.reduce(result);
    }
}