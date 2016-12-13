package com.gecko.innerclass;

/**
 * Created by hlieu on 12/12/16.
 */
public class InnerClassUser {

   public static void main (String[] args) {
      Outer out = new Outer(2);
      out.accessInnerFully ();
      System.out.println (out.printInner ());
      System.out.println (out.userInnerToAccessOuter ());
   }
}
