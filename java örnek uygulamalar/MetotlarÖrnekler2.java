
package metotlar.örnekler2;

public class MetotlarÖrnekler2 {



  public static int top (int a,int b){   
      
      int sonuc=0;
      for (int i=a;a<=b;i++){  
          
       sonuc+=i ;
       
      } 
      
        return  sonuc;   
      
 
} 
    public static void main(String[] args) {
    
      System.out.println("1 DEN 10 KADAR TOPLAM= "+top(1,10));
         System.out.println("3 DEN 40 KADAR TOPLAM= "+top(3,40));
        System.out.println("5 DEN 7 KADAR TOPLAM= "+top(5,7));
        
    }
    
}
