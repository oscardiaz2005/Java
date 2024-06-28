package View;

import Controller.Controller;
import Model.Portatil;
import Model.Tv;

import javax.swing.*;

public class ViewHome {

    public int menu(){
        String options = JOptionPane.showInputDialog(null,"choose an option\n1. show all\n2. add tv\n3. add portatil\n4.update tv\n5.update portatil\n6.delete\n7. increase\n8. set tv 6000\n9.exit");
        int input = Integer.parseInt(options);
        while (input<1 || input>9){
            JOptionPane.showMessageDialog(null,"invalid option");
            options = JOptionPane.showInputDialog(null,"choose an option\n1. show all\n2. add tv\n3. add portatil\n4.update tv\n5.update portatil\n6.delete\n7. increase\n8. set tv 6000\n9. exit");
            input = Integer.parseInt(options);

        }
        return input;
    }

    public String askForkey(){
        String key = JOptionPane.showInputDialog(null,"enter the key");
        return key;
    }
    public Tv askForTv(){
        String name=JOptionPane.showInputDialog(null,"enter the name");
        String brand=JOptionPane.showInputDialog(null,"enter the brand");
        String price=JOptionPane.showInputDialog(null,"enter the price");
        int price2=Integer.parseInt(price);
        String color=JOptionPane.showInputDialog(null,"enter the color");
        return new Tv(name,brand,price2,color);
    }

    public Portatil askForportatil(){
        String name=JOptionPane.showInputDialog(null,"enter the name");
        String brand=JOptionPane.showInputDialog(null,"enter the brand");
        String price=JOptionPane.showInputDialog(null,"enter the price");
        int price2=Integer.parseInt(price);
        String year=JOptionPane.showInputDialog(null,"enter the year");
        return new Portatil(name,brand,price2,year);
    }

    public void showMessage(String mess){
        JOptionPane.showMessageDialog(null,mess);
    }
    public void  connect(){
        Controller controller = new Controller();
        controller.control();
    }



}
