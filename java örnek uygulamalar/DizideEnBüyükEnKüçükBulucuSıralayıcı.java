
package dizide.en.büyük.en.küçük.bulucu.sıralayıcı;

import java.util.Scanner;

public class DizideEnBüyükEnKüçükBulucuSıralayıcı {

  
    public static void main(String[] args) {
  
   Scanner scan=new Scanner (System.in);       
    int[] dizi=new int[10];
    
     int top=0;
     int enbuyuk=0,enkucuk=0;
      
      System.out.println("DİZİNİN  ELEMANINI GİRİNİZ");
     
     for(int i=0;i<dizi.length;i++){//10 yazılabilir     
    dizi [i] =scan.nextInt();
  //----------------------------------------  
 
     
         top+=dizi[i] ;      
//----------------------------------------- toplam bulduruyo
    if(i==0){
      enbuyuk=dizi[i];  
      enkucuk=dizi[i];    
       
    }
    
    if(dizi[i]>enbuyuk){
    enbuyuk=dizi[i] ;             
    }     
    if(dizi[i]<enkucuk){
    enkucuk=dizi[i] ;         
    }
  //--------------------------------------- küçük ve büyük olanı bulduruyor  
     }   
    
    
     System.out.println("DİZİNİN EN BÜYÜK ELEMANI "+enbuyuk); 
     System.out.println("DİZİNİN EN KÜÇÜK ELAMANI "+enkucuk);
    System.out.println("FARK "+(enbuyuk-enkucuk));
    System.out.println("ELEMANLAR TOPLAMI:"+top);
  
    }
    
}
