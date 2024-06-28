import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the object
        Bus bus = new Bus("ABC123", 50, 2500);

        boolean continueTraveling = true;
        int stationNumber = 0;

        while (continueTraveling) {
            stationNumber++;

            // Display information
            System.out.println("Current Station = " + stationNumber);
            System.out.println("Current number of passengers: " + bus.getCurrentPassengers());
            System.out.println("Total revenue: " + bus.getTotalRevenue());

            System.out.print("How many passengers are boarding at this station? ");
            int boarding = scanner.nextInt();

            // Validate that passengers cannot disembark
            if (bus.getCurrentPassengers() > 0) {
                System.out.print("How many passengers are disembarking at this station? ");
                int disembarking = scanner.nextInt();
                // Disembark passengers
                bus.disembarkPassengers(disembarking);
            } else {
                System.out.println("There are no passengers on the bus to disembark.");
            }

            // Board passengers
            bus.boardPassengers(boarding);

            // Ask if the cycle should continue
            System.out.print("Will you continue traveling? (y/n) ");
            String response = scanner.next();
            if (response.equals("n")) {
                continueTraveling = false;
            }
        }
        System.out.println("Thank you for driving");
        System.out.println("Total revenue for today: " + bus.getTotalRevenue());
    }
}
