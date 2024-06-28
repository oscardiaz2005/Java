public class Main {
    public static void main(String[] args) {

        HomeAppliances[] homeAppliances = new HomeAppliances[10];
        int sumOfHomeAppliances = 0;

        homeAppliances[0] = new Television(500, 20);
        homeAppliances[1] = new WashingMachine(400, 30);
        homeAppliances[2] = new Television(600, "silver", 'B', 35, 60, false);
        homeAppliances[3] = new WashingMachine(450, 25);
        homeAppliances[4] = new Television(700, "white", 'A', 40, 70, true);
        homeAppliances[5] = new WashingMachine(550, 32);
        homeAppliances[6] = new Television(800, "red", 'C', 45, 80, false);
        homeAppliances[7] = new WashingMachine(600,  28);
        homeAppliances[8] = new Television(900, "white", 'D', 50, 90, true);
        homeAppliances[9] = new WashingMachine(700, 38);

        System.out.println("Prices of Washing Machines:");
        int sumOfWashingMachines = 0;
        for (HomeAppliances appliance : homeAppliances) {
            if (appliance instanceof WashingMachine) {
                System.out.println("Washing Machine final price: " + appliance.finalPrice());
                sumOfWashingMachines += appliance.finalPrice();
            }
        }

        System.out.println("\nPrices of Televisions:");
        int sumOfTelevisions = 0;
        for (HomeAppliances appliance : homeAppliances) {
            if (appliance instanceof Television) {
                System.out.println("Television final price: " + appliance.finalPrice());
                sumOfTelevisions += appliance.finalPrice();
            }
        }

        sumOfHomeAppliances = sumOfWashingMachines + sumOfTelevisions;
        System.out.println("\nSum of Home Appliances: " + sumOfHomeAppliances);
    }
}
