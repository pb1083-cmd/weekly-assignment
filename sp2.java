public class TravelCalculator {

    public static void main(String[] args) {

        // Distance values (in km)
        double distance1 = 156.6;   // Chennai to Vellore
        double distance2 = 211.8;   // Vellore to Bangalore

        // Time values
        int hours1 = 4;
        int minutes1 = 4;

        int hours2 = 4;
        int minutes2 = 25;

        // Total Distance
        double totalDistance = distance1 + distance2;

        // Convert everything to minutes
        int totalMinutes = (hours1 * 60 + minutes1) +
                           (hours2 * 60 + minutes2);

        // Convert back to hours and minutes
        int finalHours = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        // Display Results
        System.out.println("Total Distance: " + totalDistance + " km");
        System.out.println("Total Travel Time: " + finalHours + 
                           " Hours " + finalMinutes + " Minutes");
    }
}