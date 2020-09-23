/*
Trolls are attacking your comment section!
A common way to deal with this situation is to remove all of the vowels from the
 trolls' comments, neutralizing the threat.
Your task is to write a function that takes a string and return a new string
 with all vowels removed.
For example, the string

"This website is for losers LOL!" would become
"Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
*/

public class Troll {

    public static String disemvowel(String str) {

      // String to Char list
      char[] charStr = str.toCharArray();

      // loop char list
      for ( int i=0; i < charStr.length; i++) {
        // check for vowels and replace
        switch (charStr[i]) {
              case 'a': charStr[i] = '\0'; break;
              case 'e': charStr[i] = '\0'; break;
              case 'i': charStr[i] = '\0'; break;
              case 'o': charStr[i] = '\0'; break;
              case 'u': charStr[i] = '\0'; break;
              case 'A': charStr[i] = '\0'; break;
              case 'E': charStr[i] = '\0'; break;
              case 'I': charStr[i] = '\0'; break;
              case 'O': charStr[i] = '\0'; break;
              case 'U': charStr[i] = '\0'; break;
          }
        }

        // char list to String & remove /0
        str = new String(charStr).replaceAll("\0", "");

    return str;
    }


  public static void main(String[] args) {

        String vowel1 = disemvowel("This website is for losers LOL!");
        System.out.println(vowel1);

        String vowel2 = disemvowel("No offense but,\nYour writing is among the worst I've ever read");
        System.out.println(vowel2);

        String vowel3 = disemvowel("What are you, a communist?");
        System.out.println(vowel3);
  }

}
