
package hesap.makinesi;

import java.util.Scanner;

public class HesapMakinesi {

        public static void main(String[] args) {
     Scanner scan= new Scanner (System.in);
     float sayi1 ,sayi2;
     double seçim;
        System.out.println("İLK SAYIYI GİRİNİZ:");
        sayi1=scan.nextInt();
        System.out.println("İKİNCİ SAYIYI GİRİNİZ:");
        sayi2=scan.nextInt(); 
        System.out.println("(LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ)");
        System.out.println("1-TOPLAMA,2-ÇIKARMA,3-ÇARPMA,4-BÖLME");
        System.out.println("SEÇİMİNİZ:");
        seçim=scan.nextInt();
        
        if(seçim==1)
        System.out.println("SONUÇ:"+  (sayi1+sayi2));
         
        else if(seçim==2)
        System.out.println("SONUÇ:"+  (sayi1-sayi2));
        
        else if(seçim==3)
        System.out.println("SONUÇ:"+  (sayi1*sayi2));
        else if(seçim==4)
        if(sayi2==0)
        System.out.println("ÇIKAN SONUÇ REEL SAYILAR KÜMESİNDE TANIMSIZDIR");
        else
        System.out.println("SONUÇ:"+  (sayi1/sayi2));
      
        
        
      
        
        
        
        
            
            
             
     
     
    }
    
}
