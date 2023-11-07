package homework_week9;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Programme_6_RetrieveAnElement {
    // decalare a instance method
    public void retrieveAnElement(){
        ArrayList<Integer> number = new ArrayList();
        number.add(100);
        number.add(200);
        number.add(300);
        number.add(400);
        number.add(500);
        number.add(600);
        number.add(700);
        number.add(800);

        System.out.println(number.get(4));

    }
    // Declare a main method and calling instance method by creating object.
    public static void main(String[] args) {
        Programme_6_RetrieveAnElement obj = new Programme_6_RetrieveAnElement();
        obj.retrieveAnElement();
    }
}
