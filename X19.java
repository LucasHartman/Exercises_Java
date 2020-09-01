import java.util.ArrayList; // import the ArrayList class
import java.io.*;
import java.util.*;


public class X19 {
 public static void main(String[] args) {


  Decimal2Binary(150);


 } // End Main














// Method ---------------------------------------------------------------------


  static void Decimal2Binary(int Dec) {


   // Genarte Factors ----------------------------------------------------------

   // Array: factors
   ArrayList<Integer> Factors = new ArrayList<Integer>();

   // Attributes
   int i =0;
   int Fac = 1;

   // Genrate Factors
   while(i<100) {
   Fac = Fac *2;                          // Geneare Factor
   Factors.add(Fac);                      // add to Array

   //System.out.println(Factors.get(i));//////////////////////////////////////////////
   i++;

     if (Fac < Dec) {                    // Generate only below the input value
      continue;
     }
     else {
       break;
     } // End Statement

   } // End While Loop

   Collections.reverse(Factors);        // Reverse Arrau
   Factors.remove(0);                   // REmove Factor above the input
   //System.out.println(Factors.get(0)); //128//////////////////////////////////////////


   // Setup Result ------------------------------------------------------------

   // Array: factors
   ArrayList<Integer> Result = new ArrayList<Integer>();

   // Generate 0 values for Result
   for (int j=0; j < Factors.size(); j++) {
    Result.add(0); // add 0
   }

   //System.out.println(Result.size()); //7 ///////////////////////////////////////////////



   // Divide by Fractors ------------------------------------------------------

   int Sum = Dec;

   for ( int k =0; k < Result.size(); k++) {

    if (Sum > Factors.get(k)) {
     Sum = Sum - Factors.get(k);
     // System.out.println("Sum= " +Sum); ///////////////////////////////////////////
     Result.set(k, 1);
    }
    else {
     // Do nothing
    }

    // System.out.println(Result.get(k)); // 10010110 ////////////////////////////////
   }// End Loop



   // Convert Arraylist to array  and to  String-----------------------------------


   int AL = Result.size();                       // ArrayList Lenght
   int[] res = new int[AL];
   // ArrayList / Array
   for (int l = 0; l < Result.size(); l++) {
    res[l] = Result.get(l);                    // Input items
   }


   //OUTPUT
   System.out.println(Dec +"(Decimal) = " +Arrays.toString(res).replace(", ", "").replace("[", "").replace("]", "") +"(Binary)");


  } // End Method

 } // End Class



 //=============================================================================
 /*
 1. input: decimal                  150

 2. Genrate factors                 1, 2, 4, 6, 8, 16, 32...

 3. If Fractors > 150               Break (265)

 4. Remove Last Fractor             1, 2, 4, 8, 16, 32, 64, 128

 5. Reverse Arrays                  128, 64, 32, 16, 8, 4, 2, 1

 5.5 ResArray                       0,   0,  0,  0,  0  0, 0, 0


 //LOOP 0

 6. if 150 > Array[0]               True

 7. 150 - Array[0]                 = 22

 8. Res.Array.change(0, 1)         1,   0,  0,  0,  0  0, 0, 0


 //LOOP 1

 6. if 22 > Array[1]               False

 9. Else, Do nothing


 //LOOP 2

 6. if 150 > Array[2]               False

 9. Else, Do nothing


 //LOOP 3

 6. if 150 > Array[3]               True

 7. 22 - Array[3]                 = 6

 8. Res.Array.change(0, 1)         1,   0,  0,  1,  0  0, 0, 0


 //LOOP 4

 6. if 6 > Array[4]               False

 9. Else, Do nothing


 //LOOP 5

 6. if 6 > Array[5]               True

 7. 6 - Array[5]                 = 2

 8. Res.Array.change(0, 1)         1,   0,  0,  1,  0,  1, 0, 0


 //LOOP 6

 6. if 6 > Array[6]               True

 7. 2 - Array[6]                 = 0

 8. Res.Array.change(0, 1)         1,   0,  0,  1,  0,  1, 1, 0


 // LOOP END

 10. Convert Array toString         10010110

 11. print                          150(decimal) = 10010110(Binary)

 */
