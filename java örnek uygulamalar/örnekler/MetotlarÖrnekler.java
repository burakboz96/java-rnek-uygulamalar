
package metotlar.örnekler;
import java.util.Scanner;
public class MetotlarÖrnekler {

  // metotlar genel anlamda 1 kere  yazılan kodun tekrar tekrar kullanılmasını sağlar.
   public static void faktoriyel (int sayı){
         
        
      int faktoriyel=1;
    
      
          while(sayı>0){
       faktoriyel*=sayı;
       sayı--; 
       }
      
        System.out.println("SONUÇ="+ faktoriyel);
   }
   
    public static void main(String[] args) {
    
    faktoriyel (3);
   faktoriyel(5);  
    }
    
}
  