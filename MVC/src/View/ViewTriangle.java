package View;
import Controller.TriangleController;
import java.util.Scanner;

public class ViewTriangle {
    Scanner scanner = new Scanner(System.in);
    public int data;
    public int option;

    public int requestSide(){
        System.out.println("enter the side");
        data=scanner.nextInt();
        return data;
    }

    public int requestHeight(){
        System.out.println("enter the first triangle's height");
        data=scanner.nextInt();
        return data;
    }

    public int menu(){
        option=0;
        System.out.println("enter an option between 1 and 4 ");
        while (option<=0 || option >4){
            System.out.println("What do you wanna do?\n1.Add triangle\n2.Show all triangles\n3.search per Type\n4.exit");
            try {
                option=scanner.nextInt();
            }catch (Exception e){
                System.out.println("the option has to be a number");
                scanner.next();
            }
        }
        return option;
    }

    public String ConsultType(){
        System.out.println("which type do you want to search");
        String text=scanner.next().toUpperCase();
        return text;

    }
    public void connect (){
        TriangleController controller = new TriangleController();
        controller.Controller();

    }





}