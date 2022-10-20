
package harcosvarazslo;

import java.util.Random;
import java.util.Scanner;

public class HarcosVarazslo {

    public static void main(String[] args) {
       Random rnd = new Random();
       Scanner sc = new Scanner(System.in); 
       
       String h = "Harcos";
       String v = "Varázsló";
       int helet = 9;
       int velet = 9;
       int hhely = rnd.nextInt(3) + 1;
       int vhely = rnd.nextInt(3) + 1;
       int dobas = rnd.nextInt(6) + 1;
       
       System.out.println("A "+h+" életereje: "+helet);
       System.out.println("A "+h+" helye: "+hhely);
       System.out.println("");
       System.out.println("A " + v + " életereje: " + velet);
       System.out.println("A "+v+" helye: "+vhely);
       
        if (vhely==hhely) {
            
        }
    }
    
}
