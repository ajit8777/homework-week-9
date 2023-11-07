package homework_week9;
/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

import java.util.ArrayList;

public class Programme_4_NewArrayListOfColours {
    public static void main(String [] args) {
        Programme_4_NewArrayListOfColours obj = new Programme_4_NewArrayListOfColours();
        obj.listOfColours();
    }
    // Declare instance method
    public void listOfColours(){
        // ArrayList
        ArrayList<String> colour = new ArrayList();
        colour.add("Purple");
        colour.add("Blue");
        colour.add("Violet");
        colour.add("Green");
        colour.add("Yellow");
        colour.add("Orange");
        System.out.print(colour);
    }
}
