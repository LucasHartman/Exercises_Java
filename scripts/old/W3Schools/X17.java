import java.util.ArrayList; // import the ArrayList class
import java.io.*;
import java.util.*;


public class X17 {
 public static void main(String[] args) {


  add2binary("10101", "11100");


 } // End main











//-----------------------------------------------------------------------------

  static void add2binary(String inputB1, String inputB2) {


// input Convert to Arrays: B1 / B2 ---- ---------------------------------------


   // Array: input B1
   ArrayList<Integer> B1 = new ArrayList<Integer>();

   // String Items to Array
   for (int i = 0; i < inputB1.length(); i++) {
    char charB1 = inputB1.charAt(i);             // Get character
    int con = Character.getNumericValue(charB1); // convert: char to int
    B1.add(con);                                 // add to array
      }


  // Array: input B2
  ArrayList<Integer> B2 = new ArrayList<Integer>();

  // String Items to Array
  for (int i = 0; i < inputB2.length(); i++) {
   char charB2 = inputB2.charAt(i);             // Get character
   int con2 = Character.getNumericValue(charB2); // convert: char to int
   B2.add(con2);                                 // add to array
     }


// Give shortest array eqaul place value----------------------------------------


   // Get largest number
   int biggest;
   int rem;

   if (B1.size() >= B2.size()) {
       biggest = B1.size();
       rem = B1.size() - B2.size();

       for (int i=0; i < rem; i++) {
        B2.add(0);
       } // End Loop
   } // End if statement

   else {
    biggest = B2.size();
    rem = B2.size() - B1.size();

    for (int i=0; i < rem; i++) {
     B1.add(0);
    } // End Loop
   } // End Else


// Reverse lists----------------------------------------------------------------


Collections.reverse(B1);
Collections.reverse(B2);


// Add up each place value -----------------------------------------------------


    ArrayList<Integer> result = new ArrayList<Integer>();
    int carry = 0;


   for (int i = 0; i < B1.size(); i++) {

    int addB1 = B1.get(i);
    int addB2 = B2.get(i);
    int sum = addB1 + addB2 + carry;


              if (sum == 0) {
               result.add(0);
               carry = 0;
              }

              else if (sum == 1) {
               result.add(1);
               carry = 0;
              }

              else if (sum == 2) {
               result.add(0);
               carry = 1;
              }

              else { // 3
               result.add(1);
               carry = 1;
              }
   } // End Loop


// Add last value---------------------------------------------------------------


if (carry == 1) {
 result.add(1);
}

Collections.reverse(result);


// Convert Arraylist to array  and to  String-----------------------------------


int AL = result.size();                       // ArrayList Lenght
int[] res = new int[AL];
// ArrayList / Array
for (int i = 0; i < result.size(); i++) {
 res[i] = result.get(i);                    // Input items
}


//OUTPUT
System.out.println(inputB1 +" + " +inputB2 +" = " +Arrays.toString(res).replace(", ", "").replace("[", "").replace("]", ""));


 } // Method

} // End Class
