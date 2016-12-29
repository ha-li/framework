package com.gecko.strings;

/**
 * Created by hlieu on 12/28/16.
 */
public class Strings {

   public static String normalize (String input) {
      String[] tokens = input.split("/");
      String path = "";

      for(int i = 0; i < tokens.length; i++) {
         if (tokens[i].equals("..")) {
            // starting point of 2nd last "/"
            int last = path.lastIndexOf("/", path.length() - 1 - 1);
            path = path.substring(0, last + 1);
         } else if (tokens[i].equals(".")) {
            continue;
         } else {
            path = path.concat(tokens[i] + "/");
         }
      }

      return path.substring (0, path.length() - 1);
   }

   public static void main(String args[]) {
      String path = Strings.normalize ( "/folder1/folder2/.././../folder3/folder4");
      System.out.println (path);
   }

}
