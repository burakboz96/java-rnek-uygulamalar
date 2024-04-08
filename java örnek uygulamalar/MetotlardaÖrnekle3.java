
package metotlarda.örnekle.pkg3;
import java.util.Scanner;

public class MetotlardaÖrnekle3 {

  
  public static  double uzunluk (double kenar1,double uzunluk1){   //static in yanına void kullanmadık çünkü return ile void kullanılmaz
    
      double alan=(kenar1*uzunluk1)/2;
      return alan;
}   
    
    
    
    
    public static void main(String[] args) {
         
      Scanner scan =new Scanner (System.in);
        System.out.println("lütfen 1. kenar uzunluğunu girin");
    int   kenar1=scan.nextInt();
       
      System.out.println("lütfen 2. kenar uzunluğunu girin");
    int   uzunluk1=scan.nextInt();
        
        System.out.println(" ÜÇGENİN ALANI=  "+ uzunluk(kenar1,uzunluk1));
    
    
    
    }
    
}
