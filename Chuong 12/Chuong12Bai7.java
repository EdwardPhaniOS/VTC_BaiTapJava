/**
 * Chuong12Bai7
 */
public class Chuong12Bai7 {

    public static void main(String[] args) {
        //Bài yêu cầu đọc hiểu phương thức rồi giải thích
    }

    //Phương thức tính tổng của tất cả các giá trị trong mảng được đưa vào
    public static int banana(int[] a) 
    {   int grape = 0;
        int i = 0;
        while (i < a.length) 
        {
            grape = grape + a[i];
            i++; 
        }
        
        return grape;
    }
    
    //Phương thức tính số lần xuất hiện của số int "p" trong mảng "a"
    public static int apple(int[] a, int p) {
        int i = 0;
        int pear = 0;
        while (i < a.length) 
        {
            if (a[i] == p)
            pear++;
            i++; 
        }
          return pear;
    }
    
    //Phương thức trả về index đầu tiên trong mảng có giá trị là "p",
    //nếu trong mảng không có giá trị "p" nó sẽ trả về "-1"
    public static int grapefruit(int[] a, int p) 
    { 
        for (int i = 0; i<a.length; i++) 
        {
            if (a[i] == p)
            return i;
        }
        return -1; 
    }
}