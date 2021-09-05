import java.util.ArrayList; // import the ArrayList class
import java.util.*;


public class X38 {
 public static void main(String[] args) {


    StringSymbolsCount("Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33");


 } // End Main































    // Method -----------------------------------------------------------------


   static void StringSymbolsCount(String str) {

    // Lists
    ArrayList<Integer> letters = new ArrayList<Integer>();
    ArrayList<Integer> spaces = new ArrayList<Integer>();
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    ArrayList<Integer> others = new ArrayList<Integer>();

    // Get UTF8 from Characters
   for (int i = 0; i < str.length(); i++) {
     int code = (int) str.charAt(i); // Character to Int(UFT8 code)
     System.out.println(code);


    // Sort to List------------------------------------------------------------
    
       //letters
       if (code >= 65 && code <= 90 || code >= 97 && code <= 122) {
        letters.add(code);
       } // 65 / 90 - 97 / 122

       //spaces
       else if (code == 32) {
        spaces.add(code);
       } // 32 = space

       //numbers
       else if (code >= 48 && code <= 57 ) {
        numbers.add(code);
       } // 48 / 57

       //others
       else {
        others.add(code);
       }

    } // End Loop


   // Print List Sizes
   System.out.println("This string contains: " +letters.size() +" letters");
   System.out.println("This string contains: " +spaces.size() +" spaces");
   System.out.println("This string contains: " +numbers.size() +" numbers");
   System.out.println("This string contains: " +others.size() +" other symbols");


   } // End Method

} // End Class



/*

38. Write a Java program to count the letters, spaces, numbers and other characters of an input string. Go to the editor
Expected Output

The string is :  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33
letter: 23
space: 9
number: 10
other: 6

*/
