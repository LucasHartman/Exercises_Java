import java.util.ArrayList; // import the ArrayList class
import java.util.*;
import java.lang.Math;


public class X22 {
 public static void main(String[] args) {


    Bin2Dec("1010");
    // input Binaray value, output decimal value


 } // End Main












// Method ---------------------------------------------------------------------


  static void Bin2Dec(String Bin) {

// Input String Lenght
int lenght = Bin.length();
double sum = 0;


for (int i = 0; i < lenght; i++) {

    // Get Character from input
    char ch1 = Bin.charAt(i);
    // System.out.println("Character: " +ch1); // 1 0 1 0
    // Character to Interger
    int ch2 = Integer.parseInt(String.valueOf(ch1));
    // System.out.println("Character: " +ch2); // 1 0 1 0


    if (ch2 == 1) {

          // Get index from Input
          int index = lenght -1 -i;
          //System.out.println("index: " +index);   // 3 2 1 0

          double pow = Math.pow(2, index); // 2*2*2 & 2
          // System.out.println(pow);

          // add up values
          sum += pow;

      } // end if

  } // end loop

      // Result
      System.out.println(sum);

   } // End Method

} // End Class
