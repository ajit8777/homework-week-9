package homework_week9;
/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater
 */

import java.util.ArrayList;

public class Programme_5_IterateAllElement {
    //Declare instance method
    public void cityName() {
        //ArrayList
        ArrayList<String> cityName = new ArrayList();
        cityName.add("London");
        cityName.add("Durby");
        cityName.add("Bristol");
        cityName.add("Manchester");
        cityName.add("Birmingham");
        cityName.add("Watford");
        cityName.add("Edinburgh");

        for (String city : cityName) {
            System.out.print(city + ", ");
        }
    }

    // Declare a main method and calling instance method by creating object.
    public static void main(String[] args) {
        Programme_5_IterateAllElement obj = new Programme_5_IterateAllElement();
        obj.cityName();
    }
}