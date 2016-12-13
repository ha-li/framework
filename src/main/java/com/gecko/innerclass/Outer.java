package com.gecko.innerclass;

/**
 * Created by hlieu on 12/12/16.
 *
 * An outer class can fully access all of the
 * inner classes members (methods and variables)
 * regardless of the inner members accessibility.
 *
 * This should be intuitive because just like
 * private methods can access private members
 * of the same class, the inner class is considered
 * a member of the out class, so all the inner
 * class is fully accessible, regardless of accessibility.
 *
 * Likewise, the inner class can fully access all of
 * the outer class for the same reason.
 * 
 */
public class Outer {

   private int outer_private_int;

   public Outer (int v) {
      outer_private_int = v;
   }

   public void accessInnerFully () {
      Inner in = new Inner(3);
      in.inner_private_int = 100;
   }

   public int printInner () {
      Inner in = new Inner(3);
      return in.inner_private_int;
   }

   public int userInnerToAccessOuter () {
      Inner in = new Inner(3);
      return in.getOuterPrivates ();
   }

   private class Inner {
      private int inner_private_int;
      private Inner (int v) {
         inner_private_int = v;
      }

      private int getOuterPrivates() {
         return outer_private_int;
      }
   }
}
