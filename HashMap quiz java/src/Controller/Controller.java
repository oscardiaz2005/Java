package Controller;

import Model.BaseDataProduct;
import Model.Product;
import view.ViewProduct;

public class Controller {
    BaseDataProduct baseDataProduct = new BaseDataProduct();
    ViewProduct viewProduct = new ViewProduct();

    public void control() {
        boolean go = true;
        while (go) {
            int option = viewProduct.menu();
            switch (option) {
                case 1:
                    viewProduct.showMessage(baseDataProduct.showAll());
                    break;
                case 2:
                    String key = viewProduct.enterKey();
                    String name = viewProduct.enterName();
                    String category = viewProduct.enterCategory();
                    Double price = viewProduct.enterPrice();
                    viewProduct.showMessage(baseDataProduct.addProduct(key, new Product(name, category, price)));
                    break;
                case 3:
                    String keyU = viewProduct.enterKey();
                    String nameU = viewProduct.enterName();
                    String categoryU = viewProduct.enterCategory();
                    Double priceU = viewProduct.enterPrice();
                    viewProduct.showMessage(baseDataProduct.updateProduct(keyU, new Product(nameU, categoryU, priceU)));
                    break;
                case 4:
                    String keyD = viewProduct.enterKey();
                    viewProduct.showMessage(baseDataProduct.deleteProduct(keyD));
                    break;
                case 5:
                    String categoryI = viewProduct.enterCategory();
                    viewProduct.showMessage(baseDataProduct.increasePriceCategory(categoryI));
                    break;
                case 6:
                    String keyS = viewProduct.enterKey();
                    viewProduct.showMessage(baseDataProduct.findProductKey(keyS));
                    break;
                case 7:
                    viewProduct.showMessage("Leaving program...");
                    go = false;
                    break;
            }
        }
    }
}

