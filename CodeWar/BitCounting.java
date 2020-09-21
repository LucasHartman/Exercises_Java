// convert input integer to binary and count the number of bits

public class BitCounting {

	public static int countBits(int n) {

			// int to binary (String)
			String sbinary = Integer.toBinaryString(n);

			// binary to char list
			char[] binaryChars = sbinary.toCharArray();
			//System.out.println(binaryChars[0]);

			// 1 counter
			int count = 0;

				// loop char list
				for ( int i=0; i < binaryChars.length; i++ ) {

					// get binary Character
					int value = Character.getNumericValue(binaryChars[i]);

					// if 1 add count
					if ( value == 1 ) {
						count=count+1;
					}
				}

			return count;
	}



	public static void main(String[] args) {

		int numBits = countBits(1234);
		System.out.println(numBits);

	}

}
