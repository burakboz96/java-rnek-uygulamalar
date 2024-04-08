
package oopörnek3;


class calısan {
  
 private final String name;
 private final String departman;                // KAPSÜLLEME ÖRNEKLER
 private final int maaş;
 private final int numara;   
  
   calısan(String name,String departman,int maaş,int numara){
     this.departman=departman;
     this.maaş=maaş;
     this.name=name;
     this.numara=numara;   
 }
  void bilgilerigöster(){
     System.out.println("   ");   
     System.out.println("BİLGİLER....");   
     System.out.println("İSİM= "+this.name); 
     System.out.println("MAAŞ= "+this.maaş); 
     System.out.println("DEPARTMAN= "+this.departman);
     System.out.println("NUMARA= "+this.numara);
         
      
         
         
      // final anahtar sözcüğü 1 classdaki public veya privateları  sadece 1 kez kullanmana izin veriri yani 4 tane değişkeni olan bir şeyi 3 e indirip kulanamassın oopörnek 5 de bunun örneği var  
         
  }
 
 
 
}
