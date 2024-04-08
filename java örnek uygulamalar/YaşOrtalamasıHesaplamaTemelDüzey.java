
package yaş.ortalaması.hesaplama.temel.düzey;

import java.util.Scanner;


public class YaşOrtalamasıHesaplamaTemelDüzey {

    public static void main(String[] args) {
         Scanner oku= new Scanner (System.in);
  double kardeş1,kardeş2,ort,top;//DOUBLE ALMAMIZIN SEBEBİ ORTALAMANIN VİRGÜLLÜ ÇIKMASINDAN ÖTÜRÜ OLUŞABİLECEK DURUMDAN DOLAYI
  System.out.println("1.KARDEŞİN YAŞINI GİRİNİZ");
   kardeş1=oku.nextInt();
  System.out.println("2. KARDEŞİN YAŞINI GİRİN");// KARDEŞİN YAŞINI EKRANA YANSITIP NEXTINT YAPMAN LAZIM
  kardeş2=oku.nextInt();
  ort=kardeş1+kardeş2/2;
   System.out.println("ORTALAMASI="+ort);
  top=kardeş1+kardeş2;
  System.out.println("YAŞLARI TOPLAMI"+top);
        
        
  
  
        
        
        
  
  
  
    }
  
  
  
  
  
          
  
  
}
