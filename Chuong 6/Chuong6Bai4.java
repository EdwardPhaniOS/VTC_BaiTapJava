//ping!
//pong!

/**
 * Chuong6Bai4
 */
public class Chuong6Bai4 {

    public static void main(String[] args) 
    { 
        boolean flag1 = isHoopy(202); //true
        boolean flag2 = isFrabjuous(202);  //true
        System.out.println(flag1); //"true" + "\n" 
        System.out.println(flag2); //"true" + "\n"
        
        if (flag1 && flag2) 
        { 
            System.out.println("ping!"); //"ping!""
        }
        
        if (flag1 || flag2) 
        {
            System.out.println("pong!"); //"pong!"
        } 
        }
        public static boolean isHoopy(int x) 
        { 
            boolean hoopyFlag;
        
            if (x%2 == 0) 
            {
        
                hoopyFlag = true;
            } else 
            {   hoopyFlag = false;  }

        return hoopyFlag;
        
        }

        public static boolean isFrabjuous(int x) { 
            boolean frabjuousFlag;
        
            if (x > 0) {
            frabjuousFlag = true;
          } else {
            frabjuousFlag = false; 
            }
        return frabjuousFlag; 
    }
}