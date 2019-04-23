
/**
 * Chuong4Cau4
 */
public class Chuong4Cau4 {
    public static void zoop(String fred, int bob) 
    { 
        System.out.println(fred); //3 //7.2
        
        if (bob == 5) {
          ping("not "); //4.1
        } else {
        System.out.println("!"); } //8
    }
    public static void main(String[] args) 
    { 
        int bizz = 5; int buzz = 2; //1
        zoop("just for", bizz); //2
        clink(2*buzz); //5 
    }
    public static void clink(int fork) 
    { 
        System.out.print("It's "); //6
        zoop("breakfast ", fork); //7.1
    }
    public static void ping(String strangStrung) 
    { 
        System.out.println("any " + strangStrung + "more "); //4.2
    } 
    
}

/*KQ cua chuong trinh: 
    just for
    any not more
    It's breakfast
    !
*/