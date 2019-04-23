/**
 * Chuong8Bai3
 */
public class Chuong8Bai3 {

    public static void main(String[] args) {
        String fruit = "banana";
        countLetters(fruit, 'a');
       
    }

    public static void countLetters(String str, char x) {
        
        //BAO BOC DOAN MA MUC 8.7:

        // int length = str.length(); 
        // int count = 0;
        // int index = 0;
        // while (index < length) 
        // {
        //     if (str.charAt(index) == x) 
        //     { 
        //         count = count + 1;
        //     }
        //     index = index + 1;
        // }
        // System.out.println(count);
        
        //VIET LAI PHUONG THUC SU DUNG INDEXOF:
        int count = 0;
        int indexOfChar = -1;
        while (true) 
        {   
            indexOfChar = str.indexOf(x, indexOfChar + 1);

            if (indexOfChar == -1) {
                System.out.print("So lan xuat hien " + x + ": " + count + "\n");
                break;
            } 

            count++;
            System.out.print("Index of char " + x + ": " + indexOfChar + "\n");   
        
        }
    }
}