public class X15 {
 public static void main(String[] args) {


  Swap2Vars(3,5);


 } // End main










//-----------------------------------------------------------------------------

  static void Swap2Vars(double varA, double varB) {

   // Print
   System.out.println("A = " +varA);
   System.out.println("B = " +varB);

   // Swamp
   double temp = varA;
   varA = varB;
   varB = temp;

   // Print Again
   System.out.println();
   System.out.println("SWAP");
   System.out.println("A = " +varA);
   System.out.println("B = " +varB);

 } // Method

} // End Class
