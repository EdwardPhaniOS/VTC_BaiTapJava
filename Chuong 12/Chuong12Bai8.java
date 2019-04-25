/**
 * Chuong12Bai8
 */
public class Chuong12Bai8 {
/*
Bài tập yêu cầu đọc hiểu Code:
Biểu đồ ngăn xếp:
main[] at 20
make(5) at 25 -> array[5]
dub(array[5]) at 35
mus(array[5) at 44
main[] at 22


Phương thức mus tính tổng tất cả các giá trị của mảng được truyền vào
Kết quả của chương trình: "30 + "\n""

*/
    public static void main(String[] args) { 
        int[] bob = make(5);
        dub(bob); 
        System.out.println(mus(bob));
    }

    public static int[] make(int n) 
    {   int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
                a[i] = i+1; 
        }
        
        return a; 
    }
        
    public static void dub(int[] jub) {
        
        for (int i = 0; i < jub.length; i++) 
        {
            jub[i] *= 2; 
        }
    }
    
    //Phương thức mus tính tổng tất cả các giá trị của mảng được truyền vào
    public static int mus(int[] zoo) {
        int fus = 0;
        
        for (int i = 0; i < zoo.length; i++) 
        {
            fus = fus + zoo[i];
        }
        return fus; 
    }
       
}