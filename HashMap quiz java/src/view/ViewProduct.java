package view;

import Controller.Controller;

import javax.swing.*;
import java.util.Scanner;

public class ViewProduct {
    public int option;
    public String data;
    public Double dataPrice;

    public int menu() {
        String menuOptions = "Welcome\n1. Show all products\n2. Add product\n3. Update product\n4. Delete product\n5. Increase price by category\n6. Search product\n7. Exit\nChoose an option:";
        String input = JOptionPane.showInputDialog(null, menuOptions);
        option = Integer.parseInt(input);
        while (option > 7 || option < 1) {
            input = JOptionPane.showInputDialog(null, "Invalid option\nChoose between 1 and 7");
            option = Integer.parseInt(input);
        }
        return option;
    }

    public String enterKey() {
        data = JOptionPane.showInputDialog(null, "Enter the product's key");
        return data;
    }

    public String enterName() {
        data = JOptionPane.showInputDialog(null, "Enter the product's name");
        return data;
    }

    public String enterCategory() {
        data = JOptionPane.showInputDialog(null, "Enter the product's category");
        return data;
    }

    public double enterPrice() {
        String input = JOptionPane.showInputDialog(null, "Enter the product's price");
        dataPrice = Double.parseDouble(input);
        return dataPrice;
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public void connect() {
        Controller control = new Controller();
        control.control();
    }
}

