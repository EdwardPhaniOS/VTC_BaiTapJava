public class Buzz 
{
    public static void baffle(String blimp) { 
        System.out.println(blimp); //5: rattle (KQ của blimp)
        zippo("ping", -5); //6: ping zoop (KQ cua zippo)
    }

    public static void zippo(String quince, int flag) 
    { 
    if (flag < 0) {
        System.out.println(quince + " zoop"); //7
    } else { //2
         System.out.println("ik"); //3
         baffle(quince); //4
         System.out.println("boo-wa-ha-ha");  //8
        } 
    }
    public static void main(String[] args) { 
        zippo("rattle", 13); //1
    }
    
    //KQ: ik
    //    rattle
    //    ping zoop
    //    boo-wa-ha-ha
}   