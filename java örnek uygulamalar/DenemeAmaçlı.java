
package deneme.amaçlı;

import java.util.Random;
import java.util.Scanner;


public class DenemeAmaçlı {

    public static void main(String[] args) {
    
    int rasgele1,rasgele2;
     Scanner scan=new Scanner (System.in);
     Random rand=new Random(); 
       
   
   
    rasgele1=rand.nextInt(11);
    rasgele2=rand.nextInt(11);  
   
  System.out.println(rasgele1 +"*"+rasgele2+"= İŞLEMİNİN SONUCU KAÇTIR?");  
       
  int sonuc=scan.nextInt();
     

    if(rasgele1*rasgele2==sonuc)  
   System.out.println("TEBRİKLER DOĞRU CEVAP VERDİNİZ");  
    else if(rasgele1*rasgele2!=sonuc) 
   System.out.println("YANLIŞ CEVAP VERDİNİZ CEVAP:"+rasgele1*rasgele2); 
       
   
  
  
  
  
        
    }
    
}
