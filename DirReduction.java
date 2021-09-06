package packs;

import java.util.ArrayList;

public class DirReduction {

    public String[] dirReduc(String[] s) {
        /* The argument is a list of directions: 
        ["NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"].
        NORTH and SOUTH annihilate each other, therefore reduce the list
        to the shortest root. In this case the output would be:
        ["WEST"], because the other directions cancle each other out*/

        ArrayList<String> northList = listDir("NORTH",s);
        ArrayList<String> southList = listDir("SOUTH",s);
        ArrayList<String> westList = listDir("WEST",s);
        ArrayList<String> eastList = listDir("EAST",s);

        System.out.println( 
            "number of north: " +northList.size() +
            "\nnumber of south: " +southList.size() +
            "\nnumber of west: " +westList.size() +
            "\nnumber of east: " +eastList.size() );

        if ( northList.size() >= southList.size() ) { 
            for (String d : northList) { 
                southList.remove(0);
                northList.remove(0); 
            } 


        System.out.println( 
            "number of north: " +northList.size() +
            "\nnumber of south: " +southList.size() +
            "\nnumber of west: " +westList.size() +
            "\nnumber of east: " +eastList.size() );


        return s;
    }

    public static ArrayList<String> listDir(String dir, String[] dirList ) {
        ArrayList<String> lst = new ArrayList<>();
        for (String d : dirList) { if (d == dir) { lst.add(d); } }
        return lst;
    }
    


    
}
