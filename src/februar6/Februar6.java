
package februar6;

import java.util.Scanner;
import static java.lang.Math.*;
public class Februar6 {
    
    
    static Scanner sc = new Scanner(System.in);

    
    public static void main(String[] args) {
       // int n = 4;
         //   while (n < 0) {
         //       System.out.print("N= ");
         //       n = sc.nextInt();
         //   }
         //   int ossz = 0;
        //    for (int i=0; i<n+1 ; i++) {
       //         ossz += 1;
       //     }
       // System.out.printf("Az első &d szám összege: &d\n",n,ossz); 
       
       
       
      // int db = 0;
      // for (int i=10; i<=100; i++) {
         //  if (i % 2 == 0) {
           //    db++;
         //  }
       //}
        //System.out.printf("A kétjegyű párosak száma: &d\n",n,db);
        
        
        //final int VEGE = 0;
        //db = 0;
       // int min = Integer.MAX_VALUE; //2147483647;
       // int szam = 2;
       // while ((szam = sc.nextInt()) != VEGE) {
       //     if (szam < min) {
       //         min = szam;
       //     }
       //     db += 1; 
       // }
        
        
        
        System.out.println("\nSzám:" );
        int n = sc.nextInt();
        boolean prim;
        
        if (n < 2) {
            prim = false;
        
        }
        else {
            int i = 2;
            while (i <= Math.sqrt(n) || n % i != 0) {
                i += 1;
            }
            prim = i > Math.sqrt(n);
        }
        if (prim == true) {
            System.out.println("Prím");
        }
        else {
            System.out.println("Nem prím");
        }
    } //main vége
    
} // class vége
