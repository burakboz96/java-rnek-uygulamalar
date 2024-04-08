

package oop.örnek.pkg1;

public class OopÖrnek1 {

     
    public static void main(String[] args) {
     
   Car car1=new Car ();
  
     car1.setColor("PEZEVENK MAVİSİ");
     
      
       car1.model="BMW M4" ;
       car1.enginepower="10000 TORK";
     car1.door  =4;
     
          System.out.println("ARABANIN RENGİ= "+car1.getColor());
        System.out.println("ARABANIN MODELİ= "+car1.model);
        System.out.println("ARABANIN GÜCÜ= "+car1.enginepower);
        System.out.println("ARABANIN KAPI SAYISI= "+car1.door);
     
        
    }
    
}
