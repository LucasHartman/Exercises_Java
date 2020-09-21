import java.lang.*;

// MISSION: Remove all the WUB's from the String

// Brianstorm - Roadmap
  // remove WUB from WUBWUBABCWUB or RWUBWUBWUBLWUB
  // String to char list
  // loop list i++
  // get index i, i+1, i+2    (in the 1ste loop would be WUB or RWU)
  // join indexes             ("WUB" or "RWU")
  // if (indexes == WUB) Remove indexes from char list and set i to 0
  // else { // do nothing and continue loop }
  // finish loop
  // convert character list to String
  // output string



public class Dubstep {

  public static String SongDecoder (String song) {

     // String to Char list
     char[] songChars = song.toCharArray();

     // loop list
     for ( int i=0; i < songChars.length-2; i++ ) {
/*
       // Testing
       System.out.println("\n-------------------Loop INPUT: " +i);
       System.out.println("index +0 is: " +songChars[i]);
       System.out.println("index +1 is: " +songChars[i+1]);
       System.out.println("index +2 is: " +songChars[i+2]);
*/

      // Convert Char to numeric value
       int W = Character.getNumericValue(songChars[i]);
       int U = Character.getNumericValue(songChars[i+1]);
       int B = Character.getNumericValue(songChars[i+2]);


      // if indexes are W U B,
      if ( W == 32 && U == 30 && B == 11 ) {

         // System.out.println("We found a WUB");

         // replace INDEXES with null value
         songChars[i] = '\0';
         songChars[i+1] = '\0';
         songChars[i+2] = '\0';

      } // end statement
/*
      // Testing
      System.out.println("\n-------------------Loop OUTPUT: " +i);
      System.out.println("index +0 is: " +songChars[i]);
      System.out.println("index +1 is: " +songChars[i+1]);
      System.out.println("index +2 is: " +songChars[i+2]);
*/
      } // end loop


      // Apply Spaces inbetween words
      for ( int i=1; i < songChars.length; i++ ) {
/*
        char y = '\0';
        int x = Character.getNumericValue(y);
        System.out.println(x);
*/
        // Convert index to numeric value
        int x = Character.getNumericValue(songChars[i]);
        int y = Character.getNumericValue(songChars[i-1]);

        // apply space inbetween words
        if (  x != -1 && y == -1 ) {
          songChars[i-1] = ' ';
        }

      } // end loop

            // Char list to string & remove null's
            String songOut = new String(songChars);

            // Trim front backspace
            String removeChar = songOut.trim();


       return removeChar;
  }


 public static void main(String[] args) {

   String Deco1 = SongDecoder("WUBWUBABCWUB");
   System.out.println(Deco1);

   String Deco2 = SongDecoder("RWUBWUBWUBLWUB");
   System.out.println(Deco2);

   String Deco3 = SongDecoder("WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB");
   System.out.println(Deco3);
 }

}
