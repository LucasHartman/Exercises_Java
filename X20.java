import java.util.ArrayList; // import the ArrayList class
import java.util.*;
import java.lang.Math;


public class X20 {
 public static void main(String[] args) {


    Dec2Hex(2000);


 } // End Main















// Method ---------------------------------------------------------------------


  static void Dec2Hex(double Dec) {


   // Generate Exponents(16) List ---------------------------------------------


   // Array: Exponents
   ArrayList<Double> Exponents = new ArrayList<Double>();

   // Attributes
   int i =0;
   double Exp = 0;

   // Loop
   while(i<100) {

       Exp = Math.pow(16,i);
       Exponents.add(Exp);

       i++;

       if (Exp < Dec) {
        continue;
       }
       else {
         break;
       } // End Statement

    } // End Loop

Collections.reverse(Exponents);          // reveste Lsit
Exponents.remove(0);                     // Remove Exponent


/*
    //Test
    for (int j=0; j < Exponents.size(); j++) { // 256.0  16.0  1.0 /////////////////////////////////////////////
     System.out.println(Exponents.get(j));
    }
*/


// Get Hex Place Values -------------------------------------------------------


   ArrayList<Double> Hex = new ArrayList<Double>(); // input place value count
   double Remainder = Dec;
   double Leftover;
   double Count;

   for (int l = 0; l < Exponents.size(); l++) {
    Leftover = Remainder;
    // System.out.println("Starter value " +Remainder); // 2000 - 208 - 0 ///////////////////
    Remainder = Remainder % Exponents.get(l);
    /*
    2000 % 256 = 208
    208  % 16  = 13
    0    % 1   = 0

    */
    // System.out.println("Remainder = " +Remainder); // 208 - 0 - 0 ////////////////////////

    Count = (Leftover - Remainder) / Exponents.get(l);
    // 4000 - 208 / 256 = 7
    // 208  - 0   / 16  = 13
    // 0    - 0   / 1   = 0
    //
    Hex.add(Count);
   } // End Loop


/*
for (int z=0; z < Hex.size(); z++) {
 System.out.println("result for Hex: " +Hex.get(z)); // 7.0 - 13.0 - 0.0 /////////////////
}
*/


// Convert Arraylist to array  and to  String-----------------------------------


int AL = Hex.size();                       // ArrayList Lenght
double[] res = new double[AL];
// ArrayList / Array
for (int p = 0; p < Hex.size(); p++) {
 res[p] = Hex.get(p);                    // Input items
}


System.out.println(Dec +"(Decimal) = " +Arrays.toString(res).replace(", ", "").replace("[", "").replace("]", "").replace(".0", "").replace("10", "A").replace("11", "B").replace("12", "C").replace("13","D").replace("14","E").replace("15","F").replace("16","G") +"(Hex)");
// 7D0

/*

10 = A;
11 = B;
12 = C;
13 = D;
14 = E;
15 = F;
16 = G;
*/

   } // End Method

} // End Class
