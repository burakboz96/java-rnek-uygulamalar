
package zar.atılması;

import java.util.Random;


public class ZARATILMASI {

    public static void main(String[] args) {
    int zar1,zar2;    
    Random rand=new Random();
    zar1=rand.nextInt(7);
    zar2=rand.nextInt(7);        
       
        
   
    if(zar1==0){
     zar1++;
    }   
 
   if(zar2==0){
     zar2++;  
    
   }
 
     System.out.println("1.ZAR= "+zar1);  
     System.out.println("2.ZAR= "+zar2); 
     
     
     if ((zar1==6 && zar2==6)){    
    System.out.println("TEBRİKLER DÜŞEŞ ATTINIZ!!!");     
    }
    
    }
    
}
