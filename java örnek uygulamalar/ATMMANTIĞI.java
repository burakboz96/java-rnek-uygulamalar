
package atm.mantığı;

import java.util.Scanner;

public class ATMMANTIĞI {

  
    public static void main(String[] args) {
        Scanner scan= new Scanner (System.in);
        int bakiye=5000,secenek,miktar;
        
     System.out.println("SANAL BANKA HOŞGELDİNİZ!!!"); 
     
        System.out.println("  ");
        System.out.println("SAYIN........");
        System.out.println("  ");
     System.out.println("GÜNCEL BAKİYENİZ="+bakiye+"TL");
     System.out.println("LÜTFEN YAPMAK İSTEDİĞİNİZ İŞLEMİ SEÇİNİZ :");
     
     while(bakiye>0){
       System.out.println("1-) PARA YATIR"); 
        System.out.println("2-) PARA ÇEK"); 
         System.out.println("3-) BAKİYE SORGULA"); 
          System.out.println("4-) ÇIKIŞ YAP"); 
         
         secenek=scan.nextInt();
       
         if(secenek==1){
          System.out.println("YATIRMAK İSTEDİĞİNİZ MİKTARI GİRİNİZ:");     
        miktar =scan.nextInt();
        bakiye+= miktar;

         }   else  if(secenek==2){
         System.out.println("ÇEKMEK İSTEDİĞİNİZ MİKTARI GİRİNİZİ:");     
        miktar =scan.nextInt();
         
        if(miktar > bakiye){
            System.out.println("YETERSİZ BAKİYE GİRİŞ MENÜSÜNE YÖNLENDİRİLİYORSUNUZ"); 
            
        }else {
            bakiye-= miktar;
        }
         } else if(secenek==3) {
             System.out.println("GÜNCEL BAKİYENİZ="+bakiye+"TL");
         }
           else if(secenek==4) {
             System.out.println("ÇIKIŞ YAPILIYOR LÜTFEN BEKLEYİNİZ");
          break;
                  }  else {
      System.out.println("GEÇERSİZ BİR İŞLEM GİRDİNİZ LÜTFEN BELİRTİLEN SEÇENKLERDEN BİRİNİ GİRİNİZ");
       }           
                 
     } //BU SÜSLÜ PARANTEZ ÖNEMLİ ATILMASSA HATA VERİR1
     
             System.out.println ("İYİ GÜNLER");
      
    }
    
}
