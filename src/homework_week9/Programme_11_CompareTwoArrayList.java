package homework_week9;
/**
 * Declare two ArrayList and compare it.
 */

import java.util.ArrayList;

public class Programme_11_CompareTwoArrayList {

    //Instance method.
    public void compareTwoArrayList(){
        //ArrayList
        ArrayList<String> c1 = new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        //ArrayList
        ArrayList<String> c2 = new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        System.out.println(c1.equals(c2));
    }
    // Declare a main method and calling instance method by creating object.
    public static void main(String[] args) {
        Programme_11_CompareTwoArrayList obj = new Programme_11_CompareTwoArrayList();
        obj.compareTwoArrayList();
    }
}
