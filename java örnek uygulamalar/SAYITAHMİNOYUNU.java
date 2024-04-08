
package sayı.tahmin.oyunu;

import java.util.Random;
import java.util.Scanner;

public class SAYITAHMİNOYUNU {
    
    public static void main(String[] args) {
   int tahmin, can=5,sayi;
  Random rand=new Random();
  Scanner scan = new Scanner (System.in);
   sayi = rand.nextInt(100);
  boolean OyunDurumu = false;
  System.out.println("");
  System.out.println("SAYI TAHMİN OYUNUNA HOŞ GELDİNİZ!!!");
  System.out.println("0 İLE 100 ARASI BİR SAYI TAHMİN EDİNİZ");     
  
  
  
  while (0<can){
   System.out.println("TAHMİNİNİZ'İ YAZIN:");
   tahmin=scan.nextInt();
 
   
  if(tahmin>sayi){       
 System.out.println("TAHMİNİNİZ ÇOK YÜKSEK");
  } 
  if(sayi>tahmin){
      
  System.out.println("TAHMİNİNİZ ÇOK DÜŞÜK ");
  }
  
  
   if ((tahmin<0) || (tahmin>100)) {    
     System.out.println("LÜTFEN 0 İLE 100 ARASI BİR SAYI GİRİN ");
    continue;
   }      
  
   if (tahmin==sayi){
  OyunDurumu=true;
   break;
  } else{
    System.out.println("YANLIŞ CEVAP VERDİNİZ   KALAN CAN:"+ --can);
    
   }  
 
    }
  
  if (can==0){
   System.out.println("TUTULAN SAYI= "+sayi);
  
  }
  
  
  if (OyunDurumu){
   System.out.println("TEBRİKLER DOĞRU TAHMİN:");  
   System.out.println("SAYIMIZ:"+sayi);  
    System.out.println("KALAN CAN= "+can);
}
  else {
     System.out.println("CANINIZ BİTTİ TEKRAR DENEYİNİZ");
} 
}
}
 
