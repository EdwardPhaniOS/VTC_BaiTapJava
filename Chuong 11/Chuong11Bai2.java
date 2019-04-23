/**
 * Chuong10Bai2
 */
class Chuong11Bai2 {
    public static void main(String[] args) {
       
        Date2 randomDate = new Date2();
        System.out.println("randomDate: " + randomDate.day);


        Date2 myBirthday = new Date2(1994, 12, 20);
        System.out.println("myBirthday: " + myBirthday.day + "-" + myBirthday.month + "-" + myBirthday.year );
    }
}

class Date2 
    {
        int year, month, day;
    
        public Date2() {
            this.year = 0;
            this.month = 0;
            this.day = 0;
        }
    
        public Date2(int year, int month, int day) {
            this.year = year;
            this.month = month;
            this.day = day;
        }
    }


