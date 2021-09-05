public class PangramChecker {

  public static boolean check(String sentence){

    // String to lowerCase
    sentence = sentence.toLowerCase();

    // String input to char list
    char[] sentenceChar = sentence.toCharArray();
    // list ot compare input with
    char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n', 'o','p','q','r','s','t','u','v','w','x','y','z'};
    // check list
    boolean[] check = { false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false,false };

    // loop through all input characters
    for ( int i=0; i < sentenceChar.length; i++) {
      // check all input characters with alphabet characters
      for ( int j=0; j < 26; j++) {
        // if character compare, set true on checklist
        if ( sentenceChar[i] == alphabet[j] ) { check[j] = true; }
      }// end inner loop
    } // end outer loop

    // Check if all booleans are true of note
    for(boolean b : check) if(!b) return false; return true;
  }


      public static void main(String[] args) {

        boolean test1 = check("The quick brown fox jumps over the lazy dog.");
        System.out.println(test1);

        boolean test2 = check("You shall not pass!");
        System.out.println(test2);

      }
}
