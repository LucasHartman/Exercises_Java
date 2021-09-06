import packs.highAndLow;
import packs.printerTest;
import packs.bitCounting;
import packs.DirReduction;

public class Main {
    public static void main(String[] args) {



        String[] dir = { "NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST" };
        DirReduction myObj3 = new DirReduction();
        String[] out = myObj3.dirReduc(dir);
        for (String s : out) {System.out.println("dirReduc: " +s ); }

        bitCounting myObj2 = new bitCounting();
        System.out.println("\nbitCounting: " +myObj2.countBits(0101011) );

        printerTest myObj1 = new printerTest();
        myObj1.printerError("aaaxbbbbyyhwawiwjjjwwm");

        highAndLow myObj = new highAndLow();
        System.out.println("\nhighAndLow: " +myObj.highAndLow("1 2 3 -4 5") );

    }
}
