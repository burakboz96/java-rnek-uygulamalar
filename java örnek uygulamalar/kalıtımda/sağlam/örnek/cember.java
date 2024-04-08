
package kalıtımda.sağlam.örnek;


 public class cember {
  
    private double yarıcap=5;
   
 public void setYarıcap(int yarıcap){ 
  this.yarıcap=yarıcap;
     
 }
    
      public double getyarıcap (){   
       return this.yarıcap;  
          
      }
    
      
      public double getAlan(){
          return (yarıcap*yarıcap*3.14);
          
      }
    
     public double getCevre(){
         
         return (2*3.14*yarıcap);
     }
     
     
    
      
      
}
    