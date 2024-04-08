
package girilen.sayıları.büyükten.küçüğe.sıralayan.dizi;
import java.util.Scanner;
public class GirilenSayılarıBüyüktenKüçüğeSıralayanDizi {

    public static void main(String[] args) {
       Scanner scan=new Scanner (System.in);
       int i,n;
        System.out.println("LÜTFEN SAYI MİKTARINI GİRİNİZ");
       n=scan.nextInt();
     int dizi [] = new int[n];
  int top=0;
  
        System.out.println("LÜTFEN SAYILARI GİRİNİZ");
    for( i=0;i<n;i++) {  // n gördüğün yere dizi.length de yazılabilir
  dizi[i]=scan.nextInt();
      
top+=dizi[i];
    }    
     double ortalama=top/n;
     System.out.println("GİRİLEN DEĞERLER TOPLAMI= "+top);
     System.out.println("ORTALAMASI= "+ortalama);
        

   
   
        
        
        
        
        
        
        
        
        
        
    }
    
}
