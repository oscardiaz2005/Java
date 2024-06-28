package model;

import java.util.ArrayList;

public class BaseDataDessert {
    Dessert dessert =new Dessert();
    ArrayList<Dessert> BaseData =new ArrayList<>();

    public BaseDataDessert() {
        BaseData.add(new Dessert("chocolate cake" ,"cake",3000,3));
        BaseData.add(new Dessert("chocolate cookie" ,"cookie",4000,2));
        BaseData.add(new Dessert("choco ball" ,"candy",300,5));
    }

    public void showAll(){
        System.out.println(BaseData);
    }

    public void addDessert(Dessert dessert){
        boolean exist=false;
     for ( Dessert d :BaseData){
         if(d.getName().equals(dessert.getName())){
             exist=true;
             break;
         }
         }
     if (!exist){
         BaseData.add(dessert);
         System.out.println("the desert was added successfully");
     }
     else {
         System.out.println("the desert is already in the base data");

     }
    }

    public void DeleteDessert(String deleteName){
        boolean deleted=false;
        for ( Dessert dessert : BaseData){
            if (dessert.getName().toLowerCase().equals(deleteName.toLowerCase())){
                BaseData.remove(dessert);
                System.out.println("the dessert was deleted successfully");
                deleted=true;
                break;
            }
        }
        if (!deleted){
            System.out.println("the dessert does not exist");
        }
    }


    public void showCategory(String findCategory){
         String allCategory="";
         boolean exist=false;
         for (Dessert dessert :BaseData){
             if (dessert.getCategory().toLowerCase().equals(findCategory.toLowerCase())){
                 allCategory+=dessert;
                 exist=true;
             }

         }
         if (exist){
             System.out.println("the category "+findCategory+" was found");
             System.out.println(allCategory);
         }
         else {
             System.out.println("the category "+findCategory+" was not found");
         }

    }

    public void biggestPrice(){
        int biggestprice=0;
        String name= "the desserts with the biggest prices are = ";
        for (Dessert dessert: BaseData){
            if (dessert.getPrice()>biggestprice){
                biggestprice=dessert.getPrice();
            }
        }
        for (Dessert dessert: BaseData){
            if (dessert.getPrice()==biggestprice){
                name+=dessert.getName()+", ";
            }
        }
        name+= " with a price of " + biggestprice;
        System.out.println(name);



    }



    @Override
    public String toString() {
        return "BaseDataDessert=" +
                "dessert=" + dessert +
                ", BaseData=" + BaseData +
                '}';
    }

}
