package Controller;

import Model.BaseDataProduct;
import Model.Product;
import View.ViewProduct;

public class ControllerProduct {
Product product = new Product();
BaseDataProduct baseDataProduct = new BaseDataProduct();
ViewProduct viewProduct = new ViewProduct();

public int menu =0;
public void control(){
    Boolean follow=true;
    while (follow){
         int option=viewProduct.menu();
         switch (option) {
             case 1:
                 baseDataProduct.showAll();
                 break;
             case 2:
                 String findCategory = viewProduct.consultCategory();
                 baseDataProduct.increasePriceCategory(findCategory);
                 break;
             case 3:
                 String findProduct = viewProduct.consultProduct();
                 baseDataProduct.findProductCode(findProduct);
                 break;
             case 4:
                 follow = false;
                 break;
         }

    }
}
}
