/**
 * Multadd
 */
/**
 * Chuong6Bai2
 */
public class Chuong6Bai2 {
    public static void main(String[] args) 
    {   //Cau 2.3
        double test = multadd(1, 2, 3);
        System.out.println(test);

        //Cau 2.4
        double a1 = Math.cos(Math.PI / 4);
        double b1 = 1.0/2.0;
        double c1 = Math.sin(Math.PI / 4);

        double result1 = multadd(a1, b1, c1);

        //Cau 2.5
        double a2 = 1.0;
        double b2 = Math.log10(10);
        double c2 = Math.log10(20);
        double result2 = multadd(a2, b2, c2);

        yikes(2);
    }

    //Cau 2.1, 2.2
    public static double multadd(double a, double b, double c) 
    {
        return a*b + c;
    }

    public static void yikes(double number) 
    {
        double a = number;
        double b = Math.exp(-number);  //or: double b = Math.pow(Math.E, -number); 
        double c = Math.sqrt(1 - b);

        double result = multadd(a, b, c);
        System.out.println("result is: " + result);
    }
    
}
