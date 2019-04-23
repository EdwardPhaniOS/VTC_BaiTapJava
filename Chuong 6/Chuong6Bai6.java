/**
 * Chuong6Bai6
 */
public class Chuong6Bai6 {
    public static void main(String[] args) { 
        System.out.println(prod(1, 4));
    }
    public static int prod(int m, int n) { 
        if (m == n) {
            return n;
        } else {
            return n * prod(m, n-1); 
        } 
    }
}

/*
main||
      prod|m[1] n[4] recurse[6] result[24]| -> 24
      prod|m[1] n[3] recurse[2] result[6]|
      prod|m[1] n[2] recurse[1] result[2]|
      prod|m[1] n[1]| -> 1

      resutl: 24
*/

//pod: tính tích các số từ m đến n
