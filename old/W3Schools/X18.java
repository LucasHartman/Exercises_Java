import java.util.ArrayList; // import the ArrayList class
import java.io.*;
import java.util.*;

/*
Write a Java program to multiply two binary numbers.

Test Data:
Input first binary number: 110
Input second binary number: 101
*/



public class X18 {
 public static void main(String[] args) {


  Mul2binary("110", "101");


 } // End main


  static void Mul2binary(String inputB1, String inputB2) {


   // input Convert to Arrays: B1 / B2 ---- ------------------------------------


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
   // B1 = 011
   // B2 = 101

//------------------------------------------------------------------------------


//Create Result Array + inputs of 0
ArrayList<Integer> result = new ArrayList<Integer>();

// add input values {,0,0,0,0,...}
for (int i = 0; i < B1.size(); i++) {
 result.add(0);
}

int sumpv = 0;
int carry = 0;


// Solve Multiply Bineary
for (int j = 0; j < B1.size(); j++) {      // outer loop

 for (int i = 0; i < B1.size(); i++) {

  sumpv = B2.get(j) * B1.get(i);           // Multiply Place Values
  /*
  L1
  1x0=0
  1x1=1
  1x1=1

  L2
  0x0=0
  0x1=0
  0x1=0

  L3
  1x0=0
  1x1=1
  1x1=1
  */
  System.out.println(B2.get(j) +" x " +B1.get(i) +" = "  +sumpv);


  if (sumpv == 0) {
   result.set(i, 0);
   carry = 0;
  }

  else if (sumpv == 1) {
   result.set(i, 1);
   carry = 0;
  }

  else if (sumpv == 2) {
   result.set(i, 0);
   carry = 1;
  }

  else { // 3
   result.set(i, 1);
   carry = 1;
  }




 } // End Inner Loop



/* ADDING 0 ERROR//////////////////////////////////////////////
// Add j number of 0('s) per loop
for (int k = 0; k < j; k++) {
result.add(8);
}
Collections.reverse(result);



for (int i = 0; i < result.size(); i++) {
System.out.println(result.get(i));
}
*/


} // End Outer Loop


for (int i = 0; i < result.size(); i++) {
System.out.println("Result: Loop" +i +" " +result.get(i));
}











/*/////////////////////////////////////////////////////////////////////////////

//Create Result Array + inputs of 0
ArrayList<Integer> result = new ArrayList<Integer>();
// add input values {,0,0,0,0,...}
for (int i = 0; i < B1.size(); i++) {
 result.add(0);
}
//Starter values
int carry = 0;
int sumpv = 0;                    // sum of multiply place value
int sumtt = 0;                    // sum of multiply place value + current




// Solve Multiply Bineary
for (int j = 0; j < B1.size(); j++) {      // outer loop

 for (int i = 0; i < B1.size(); i++) {


  sumpv = B2.get(i) * B1.get(j);

  sumtt = result.get(j) + sumpv + carry;   // result + sum

  if (sumtt == 0) {
   result.set(j, 0);
   carry = 0;
  }

  else if (sumtt == 1) {
   result.set(j, 1);
   carry = 0;
  }

  else if (sumtt == 2) {
   result.set(j, 0);
   carry = 1;
  }

  else { // 3
   result.set(j, 1);
   carry = 1;
  }


  System.out.println("print sumpv " +sumpv); ////////////////////////////////////////// 0     1 0 1 1 0 1 <> 1 0 1 1 0 1 0

 } // End inner loop

 // result.add(1);

} // End outer loop

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
// 11110



*/

  } // End Method


} // End Class


















//=============================================================================
/*

int sumv;                                    // carrys place value awnser
int toto;                                    // awnser + array
int move = 0;                                // move set locatoin by 1 each outer loop

int[] sum listarray = {0 ,0 ,0 }; // = lenght B1

oi = 0

// Start inner loop 0
// length inner looop == B1 length

sumpv = B2: place value 0 oi       x      B1: place value 0 ii         // multiply place values
toto = sumArray.get(0 'ii') + sumpv                                    // add up
sum.set(0 'ii'+ move, sumpv);                                                // set to array
// 0, 0, 0

sumpv = B2: place value 0 oi       x      B1: place value 1 ii         // multiply place values
toto = sumArray.get(1 'ii') + sumpv                                    // add up
sum.set(1 'ii', sumpv);
// 0, 1, 0

sumpv = B2: place value 0 oi       x      B1: place value 2 ii         // multiply place values
toto = sumArray.get(2 'ii') + sumpv                                    // add up
sum.set(2 'ii', sumpv);
// 0, 1, 1

// End inner loop 0

add.sum(0)                                                    // add extra place value

int[] sum listarray = {0, 0 ,1 ,1 };                          // current sum

oi++
move++


// Start inn loop 1

sumpv = B2: place value 0 oi       x      B1: place value 0 ii         // multiply place values
toto = sumArray.get(0 'ii') + sumpv                                    // add up
sum.set(0 'ii' +move, sumpv);

*/
