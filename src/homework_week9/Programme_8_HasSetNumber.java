package homework_week9;
/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;

public class Programme_8_HasSetNumber {
    //Declare a instance method
    public void hasSetNumber() {
        //HasSet
        HashSet<Integer> number = new HashSet();
        number.add(4);
        number.add(7);
        number.add(8);

        for (int a = 1; a <= 10; a++) { // for loop
            if (number.contains(a)) { // if else statement
                System.out.println(a + " number found in set");
            } else {
                System.out.println(a + " number not found in set");
            }
        }
    }

    // Declare a main method and calling instance method by creating object.
    public static void main(String[] args) {
        Programme_8_HasSetNumber obj = new Programme_8_HasSetNumber();
        obj.hasSetNumber();
    }
}
