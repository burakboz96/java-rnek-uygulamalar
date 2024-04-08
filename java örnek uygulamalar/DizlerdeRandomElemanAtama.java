
package dizlerde.random.eleman.atama;

import java.util.Scanner;
import java.util.Random;

public class DizlerdeRandomElemanAtama {

   
  public static void main(String[] args) {
     int rasgele1,rasgele2 ;
   String[] dizi1={ "ahmet ","selim ","osman","hasan","hüseyin","mehmet"};
    char []dizi2={'!','%','?' };
   Scanner scan= new Scanner (System.in);
   Random rand=new Random(); 
      System.out.println("lütfen bir sayı girin");
  int sayi=scan.nextInt();
 
 
 rasgele1 =rand.nextInt( dizi1.length);
  rasgele2 =rand.nextInt(dizi2.length);

      System.out.println(""  +sayi+   ". "   +dizi1[rasgele1]);   
 System.out.println(""    +sayi+   ". "     +dizi2[rasgele2]); 
   
  
//      int a=4;
//      int b;
// 
//        b=a++;
//        System.out.println("a="  +a);
//        System.out.println("b="  +b);
//        
//        
        
        
    }
    
}
