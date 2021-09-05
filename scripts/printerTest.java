package packs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashSet;
import java.util.Set;


public class printerTest {
    public printerTest() {
        // System.out.println("PrinterTest");
    }

    public void printerError(String str) {
        /* get a String of letters of the alphabet and 
        report the number of letter that are not between a & m.
        so "abcdz" returns "1/5" */

        // String to Char list
        char[] clist  = str.toCharArray();
        //for (char c : clist) { System.out.println(c); }

        // char list to set
        Set<Character> set = new HashSet<Character>();
        for (char c : clist) { set.add(c); }
        //System.out.println("Set: " + set);

        // Compare set with abc list
        char[] abc = {'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        int count=0;
        for (char c : abc) { if ( set.contains(c) ) { count++; } } 
        
        // print number of found letter
        int size = str.length();
        System.out.println("\nprinterError: " +count +"/" +size );
    }



}


