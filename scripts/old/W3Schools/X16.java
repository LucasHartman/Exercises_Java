import java.util.ArrayList; // import the ArrayList class



public class X16 {
 public static void main(String[] args) {


  Head();


 } // End main










//-----------------------------------------------------------------------------

  static void Head() {

   //New Class Object
   ArrayList<String> head = new ArrayList<String>();

   // Add Item
   head.add(" +\"\"\"\"\"+   ");
   // Add Item
   head.add("[| o o |]  ");
   // Add Item
   head.add(" |  ^  | ");
   // Add Item
   head.add(" | '-' | ");
   // Add Item
   head.add(" +-----+");

   for (int i = 0; i < head.size(); i++) {
    System.out.println(head.get(i));
   }

 } // Method

} // End Class
