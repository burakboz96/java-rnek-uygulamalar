
package çarpım.tablosu;
public class ÇarpımTablosu {
    public static void main(String[] args) {
        System.out.println("                        ÇARPIM TABLOSU                              ");    
        
        System.out.println(" ");   
    for (int j=1;j<=10;j++)
      System.out.print("   "+j);
    System.out.println("\n-------------------------------------------------------------");
    // tablonun genel ayarları
    
    // TABLONUIN GÖVDESİ SAYISAL KISIM
    for(int i=1;i<=10;i++){
   System.out.print(i+"|");
        
   for (int j=1;j<=10;j++){
  System.out.printf("%4d",i*j);
    
   }
      System.out.println("           ");

    }
    
    
    
        
        
        
             
        
        
    }
    
}
