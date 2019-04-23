
public class Date {

    public static void main(String[] args) {
        showDate();
    }

    public static void showDate() {
        String day = "Monday";
        int date = 1;
        String month = "April";
        int year = 2019;

        System.out.println(day);
        System.out.println(date);
        System.out.println(month);
        System.out.println(year);

        System.out.println("American format: ");
        System.out.println(day + ", " + month + " " + date + " " + year);
        System.out.println("European format: ");
        System.out.println(day + " " + date + " " + month + " " + year);
    }
}