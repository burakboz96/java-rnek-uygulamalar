
package asal.olup.olmadığı.bulma;
import java.util.Scanner;
public class AsalOlupOlmadığıBulma {

    public static void main(String[] args) {
        
    Scanner scan= new Scanner (System.in);
        
        System.out.println("LÜTFEN BİR SAYI GİRİNİZ");
       int sayı =scan.nextInt();

    int sayac=0;
    
    for(int i=2;i<sayı;i++){
     if(sayı%i==0)   
     sayac++;
     }
     if (sayac==0)
            System.out.println(sayı+" ASAL SAYIDIR");  
     else 
            System.out.println(sayı+" ASAL SAYI DEĞİLDİR"); 
    
     if(sayı==0  ||  sayı==1) {
         
         System.out.println(sayı+" SAYISI ASAL DEĞİLDİR");   
     }  
        
    }
    
}
