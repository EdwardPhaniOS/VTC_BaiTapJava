/**
 * Chuong7Bai1
 */
public class Chuong7Bai1 {

    public static void main(String[] args) 
    {
        loop(10); 
    }
    
    public static void loop(int n) 
    {
        int i = n;
        
        while (i > 0) {
            System.out.println(i); 
            
            if (i%2 == 0) {
                i = i/2;
                
            } else {
                i = i+1; 
            }
        } 
    }

}



/* Kết quả là vòng lặp vô tận
i   n
10  10
5   10
6   10  
3   10
4   10
2   10
1   10
2   10
1   10
2   10
*/