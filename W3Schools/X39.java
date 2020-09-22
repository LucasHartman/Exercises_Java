import java.util.ArrayList; // import the ArrayList class

public class X39 {
 public static void main(String[] args) {


    threedigits();


 } // End Main































    // Method -----------------------------------------------------------------


   static void threedigits() {

    ArrayList<Integer> Range = new ArrayList<Integer>();

    // Generate Number Range
    for (int i = 123; i <= 432; i++) {
     Range.add(i);
    } // End loop

    // print Range
    for ( int j = 0; j < Range.size(); j++) {/////////////////////////////////////////
     // System.out.println(Range.get(j));
    }

    // Sort List --------------------------------------------------------------

    ArrayList<Integer> total = new ArrayList<Integer>();


 for (int k = 0; k < Range.size(); k++) {
    int a = Range.get(k);             // get array item
    String str = Integer.toString(a); // int to string

    // get digits
    int pv0 = Integer.parseInt(String.valueOf(str.charAt(0)));
    int pv1 = Integer.parseInt(String.valueOf(str.charAt(1)));
    int pv2 = Integer.parseInt(String.valueOf(str.charAt(2)));


    // Check digits
     if (pv0 >= 1 && pv0 <= 4 && pv1 >= 1 && pv1 <= 4 && pv2 >= 1 && pv2 <= 4 && pv0 != pv1 && pv0 != pv2 && pv1 != pv2) {
       total.add(Range.get(k));
     }

  } // End Loop


   // print total list
   for (int l = 0; l < total.size(); l++) {
    System.out.println(total.get(l));
   }

   // print total of numbers
   System.out.println("The number of unique three-digit number using 1, 2, 3, 4 is: " +total.size());











} // End Method

} // End Class



     // Sketch ----------------------------------------------------------------

     /*

     1, 2, 3, 4

     genarate unique 3-digit number

     each value has 3 of the 4 digits

     echa place value can =

     1 2 3 4        1 2 3 4        1 2 3 4


     1              2 3 4          2 3 4

     1              2              3 4

     1              2              3

     =============================================

     // 1. Genarate Range of numbers to array

           int[] array  = {
           123
           124
           132
           134
           ...
           432
           }

     // 2. loop through array

     for (int i = 0; i < array.size(); i++) {
        int pv1  = array[i].getchar[0]
        int pv2  = array[i].getchar[1]
        int pv3  = array[i].getchar[2]


     // 3. Chech if each digit is 1 2, 3, or 4

        if (pv1 >= 1 && pv1 <= 4 && pv2 >= 1 && pv2 <= 4 pv3 >= 1 && pv3 <= 4) {
          total.add(array[i]);
        }

       } // End Loop

     */
