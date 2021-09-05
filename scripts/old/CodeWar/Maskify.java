/*
Usually when you buy something, you're asked whether your credit card number,
phone number or answer to your most secret question is still correct. However,
since someone could look over your shoulder, you don't want that shown on your
screen. Instead, we mask it.

Your task is to write a function maskify, which changes all but the last four
characters into '#'.

roadmap
string to char list

if ( list < 3) { do nothing }

else...
  if char list last index = . / ! / ?
  loop char list  -4
  replace char = #

  else
  loop char list  -4
  replace char = #

Char list to string



--------------------------------------------------------------------------------
ASCII
number = 48 / 57
upper = 65 / 90
lower = 97 / 122
. = 46
? = 63
! = 33
*/

public class Maskify {

  public static String maskify(String str) {

    // String to Char
    char[] list = str.toCharArray();

    // get list lenght
    int check = list.length-1;

    // check list minimal size
    if ( list.length > 3 ) {
        for ( int i=0; i < list.length-4; i++ ) { list[i] = '#'; }
      }

    // Char list to string
    str = new String(list);

  return str;
  }



      static public void main(String[] args) {

        String masked1 = maskify("4556364607935616");
        System.out.println(masked1); // ############5616

        String masked2 = maskify("64607935616");
        System.out.println(masked2); // #######5616

        String masked3 = maskify("1");
        System.out.println(masked3); // 1

        String masked4 = maskify("");
        System.out.println(masked4); //

        String masked5 = maskify("Skippy");
        System.out.println(masked5); // ##ippy

        String masked6 = maskify("Nananananananananananananananana Batman!");
        System.out.println(masked6); // ####################################man!
      }
}
