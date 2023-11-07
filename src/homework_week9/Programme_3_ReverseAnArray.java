package homework_week9;
/**
 * Write a Java program to reverse an array of integer values
 */

import java.util.Arrays;

public class Programme_3_ReverseAnArray {
    //Declare a main method
    public static void main(String[] args) {
        // create a object and called reverseArray method inside main marhtod.
        Programme_3_ReverseAnArray obj = new Programme_3_ReverseAnArray();
        obj.reverseAnArray();
    }

    // Declare Instance method
    public void reverseAnArray() {
        int[] array = {100, 200, 300, 400, 500, 600, 700};
        System.out.println("Original array : " + Arrays.toString(array));
        // for loop statement
        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = a;
        }
        System.out.println("Reverse array : " + Arrays.toString(array));


    }
}