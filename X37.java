import java.util.ArrayList; // import the ArrayList class
import java.util.*;

public class X37 {
 public static void main(String[] args) {


    ReverseString("I wish I was a bird");


 } // End Main































    // Method -----------------------------------------------------------------


   static void ReverseString(String str) {


    // Reverse String Items ---------------------------------------------------


    // String size
    int size = str.length();

    // Creating array of string length
    char[] ch = new char[size];

    // Copy character by character into array
    for (int i = 0; i < size; i++) {
         ch[i] = str.charAt(i);
        	}

     // Create ArrayList
     ArrayList<Character> List = new ArrayList<Character>();

    // Character array item to ArrayList
    for (int i=0; i < size; i++) {
       List.add(ch[i]);
    } // End Loop
       Collections.reverse(List);



    // Convert Arraylist to array  and to  String-------------------------------


    // Copy character by character into array
    for (int i = 0; i < size; i++) {
         ch[i] = List.get(i);
         }

         System.out.println(ch);


     } // End Method

} // End Class
