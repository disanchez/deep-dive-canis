package edu.cnm.deepdive.taxonomy;

public class CanisLupusFamiliaris extends CanisLupus {

  private boolean goodBoy;
  
  public CanisLupusFamiliaris() {
    goodBoy=true;
  }
  public CanisLupusFamiliaris (boolean goodBoy) {
    this.goodBoy = goodBoy;
  }
  @Override
  public void hunt() {
  System.out.println("Beg for scraps"); 
  }
   
  
  @Override
  public void speak() {
    System.out.println("Bark!");
  }


  public boolean isGoodBoy() {
    return goodBoy;
  }


  public void setGoodBoy(boolean goodBoy) {
    this.goodBoy = goodBoy;
  }
  
  public static void describe() {
    System.out.println( "Canis lupus is the sub-species containing domestic dogs.");
  }

}
