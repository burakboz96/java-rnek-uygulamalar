
package bir.sayının.ebob.ve.ekok.unu.bulma;

import java.util.Scanner;

public class BirSayınınEbobVeEkokUnuBulma {    
    public static void main(String[] args) {
      Scanner scan= new Scanner (System.in);
     double  s1 ,s2,ebob, ekok;
      
        System.out.println("LÜTFEN EBOB VE EKOKUNU ALMAK İSTEDİĞİNİZ 2 SAYI GİRİNİZ");   
      s1=scan.nextInt();
      s2=scan.nextInt();
      
      
    if(s1<s2) ebob=s1;
    else ebob=s2;
    while((s1%ebob!=0) || (s2% ebob!=0)){
     ebob=ebob-1;      
    } 
    
    if(ebob==1){
        System.out.println("SAYILAR ARALARINDA ASAL SAYILARDIR");
    } 
    else 
            System.out.println("SAYININ EBOB'U:"+ebob);
      
     ekok=s1*s2/ebob;  
          System.out.println("GİRİLEN SAYININ EKOK'U:"+ekok);  
    }
    
}
