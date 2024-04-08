
package metot.örnek.pkg4.ort.hesaplama;

import java.util.Scanner;
public class MetotÖrnek4OrtHesaplama {

    
    public static int sayılar(int a,int b,int c){
        
   int ort=(a+b+c)/3;
    
        return ort;
        
    }
    

    
    public static void main(String[] args) {
   
    Scanner scan =new Scanner(System.in) ;
    
    
      System.out.println("1.SAYIYI GİRİNİZ");
    int sayı1=scan.nextInt();
      
      
        
        
          System.out.println("2.SAYIYI GİRİNİZ");
       int sayı2=scan.nextInt();
      
         
        
          System.out.println("3.SAYIYI GİRİNİZ");
        
        int sayı3=scan.nextInt();
      
        System.out.println("SONUÇ=  "+sayılar(sayı1,sayı2,sayı3));
        
        
    }
    
}
