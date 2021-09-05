import java.util.ArrayList; // import the ArrayList class



public class X21 {
 public static void main(String[] args) {


    Dec2Oct("23");
    // starting value with a ZERO, will print the Octal number


 } // End Main















// Method ---------------------------------------------------------------------


  static void Dec2Oct(String Dec) {
/*
      // String input => Character Array ---------------------------------------
      ArrayList<Character> arr = new ArrayList<Character>();
      int lenght = Dec.length();

      for (int i = 0; i < lenght; i++) {
          char ch1 = Dec.charAt(i);
          arr.add(ch1);
          // System.out.println(arr.get(i)); // 0 2 3
      }

      // add Zero to the start -------------------------------------------------
      // Octal value in java can be shown when a Int type has a 0 add the start
      if (arr.get(0) != '0') {
          arr.add(0, '0'); }

      // ArrayList => String ----------------------------------------------------
      String str = arr.toString().replaceAll("[,\\s\\[\\]]", "");
      int output = Integer.parseInt(str);
      System.out.println(output);
*/


/*
1. String input => Character Array
2. Check first index value == 0
3. if NOT: array.add(0) and the end of the Array
4. Else do nothing
5 Character Array => to String
6. String => int
7 Print or return
*/


System.out.println(Integer.toOctalString(8));  


            // System.out.println("Octal number: " +Dec);

   } // End Method




} // End Class
