package view;

import controller.Controller;

import java.util.Scanner;

public class ViewProduct {
    public int option;
    public String data;
    public Double dataPrice;
    Scanner scanner = new Scanner(System.in);

    public int menu() {
        System.out.println("welcome\n1.show all products\n2.add product\n3.update product\n4.delete product\n5.increase price category\n6.search product\n7.exit\nchoose an option");
        option = scanner.nextInt();
        scanner.nextLine();
        while (option > 7 || option < 1) {
            System.out.println("invalid option\nchoose between 1 and 7");
            option = scanner.nextInt();
            scanner.nextLine();
        }
        return option;
    }

    public String enterKey() {
        System.out.println("enter the product's key");
        data = scanner.nextLine();
        return data;
    }

    public String enterName() {
        System.out.println("enter the product's name");
        data = scanner.nextLine();
        return data;
    }

    public String enterCategory() {
        System.out.println("enter the product's category");
        data = scanner.nextLine();
        return data;
    }

    public double enterPrice() {
        System.out.println("enter the product's price");
        dataPrice = scanner.nextDouble();
        scanner.nextLine();
        return dataPrice;
    }

    public void connect() {
        Controller control = new Controller();
        control.control();
    }
}