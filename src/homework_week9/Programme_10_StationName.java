package homework_week9;
/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

import java.util.HashMap;
import java.util.Map;

public class Programme_10_StationName {
    public static void main(String[] args) {
        // Create a HashMap to map stations to their corresponding Tube lines.
        Map<String, String> stationToLine = new HashMap<>();

        // Populate the HashMap with Zone 1 stations and their associated lines.
        stationToLine.put("Baker Street", "Bakerloo, Circle, Hammersmith & City, Jubilee, Metropolitan");
        stationToLine.put("Waterloo", "Bakerloo, Jubilee, Northern, Waterloo & City");
        stationToLine.put("Kings Cross St Pancras", "Circle, Hammersmith & City, Metropolitan, Northern, Piccadilly, Victoria");
        stationToLine.put("Oxford Circus", "Bakerloo, Central, Victoria");
        stationToLine.put("Victoria", "Circle, District, Victoria");

        // Specify the Zone 1 station you want to inquire about.
        String targetStation = "Baker Street";

        // Check if the station is in the HashMap and get the associated lines.
        if (stationToLine.containsKey(targetStation)) {
            String lines = stationToLine.get(targetStation);
            System.out.println("The following Tube lines pass through " + targetStation + " Station : " + lines);
        } else {
            System.out.println("Sorry, " + targetStation + " is not a Zone 1 station in this example.");
        }
    }
}
