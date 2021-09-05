import java.lang.Math.*;
import java.util.Scanner;

public class X11 {
 public static void main(String[] args) {


  OPsCircle();


 } // End main










//-----------------------------------------------------------------------------

  static void OPsCircle() {

     //New Class Object
    Scanner input = new Scanner (System.in);

    //keyword - input 1
    System.out.print("Enter radius: ");
    double radius = input.nextDouble();

     // Operators
     double perimeter = radius * 2 * Math.PI;
     double area = Math.PI * radius * radius;

     // Prints
     System.out.println("the area of " +radius +" = " +area);
     System.out.println("the perimeter of " +radius +" = " +perimeter);

 } // Method

} // End Class
