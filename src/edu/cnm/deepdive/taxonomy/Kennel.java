/*
 * Kennel.java
 */
package edu.cnm.deepdive.taxonomy;

/**
 * This class exercises the {@link Canis}, {@link CanisLupus}, 
 * and {@link CanisLupusFamiliaris}
 * classes to demonstrate inheritance and polymorphisim.  This models
 * binomial taxonomy of genus and species, as well as sub-species.
 * 
 * 
 * @author Admin
 *
 */
public class Kennel {

  /**
   * Runs a test using the {@link CanisLupus} and
   * {@link CanisFamiliaris} classes.  Command line
   * arguments ignored.
   * 
   * @param args    Command line arguments (ignored).
   */
  public static void main(String[] args) {
   CanisLupus whiteFang = new CanisLupus();
   CanisLupus spot = new CanisLupusFamiliaris(false);
   CanisLupus fido = new CanisLupusFamiliaris(true);
   System.out.println("White Fang:");
   showOff(whiteFang);
   System.out.println("Spot:");
   showOff(whiteFang);System.out.println("Fido:");
   showOff(whiteFang);

  }

  /**
   * Invokes a number of methods on the {@link CanisLupus}
   * instance passed to it as a parameter.  If the instance
   * type is actually {@link CanisLUpusFamiliaris}, then
   * the {@link CanisLupusFamiliaris#is GoodBoy()} method
   * is also invoked.
   * 
   * @param wolf
   */
  public static void showOff(CanisLupus wolf)  {
    wolf.describe();
    wolf.hunt();
    wolf.speak();
    if (wolf instanceof CanisLupusFamiliaris) {
      System.out.printf("Is a good boy: %n%n", 
          ((CanisLupusFamiliaris) wolf).isGoodBoy());
       
  }
  }
}
