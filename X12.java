import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class

public class X12 {
 public static void main(String[] args) {


  average5();


 } // End main










//-----------------------------------------------------------------------------

  static void average5() {

     //New Class Object
     ArrayList<Integer> numbers = new ArrayList<Integer>(); // Create an ArrayList object

     //New Class Object
     Scanner input = new Scanner (System.in);



    // keyword - input 1
    System.out.print("Enter value: ");
    Integer input1 = input.nextInt();
    // Add Item
    numbers.add(input1);

    // keyword - input 2
    System.out.print("Enter value: ");
    Integer input2 = input.nextInt();
    // Add Item
    numbers.add(input2);

    // keyword - input 3
    System.out.print("Enter value: ");
    Integer input3 = input.nextInt();
    // Add Item
    numbers.add(input3);


    // Data
    int addup = 0;
    int length = numbers.size();

    // Loop Through
    for (int i = 0; i < numbers.size(); i++) {
      //System.out.println(numbers.get(i));
      addup = addup + numbers.get(i);
    }

   //OP
  	int average = addup / length;
   System.out.println("The average = " +average);

 } // Method


} // End Class
