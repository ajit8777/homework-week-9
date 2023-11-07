package homework_week9;
/**
 * Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Programme_7_CheckArrayListEmptyOrNot {
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
            System.out.println(city + ", ");

        }
        System.out.println("To test an array list is empty or not :" + cityName.isEmpty());
    }

    // Declare a main method and calling instance method by creating object.
    public static void main(String[] args) {
        Programme_7_CheckArrayListEmptyOrNot obj = new Programme_7_CheckArrayListEmptyOrNot();
        obj.cityName();
    }
}