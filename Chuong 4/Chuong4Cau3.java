/**
 * Chuong4Cau3
 */
public class Chuong4Cau3 {

    public static void main(String[] args) 
    {
        //printSong(3);
        printSong(99);
    }

    public static void printSong(int bottles) {
        if (bottles == 0) {
            System.out.println("No bottles of beer on the wall, no bottles of beer, ya’ can’t take one down, ya’ can’t pass it around, ’cause there are no more bottles of beer on the wall!");    
        } else {
            System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer, ya’ take one down, ya’ pass it around, " + (bottles - 1) + " bottles of beer on the wall.");    
            printSong(bottles - 1);
        }
    }
}