import packs.highAndLow;
import packs.printerTest;
import packs.bitCounting;

public class Main {
    public static void main(String[] args) {

        bitCounting myObj2 = new bitCounting();
        System.out.println("\nbitCounting: " +myObj2.countBits(0101011) );

        // UNDER CONSTRUCTION \\
        printerTest myObj1 = new printerTest();
        System.out.println( "\nprinterError: " +myObj1.printerError("aaaxbbbbyyhwawiwjjjwwm") );

        highAndLow myObj = new highAndLow();
        System.out.println("\nhighAndLow: " +myObj.highAndLow("1 2 3 -4 5") );

    }
}
