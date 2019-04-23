/**
 * Chuong6Bai5
 */
public class Chuong6Bai5 {

    /* Đề bài yêu cầu:
    Mục đích của bài tập này là nhằm viết một phương thức mới có áp dụng phương thức sẵn có
    
    Bạn cần giả sử rằng 
    đã có một phương thức sumSquares để tính và trả lại tổng các bình phương của đối số     
    
    Bạn không được viết sumSquares hay main và cũng không kích hoạt distance.
    */

    public static double distance(double x1, double y1, double x2, double y2) 
    {
        double result; double dx = x1 - x2; double dy = y1 - y2;
        //double sumSquare = Math.pow(dx, 2) + Math.pow(dy, 2);
        double sumSquare = sumSquares(dx, dy);

        result = Math.sqrt(sumSquare);
        System.out.println(result);
        
        return result;       
    }
}