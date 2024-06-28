package View;

import Controller.ControllerProduct;

import java.util.Scanner;

public class ViewProduct {
    public int option;
    Scanner keyboard = new Scanner(System.in);

    public int menu() {
        System.out.println("\nWelcome to the management of products");
        System.out.println("Choose an option :\n1. Show All catalogue\n2. Increase one category's price\n3. Find a product by code\n4. Exit");
        option = keyboard.nextInt();
        keyboard.nextLine();
        while (option < 1 || option > 4) {
            System.out.println("Invalid option ,please enter an option between 1 and 4");
            option = keyboard.nextInt();
            keyboard.nextLine();
        }
        return option;
    }

    public String consultCategory() {
        System.out.println("Please enter the category you want to increase the price");
        String category = keyboard.nextLine();
        return category;
    }

    public String consultProduct() {
        System.out.println("Please enter the code of the product you want to find");
        String product = keyboard.nextLine();
        return product;
    }

    public void connect() {
        ControllerProduct controller = new ControllerProduct();
        controller.control();
    }
}
