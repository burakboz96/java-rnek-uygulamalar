
package taş.kağıt.makas.oyunu;

import java.util.Random;
import java.util.Scanner;

public class TaşKağıtMakasOyunu {

    public static void main(String[] args) {
       
      int rasgele,giriş ; 
          
  Random rand=new Random();
  rasgele = rand.nextInt(3);

 Scanner scan=new Scanner (System.in);

System.out.println("1) TAŞ MI?")  ; 
System.out.println("2) KAĞIT  MI?")  ; 
System.out.println("3) MAKAS MI?")  ; 
        System.out.println("LÜTFEN BİRİNİ SEÇİNİZ:");

  giriş =scan.nextInt();   
  
if(giriş==3 && rasgele==0)
 System.out.println("BİLGİSAYAR TAŞI SEÇTİ ----BİLGİSAYAR  KAZANDI----");
else if( giriş==3 && rasgele==1  )
 System.out.println("BİLGİSAYAR KAĞIDI SEÇTİ----SEN KAZANDIN TEBRİKLER---- "); 
else if( giriş==3 && rasgele==2  )
 System.out.println(" BERABERE ");   

  
  
if(giriş==2 && rasgele==0)
 System.out.println("BİLGİSAYAR TAŞI SEÇTİ ----SEN KAZANDIN TEBRİKLER----");
else if( giriş==2 && rasgele==1  )
 System.out.println("BERABERE"); 
else if( giriş==2 && rasgele==2  )
 System.out.println("BİLGİSAYAR MAKASI SEÇTİ ----BİLGİSAYAR KAZANDI----");   

                                                
    
   
   
 if(giriş==1 && rasgele==0)
 System.out.println("BERABERE");
else if( giriş==1 && rasgele==1  )
 System.out.println("BİLGİSAYAR KAĞIDI SEÇTİ ----BİLGİSAYAR KAZANDI---- "); 
else if( giriş==1 && rasgele==2  )
 System.out.println("BİLGİSAYAR MAKASI SEÇTİ ----SEN KAZANDIN TEBRİKLER----");   
  
 
 
 
 
    }
    
}
