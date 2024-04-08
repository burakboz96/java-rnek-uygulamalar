
package kalıtımda.sağlam.örnek;


class dıkdortgen extends renk {
  
   private double genişlik=7;
   private double yükseklik=9;
  
   
   public void setGenişlik(double genişlik){    
    this.genişlik=genişlik;            
   }
   public double getGenişlik(){
      return genişlik;  
       
   }  
   public void setYükseklik(double yükseklik){    
    this.genişlik=genişlik;   
            
   }
   public double getYükseklik(){
      return yükseklik;  
       
   } 
   
   public double getAlan(){
           
      return yükseklik *genişlik; 
       
   }

public double getCevre(){
    
    return 2*(yükseklik+genişlik);
    
}
   
}
