

package vki.hesaplama;

import java.util.Scanner;


public class VkiHesaplama {

   
    public static void main(String[] args) {
        Scanner oku=new Scanner(System.in);
        float boy,kilo,sonuc;
        System.out.println("BOY: Metre Cinsinden Yazın");  
        boy=oku.nextFloat();
        System.out.println("Kilonuzu Girin");
        kilo=oku.nextFloat();
        sonuc= kilo /(boy*boy);
        System.out.println("Vücut kitle indeksiniz:"+ sonuc);
        
        if( sonuc<18.5)
            System.out.println("Vücut Kitle İndeksinize Göre Durumunuz :ZAYIF");
        
        else if (sonuc >=18.5 && sonuc<=24.9)
            System.out.println("Vücut Kitle İndeksinize Göre Durumunuz :NORMAL");
        else if (sonuc>24.9 && sonuc<29.9)//her iki koşuluda sağlamak zorunda
            System.out.println("Vücut Kitle İndeksinize Göre Durumunuz :KİLOLU");
        else if(sonuc>29.9 && sonuc<=34.9 )
            System.out.println("Vücut Kitle İndeksinize Göre Durumunuz :1.DERECEDEN OBEZ");
        else if ( sonuc>=35&& sonuc<=37)
         System.out.println("Vücut Kitle İndeksinize Göre Durumunuz :2.DERECEDEN OBEZ");
        
        
       
    }
    
}
