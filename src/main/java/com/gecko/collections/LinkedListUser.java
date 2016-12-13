package com.gecko.collections;

/**
 * Created by hlieu on 12/12/16.
 */
public class LinkedListUser {

   public static void main (String[] args) {

      LinkedList linkedList = new LinkedList ();

      linkedList.add(new Integer(5));
      linkedList.add(new Double(2.3));
      linkedList.printList ();

      Object g = linkedList.remove(5);
      linkedList.printList ();

      linkedList.add(5);
      linkedList.printList ();

      g = linkedList.remove(5);
      linkedList.printList ();

      linkedList.add (4);
      linkedList.add(7);
      linkedList.add(3);
      linkedList.add(2);
      linkedList.printList ();

      g = linkedList.remove(7);
      linkedList.printList ();

      linkedList.add(18);
      linkedList.printList ();

      linkedList.remove(18);
      linkedList.printList ();

      linkedList.add(23);
      linkedList.printList ();

      linkedList.reverse ();
      linkedList.printList ();

      linkedList.remove (23);
      linkedList.remove (2);
      linkedList.printList ();

      linkedList.remove (2.3);
      linkedList.remove (4);
      linkedList.remove (3);
      linkedList.printList ();
      linkedList.reverse();
      linkedList.printList ();
   }
}
