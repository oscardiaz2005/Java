package view;

import controller.Controller;

import java.util.Scanner;

public class View {
    public int option;
    Scanner scanner = new Scanner(System.in);

    public int Menu() {
        System.out.println("Welcome to the Dessert management");
        System.out.println("1.Show All Desserts\n2.Add dessert\n3.Delete dessert\n4.Show Category\n5.Show dessert with the biggest price\n6.Exit");
        try {
            option = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input, please enter a number.");
            scanner.next();
        }
        scanner.nextLine();
        return option;
    }

    public String captureName() {
        System.out.println("Enter the name:");
        return scanner.nextLine();
    }

    public String captureCategory() {
        System.out.println("Enter the category:");
        return scanner.nextLine();
    }

    public int capturePrice() {
        System.out.println("Enter the price:");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input, please enter a number.");
            scanner.next();
        }
        int price = scanner.nextInt();
        scanner.nextLine();
        return price;
    }

    public int captureStock() {
        System.out.println("Enter the stock:");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input, please enter a number.");
            scanner.next();
        }
        int stock = scanner.nextInt();
        scanner.nextLine();
        return stock;
    }

    public String findDelete() {
        System.out.println("Enter the name of the product that you want to delete:");
        return scanner.nextLine();
    }

    public String findCategory() {
        System.out.println("Enter the name of the category that you want to see:");
        return scanner.nextLine();
    }

    public void Connect() {
        Controller controller = new Controller();
        controller.control();
    }
}

