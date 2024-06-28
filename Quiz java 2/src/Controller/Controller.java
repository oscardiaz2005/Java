package Controller;

import Model.DataBaseProduct;
import Model.Product;
import View.ViewProduct;

public class Controller {
    DataBaseProduct dataBaseProduct = new DataBaseProduct();
    ViewProduct viewProduct = new ViewProduct();

    public void control(){
        boolean follow=true;
        while (follow){
            int option= viewProduct.menu();
            switch (option){
                case 1:
                    System.out.println(dataBaseProduct.showAll());
                    break;
                case 2:
                    String key= viewProduct.askKey();
                    Product product=viewProduct.askProduct();
                    viewProduct.showMessage(dataBaseProduct.addProduct(key,product));
                    break;
                case 3:
                    viewProduct.showMessage(dataBaseProduct.showMayorPrice());
                    break;
                case 4:
                    viewProduct.showMessage(dataBaseProduct.totalIva());
                    break;
                case 5:
                    viewProduct.showMessage("leaving program------------");
                    follow=false;
            }
        }

    }
}
