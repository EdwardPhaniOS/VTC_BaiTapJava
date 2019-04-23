/**
 * Cau4
 */
public class Cau4 {

    public static void main(String[] args) {
        printAmerican("Thursday", 4, "April", 2019);
        printEuropean("Thursday", 4, "April", 2019);
    }

    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println("American format: ");
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println("European format: ");
        System.out.println(day + ", " + date + " " + month + ", " + year);
    }
}