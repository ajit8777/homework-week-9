package homework_week9;
/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */

import java.util.HashMap;

public class Programme_9_HasMapValue {
    // Instance method
    public void hasMapValue() {
        //HashMap
        HashMap<String, Integer> colours = new HashMap();
        colours.put("Black", 1);
        colours.put("White", 2);
        colours.put("Pink", 3);
        colours.put("Yellow", 4);
        colours.put("Red", 5);
        colours.put("Green", 6);

        // for each loop
        for (Integer a : colours.values()) {
            System.out.println(a);
        }
    }

    // Declare a main method and calling instance method by creating object.
    public static void main(String[] args) {
        Programme_9_HasMapValue obj = new Programme_9_HasMapValue();
        obj.hasMapValue();
    }
}

