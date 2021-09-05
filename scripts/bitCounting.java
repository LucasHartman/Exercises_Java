package packs;

public class bitCounting {

	public static int countBits(int n) {
        /* input a binary number and count the number of ones */

        String sbinary = Integer.toBinaryString(n);
        char[] binaryChars = sbinary.toCharArray();

        int count = 0;
            for ( int i=0; i < binaryChars.length; i++ ) {
                int value = Character.getNumericValue(binaryChars[i]);

                if ( value == 1 ) { count=count+1; }
            }
        return count;
}    
    
}
