

package metotlarda.örnek.pkg3.büyük.küçük.bulucu;
import java.util.Scanner;
public class MetotlardaÖrnek3BüyükKüçükBulucu {

    
  public static int enbuyuk(int a,int b,int c){
      
    int bul =Math.max(Math.max(a,b),c);
            
      return bul;
     } 
        
   
  public static int enkucuk(int a,int b,int c){
      
         
    int bul2 =Math.min(Math.min(a,b),c);
            
      return bul2 ;   
  }
  
    public static void main(String[] args) {
        
      Scanner scan=new Scanner (System.in);
      System.out.println("1.SAYIYI GİRİNİZ");
    int sayı1=scan.nextInt();
      
        
          System.out.println("2.SAYIYI GİRİNİZ");
       int sayı2=scan.nextInt();
      
      
           System.out.println("3.SAYIYI GİRİNİZ");
         int sayı3=scan.nextInt();
      
          System.out.println("EN BÜYÜK=  "+enbuyuk(sayı1,sayı2,sayı3));  
        System.out.println("EN KÜÇÜK=  "+enkucuk(sayı1,sayı2,sayı3));
        
        
        
       
        
     
    }
    
}
