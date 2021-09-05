import java.lang.Math.*;
import java.util.Scanner;

public class X13 {
 public static void main(String[] args) {


  OPsRectangle();


 } // End main










//-----------------------------------------------------------------------------

  static void OPsRectangle() {

     //New Class Object
    Scanner input = new Scanner (System.in);

    //keyword - input 1
    System.out.print("Enter Width: ");
    double width = input.nextDouble();

    //keyword - input 2
    System.out.print("Enter Length: ");
    double length = input.nextDouble();


     // Operators
     double area = width * length;
     double perimeter = 2 * (area);


     // Prints
     System.out.println("the square area = " +area);
     System.out.println("the square perimeter = " +perimeter);

 } // Method

} // End Class
