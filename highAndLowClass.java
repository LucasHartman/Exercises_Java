package mypacks;

import java.util.*;
import java.util.Collections;
import java.util.ArrayList;

public class highAndLowClass {
    public highAndLowClass() {
        System.out.println("highAndLowClass");
    }

    public String highAndLow(String numbers) {
        /* given a string of space separated numbers, 
        and return the highest and lowest number, as an string. */

        // Method: String to list, withoud blank spaces
        String[] numbersList = SplitString(numbers);

        // Method: String list 2 Integer list
        Integer[] intList = Strlist2Intlist( numbersList );

        // Methods: get min/max values
        int max = maxIntList( intList );
        int min = minIntList( intList );

        return Integer.toString(min) +" " +Integer.toString(max);
    }






    public String[] SplitString(String str) {
        /* Split String to a String list and remove the blank spaces */
        String[] chars = str.split("\\s+");
        // for ( String c : chars ) { System.out.println("highAndLow method: " + c); }
        return chars;
    }

    public Integer[] Strlist2Intlist( String[] strList) {
        /* String List to Integer List */
        ArrayList<Integer> intList = new ArrayList<Integer>();
        for(String s : strList) intList.add(Integer.valueOf(s));
        Integer[] targetArray = intList.toArray(new Integer[0]);
        return targetArray;
    }

    public Integer maxIntList(Integer[] intList) {
        /* Get the height value from an interger list */
        List<Integer> list = Arrays.asList(intList);
        int max = Collections.max(list);
        return max;
    }

    public Integer minIntList(Integer[] intList) {
        /* Get the height value from an interger list */
        List<Integer> list = Arrays.asList(intList);
        int min = Collections.min(list);
        return min;
    }
    
}
