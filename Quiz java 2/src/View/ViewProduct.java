package View;

import Controller.Controller;
import Model.Product;

import javax.swing.*;

public class ViewProduct {

    public int menu(){
        String options = JOptionPane.showInputDialog(null,"Choose an option\n1. Show all products\n2. Add product\n3. show name mayor price\n4.show total inventory iva\n5.exit");
        int input = Integer.parseInt(options);
        while (input>5 || input<1){
            JOptionPane.showMessageDialog(null,"invalid option\n choose again");
            options = JOptionPane.showInputDialog(null,"Choose an option\n1. Show all products\n2. Add product\n3. show name mayor price\n4.show total inventory iva\n5.exit");
            input = Integer.parseInt(options);
        }
        return input;
    }

    public String askKey(){
        String key=JOptionPane.showInputDialog(null,"enter the product's key");
        while (key.equals("")){
            JOptionPane.showMessageDialog(null,"invalid data\nplease enter again");
            key=JOptionPane.showInputDialog(null,"enter the product's key");

        }
        return key;
    }

    public Product askProduct(){
        String name =JOptionPane.showInputDialog(null,"enter the product's name");
        String priceS =JOptionPane.showInputDialog(null,"enter the product's price");
        String stockS =JOptionPane.showInputDialog(null,"enter the product's stock");
        while (name.equals("")||priceS.equals("")||stockS.equals("")){
            JOptionPane.showMessageDialog(null, "invalid data\nenter again");
            name =JOptionPane.showInputDialog(null,"enter the product's name");
            priceS =JOptionPane.showInputDialog(null,"enter the product's price");
            stockS =JOptionPane.showInputDialog(null,"enter the product's stock");
        }


        int price=Integer.parseInt(priceS);
        int stock=Integer.parseInt(stockS);


        while (price<0 || stock<0){
            JOptionPane.showMessageDialog( null,"invalid price or stock\n please enter a value greater than 0 ");
            priceS =JOptionPane.showInputDialog(null,"enter the product's price");
            stockS =JOptionPane.showInputDialog(null,"enter the product's stock");

            price=Integer.parseInt(priceS);
            stock=Integer.parseInt(stockS);
        }

        return new Product(name,price,stock);
    }

    public void showMessage(String string){
        JOptionPane.showMessageDialog(null,string);
    }
    public void connect(){
        Controller controller = new Controller();
        controller.control();
    }
}
