public class Bus {
    private String plate;
    private int capacity;
    private double ticketPrice;
    private int currentPassengers;
    private int totalPassengers;
    private double totalRevenue;

    public Bus(String plate, int capacity, double ticketPrice) {
        this.plate = plate;
        this.capacity = capacity;
        this.ticketPrice = ticketPrice;
        this.currentPassengers = 0;
        this.totalPassengers = 0;
        this.totalRevenue = 0;
    }

    public String getPlate() {
        return plate;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public int getCurrentPassengers() {
        return currentPassengers;
    }

    public int getTotalPassengers() {
        return totalPassengers;
    }

    public void boardPassengers(int quantity) {
        int availableSeats = capacity - currentPassengers;
        if (quantity <= availableSeats) {
            currentPassengers += quantity;
            totalPassengers += quantity;
            totalRevenue += quantity * ticketPrice;
            System.out.println(quantity + " passengers boarded the bus.");
        } else {
            System.out.println("There is not enough space on the bus to board " + quantity + " passengers.");
        }
    }

    public void disembarkPassengers(int quantity) {
        if (quantity <= currentPassengers) {
            currentPassengers -= quantity;
            System.out.println(quantity + " passengers disembarked from the bus.");
        } else {
            System.out.println("There are not enough passengers on the bus to disembark " + quantity + " passengers.");
        }
    }

    public double getTotalRevenue() {
        return totalRevenue;
    }
}


