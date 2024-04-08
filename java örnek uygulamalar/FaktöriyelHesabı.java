
package faktöriyel.hesabı;

import java.util.Scanner;


public class FaktöriyelHesabı {
    
    public static void main(String[] args) {
     Scanner yaz = new Scanner(System.in);
        System.out.println("BİR SAYI GİRİNİZ"); 
        int sayı =yaz.nextInt();
        int faktoriyel=1;
        for(int i=1;i <= sayı; i++)
         faktoriyel=faktoriyel*i;  
        
        System.out.println("SONUÇ="+faktoriyel);
    }
    
    
}
