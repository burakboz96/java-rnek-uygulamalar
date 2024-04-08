

package oop.örnek.pkg4;

class fenerbahçe {
    
 private final String name;
 private final int beraberlik;
 private final int yenilgi;
 private final int kazanan;
 
 
 fenerbahçe(String name,int beraberlik,int yenilgi,int kazanan){
    this.name=name;
    this.beraberlik=beraberlik;
    this.yenilgi=yenilgi;
    this.kazanan=kazanan; 
     
     
 }
 public double  getPuan(){
   return (kazanan*3+(beraberlik)) ;
    
    
} 
 
 
  void bilgilerigöster(){
      System.out.println("TAKIMIN İSMİ= "+this.name); 
      System.out.println("BERABERLİK= "+this.beraberlik);
      System.out.println("KAZANAN= "+this.kazanan);
      System.out.println("YENİLGİ= "+this.yenilgi);
      System.out.println("TAKIMIN PUANI "+this.getPuan());
}  
}
