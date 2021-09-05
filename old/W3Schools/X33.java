public class X33 {
 public static void main(String[] args) {


    SumOfDigits("343");


 } // End Main































 // Method ---------------------------------------------------------------------


   static void SumOfDigits(String Dec) {


    String str = Dec;                              // 343

    // Creating array of string length
    char[] ch = new char[str.length()];            // 3


    int sum =0;
    int a;
    // Copy character by character into array
    for (int i = 0; i < str.length(); i++) {
        ch[i] = str.charAt(i);                    // {'3','4','3'}
        a = Integer.parseInt(String.valueOf(ch[i]));  // int a = 3
        //System.out.println("a " +a); ////////////////////////////////////////////

        sum += a;

    }

    System.out.println(sum);

  } // End Method

} // End Class



//char x = 9;
//int y = (int)(x);
