package controller;

import Model.BaseDataProduct;
import Model.Product;
import view.ViewProduct;

public class Controller {
    BaseDataProduct baseDataProduct = new BaseDataProduct();
    ViewProduct viewProduct = new ViewProduct();
    Product product = new Product();

    public void control(){
        boolean go = true;
        while (true){
            int option= viewProduct.menu();
            switch (option){
                case 1:
                    baseDataProduct.showAll();
                    break;
                case 2:
                    String key = viewProduct.enterKey();
                    String name = viewProduct.enterName();
                    String category = viewProduct.enterCategory();
                    Double price = viewProduct.enterPrice();
                    baseDataProduct.addProduct(key,new Product(name,category,price));
                    break;
                case 3:
                    String keyU = viewProduct.enterKey();
                    String nameU = viewProduct.enterName();
                    String categoryU = viewProduct.enterCategory();
                    Double priceU = viewProduct.enterPrice();
                    baseDataProduct.updateProduct(keyU,new Product(nameU,categoryU,priceU));
                    break;
                case 4:
                    String keyD = viewProduct.enterKey();
                    baseDataProduct.deleteProduct(keyD);
                    break;
                case 5:
                    String categoryI=viewProduct.enterCategory();
                    baseDataProduct.increasePriceCategory(categoryI);
                    break;
                case 6:
                    String keyS= viewProduct.enterKey();
                    baseDataProduct.findProductKey(keyS);
                    break;
                case 7:
                    System.out.println("leaving program..............");
                    go=false;
                    break;


            }
        }
    }

}