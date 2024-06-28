package controller;
import model.*;
import view.View;


public class Controller {
    Dessert dessert = new Dessert();
    BaseDataDessert baseDataDessert = new BaseDataDessert();
    View view= new View();
    public String data;

    public int menu=0;
    public void control(){
        boolean follow=true;
        while (follow){
            int option= view.Menu();
            switch (option){
                case 1:
                    baseDataDessert.showAll();
                    break;
                case 2:
                    String name= view.captureName();
                    String category= view.captureCategory();
                    int price= view.capturePrice();
                    int stock= view.captureStock();
                    Dessert newDessert = new Dessert(name,category,price,stock);
                    baseDataDessert.addDessert(newDessert);
                    break;
                case 3:
                    data= view.findDelete();
                    baseDataDessert.DeleteDessert(data);
                    break;
                case 4:
                    data= view.findCategory();
                    baseDataDessert.showCategory(data);
                    break;
                case 5:
                    baseDataDessert.biggestPrice();
                    break;
                case 6:
                    follow=false;
                    break;
            }
        }


    }


}

