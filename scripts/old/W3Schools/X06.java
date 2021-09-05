import java.util.Scanner;  // Import the Scanner class

public class X06 {
 public static void main(String[] args) {

  OPsFunction();

  } // End Main

//-----------------------------------------------------------------------------

  static void OPsFunction() {

        //New Class Object
       Scanner input = new Scanner (System.in);

       // Keyword - input 1
       System.out.print("Enter: ");
       double input1 = input.nextDouble();

       // Keyword - input2
       System.out.print("Enter: ");
       double input2 = input.nextDouble();

       // Operator
       double add = input1 + input2;
       double sub = input1 - input2;
       double mul = input1 * input2;
       double div = input1 / input2;
       double mod = input1 % input2;

       // Print
       System.out.println(input1 +" + " +input2 +" = " +add);
       System.out.println(input1 +" - " +input2 +" = " +sub);
       System.out.println(input1 +" * " +input2 +" = " +mul);
       System.out.println(input1 +" / " +input2 +" = " +div);
       System.out.println(input1 +" % " +input2 +" = " +mod);

   } // End Method


} // End Class
