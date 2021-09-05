/*
In DNA strings, symbols "A" and "T" are complements of each other,
as "C" and "G". You have a function with one side of the DNA
(string, except for Haskell); you need to get the other complementary side.
DNA strand is never empty or there is no DNA at all (again, except for Haskell).

A = T
T = A
C = G
G = C
*/


public class DnaStrand {

  public static String makeComplement(String dna) {

    // String to Char list
    char[] charDna = dna.toCharArray();

    // loop char list
    for ( int i=0; i < charDna.length; i++) {

      // change char
      switch (charDna[i]) {
        case 'A':
          charDna[i] = 'T';
          break;
        case 'T':
          charDna[i] = 'A';
          break;
        case 'G':
          charDna[i] = 'C';
          break;
        case 'C':
          charDna[i] = 'G';
          break;
      }

      // char list to String
      dna = new String(charDna);

    }

    return dna;
    //Your code
  }



  public static void main(String[] args ) {

    String DNA1 = makeComplement("AAAA");
    System.out.println(DNA1);

    String DNA2 = makeComplement("TAACG");
    System.out.println(DNA2);

    String DNA3 = makeComplement("GTAT");
    System.out.println(DNA3);
  }


}
