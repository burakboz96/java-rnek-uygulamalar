
package vezne.en.az.sayıda.küpür.ile.para.verme;

import java.util.Scanner;

public class VezneEnAzSayıdaKüpürIleParaVerme {

    public static void main(String[] args) {
      
    Scanner gir=new Scanner (System.in);
   int para , sa, i;
 
    int dizi[] ={200,100,50,20,10,5,1}; 
      
    System.out.println("PARA MİKTARINI GİRİNİZ:");  
        
   para=gir.nextInt();    
  
  for(i=0;i<7;i++ ) {     
  sa=para/dizi[i] ;   
   para=para-sa*dizi[i];   
    
   if(sa!=0){
    System.out.println(sa+" ADET "+dizi[i]+" TL,");
    
   }
  }
       
  System.out.println("VERMELİSİNİZ");      
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
