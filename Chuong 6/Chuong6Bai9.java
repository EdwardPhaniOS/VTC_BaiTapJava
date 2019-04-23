/**
 * Chuong6Bai9
 */
public class Chuong6Bai9 {

    public static void main(String[] args) 
    {
        System.out.println("result: " + power(2, 4));
    }

    public static double power(double x, int n){
        if (x == 0){
           if (n == 0){
              return 1;
           } 
           else {
              return 0;
           }
        }
        else {
           if (n == 1){
              return x;
           } 
           else if (n == 2){
              return x*x;
           } 
           else {            
                return x*power(x,n-1);
           }
        }
     }     
}
