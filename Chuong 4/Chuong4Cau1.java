/**
 * Chuong4Cau1
 */
public class Chuong4Cau1 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
     }
     
     public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
     }
     
     public static void baffle() {
        System.out.print("wug");
        ping();
     }
     
     public static void ping() {
        System.out.println(".");
     }
}

/*
   1. No, I wug.You wugga wug.I wug.\n
      16   .232811       .2328182328
   2. | main [    ] | at: 17
      | zoop [    ] | at: 10
      | baffle [  ] | at: 24
      | ping [    ] | at: 27
      
   3. baffle -> ping -> baffle -> ping ... (Non-escape)
   */