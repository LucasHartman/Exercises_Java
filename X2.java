import java.util.Scanner;  // Import the Scanner class

public class X2 {
 public static void main(String[] args) {

  SumFunction();

  } // End Main

//-----------------------------------------------------------------------------

  static void SumFunction() {

        //New Class Object
       Scanner input = new Scanner (System.in);

       // Keyword - input 1
       System.out.print("Enter: ");
       double input1 = input.nextDouble();

       // Keyword - input2
       System.out.print("Enter: ");
       double input2 = input.nextDouble();

       // Operator
       double sum = input1 + input2;

       // Print
       System.out.println(input1 +" + " +input2 +" = " +sum);
   } // End Method


} // End Class
