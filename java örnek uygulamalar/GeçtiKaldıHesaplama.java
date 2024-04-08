
package geçti.kaldı.hesaplama;

import java.util.Scanner;

public class GeçtiKaldıHesaplama {

 public static void main(String[] args) {
     Scanner oku = new Scanner(System.in);
     double vize,fınal,ort;
     
     System.out.println("VİZE NOTUNUZU GİRİN");
     vize = oku.nextInt();
     
     while(vize<0 || vize>100){
       System.out.println("GEÇERLİ SAYI GİRİN");
      
     System.out.println("FİNAL NOTUNUZU GİRİN");
     fınal=oku.nextInt();
     
     
    ort =vize*0.4+fınal*0.6;
     System.out.println("ORTALAMANIZ="+ort);
      
   if(ort>=50) System.out.println(" SINAVI GEÇTİNİZ");
    
   else System.out.println("SINAVDAN KALDINIZ");
  
   }
   {
       
   
    
   }          
     
     
            
            
     
            
            
            
            
    }
    
}
