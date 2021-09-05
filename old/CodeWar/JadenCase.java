/*
Jaden Smith, the son of Will Smith, is the star of films such as
The Karate Kid (2010) and After Earth (2013). Jaden is also known for some of
his philosophy that he delivers via Twitter. When writing on Twitter, he is
known for almost always capitalizing every word. For simplicity, you'll have to
capitalize each word, check out how contractions are expected to be in the
example below.

Your task is to convert strings to how they would be written by Jaden Smith.
The strings are actual quotes from Jaden Smith, but they are not capitalized
in the same way he originally typed them.

Example:
Not Jaden-Cased: "How can mirrors be real if our eyes aren't real"
Jaden-Cased:     "How Can Mirrors Be Real If Our Eyes Aren't Real"
*/

public class JadenCase {

	public static String toJadenCase(String phrase) {

		// check if not null or empty
	  if (phrase != null && !phrase.isEmpty()) {

			// String to char list
			char[] charPhrase = phrase.toCharArray();

			// first char to uppercase
			charPhrase[0] = Character.toUpperCase(charPhrase[0]);

			// loop char list and change to uppercase
			for (int i=1; i < charPhrase.length; i++ ) {

						// Char to uppercase if prev index is a space
						if ( (int) charPhrase[i-1] == 32 ) {
							charPhrase[i] = Character.toUpperCase(charPhrase[i]);
						}
			}
			// char list to string
			phrase = new String(charPhrase);
		} else { phrase = null; }


		return phrase;
	}



			public static void main(String[] args ) {

			 String tweet1 = toJadenCase("most trees are blue");
			 System.out.println(tweet1);

			 String tweet2 = toJadenCase(null);
			 System.out.println(tweet2);

			 String tweet3 = toJadenCase("");
			 System.out.println(tweet3);
			}
}
