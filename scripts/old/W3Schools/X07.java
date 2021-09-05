import java.util.Scanner;  // Import the Scanner class

public class X07 {
 public static void main(String[] args) {

  TableFunction();

  } // End Main

//-----------------------------------------------------------------------------

  static void TableFunction() {

        //New Class Object
       Scanner input = new Scanner (System.in);

       // Keyword - input 1
       System.out.print("Enter: ");
       int input1 = input.nextInt();

       int mul = 0;

       for(int i=1; i<=10; i++) {
         mul = input1 * i;
         System.out.println(input1 +" x " +i +" = " +mul);
       } // End Loop

   } // End Method


} // End Class
