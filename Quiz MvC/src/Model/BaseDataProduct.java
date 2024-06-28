package Model;

import java.util.ArrayList;

public class BaseDataProduct {
    Product product = new Product();
    ArrayList<Product> BaseData =new ArrayList<>();

    public BaseDataProduct() {
        BaseData.add(new Product("123","big mac","burger",2000));
        BaseData.add(new Product("123","cheese burger","burger",4300));
        BaseData.add(new Product("1234","coca cola","drink",1500));
        BaseData.add(new Product("12345","choco chips","drink",2500));
        BaseData.add(new Product("123456","pants","clothes",3000));
        BaseData.add(new Product("1234567","iphone","smartphone",5000));
    }

    public void showAll(){
        for (Product product : BaseData){
            System.out.println(product);
        }
    }

    public void increasePriceCategory(String findCategory) {
        Boolean exist = false;
        String findCategoryLowerCase = findCategory.toLowerCase();
        for (Product product : BaseData) {
            if (product.getCategory().toLowerCase().equals(findCategoryLowerCase)) {
                exist = true;
                break;
            }
        }
        if (exist) {
            System.out.println("the category was found");
            System.out.println("all the products were updated successfully");
            for (Product product : BaseData) {
                if (product.getCategory().toLowerCase().equals(findCategoryLowerCase)) {
                    product.setPrice(product.getPrice() * 1.10);
                }
            }
        } else {
            System.out.println("the category does not exist");
        }
    }


    public void findProductCode(String code){
        String productFind="";
         boolean exist=false;
        for (Product product : BaseData){
            if (product.getCode().toLowerCase().equals(code)){
                productFind+= product;
                exist=true;
                break;
            }
        }
        if (exist){
            System.out.println("the product that you search is:"+productFind);
        }
        else {
            System.out.println("there is not any product with that code");
        }

    }

    @Override
    public String toString() {
        return "BaseDataProduct{" +
                "product=" + product +
                ", BaseData=" + BaseData +
                '}';
    }

}
