package com.gecko.collections;

/**
 * Created by hlieu on 12/12/16.
 */
public class LinkedList {
   // all members of a class have access to private variables
   // this means methods of this class see these private variables
   // and inner classes of LinkedList can see these private variables
   // and inner classes can see the private methods of this class

   // This class can see the private members of this class
   // meaning that the private methods of this class can
   // see the private inner class (and its members)
   private Node head;
   private Node last;

   public LinkedList () {
      head = null;
   }

   public void add (Object value) {
      Node n = new Node(value);

      if (null == head) {
         head = n;
      } else {
         last.next = n;
      }

      last = n;
   }

   public Object remove (Object val) {
      Node curr = head;

      if( curr.value.toString ().equals (val.toString())) {
         if( last == head ) {
            head = last = null;
         } else {
            head = head.next;
         }
         return curr;
      }

      Node prev = curr;
      curr = curr.next;

      while (curr != null) {

         if ( curr.value.toString() .equals ( val.toString() ) ) {
            prev.next = curr.next;
            if(curr == last) {
               last = prev;
            }
            return curr.value;
         }

         prev = curr;
         curr = curr.next;
      }
      return null;
   }

   public void printList () {
      Node tmp = head;

      while (null != tmp) {
         System.out.println ( tmp.value.toString() );
         tmp = tmp.next;
      }
      System.out.println ("end list");
   }

   public void reverse () {
      System.out.println("reversing list");
      if (head == last) { return; }

      Node prev = head;
      Node curr = head.next;
      Node next;

      // set last to head and 
      last = head;
      last.next = null;

      while ( curr != null ) {
         // hang onto curr.next, make sure we have a place to go
         next = curr.next;

         curr.next = prev;
         prev = curr;
         curr = next;
      }

      head = prev;
   }

   private class Node {

      public Node (Object o) {
         this.value = o;
         next = null;
      }

      private Node next;
      private Object value;
   }
}
