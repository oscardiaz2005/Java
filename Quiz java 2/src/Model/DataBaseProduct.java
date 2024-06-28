package Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

public class DataBaseProduct {
    HashMap<String,Product> dataBase = new HashMap<>();
    HashMap<String,String> details = new HashMap<>();

    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    Gson gson2 = new GsonBuilder().setPrettyPrinting().create();
    private String jsonFile="DataBase.json";
    private String jsonFile2="Details.json";

    public DataBaseProduct(){
        loadJsonFile();
    }

    public String showAll() {
        StringBuilder result = new StringBuilder("All Products:\n");
        for (String key : dataBase.keySet()) {
            result.append("Code: ").append(key).append(dataBase.get(key)).append("\n");
        }
        return result.toString();
    }

    public String addProduct(String newKey, Product newProduct){
        if (dataBase.containsKey(newKey)){
            return "ERROR\nthe Code is already in the data base";
        }
        else {
            dataBase.put(newKey,newProduct);
            updateJson();
            return "The product " + newKey + " was added successfully";
        }


    }

    public String showMayorPrice(){
        String nameMayorPrice="";
        updatexd();
        updateJson();
        int mayorPrice=0;
        for (Product product: dataBase.values()){
            if (product.getPrice()>mayorPrice){
                nameMayorPrice=product.getName();
                mayorPrice=product.getPrice();
            }
        }
        details.put("Name Product With Mayor Price ",nameMayorPrice);
        updateJson2();
        return "The product with the mayor price is " + nameMayorPrice + " with a price of " + mayorPrice;

    }

    public String totalIva(){
        double total = 0;
        updatexd();
        updateJson();
        for (Product product : dataBase.values()){
            total+=product.getSubTotalIva();
        }
        String totalString=""+total;
        details.put("Total iva inventory  ",totalString );
        updateJson2();
        return "Total inventory Iva = "+total;
    }

    private void loadJsonFile(){
        try (FileReader reader = new FileReader(jsonFile)){
            Type type = new TypeToken<HashMap<String,Product>>(){}.getType();
            dataBase=gson.fromJson(reader,type);
        }catch (FileNotFoundException e){
            dataBase.put("1",new Product("Apple",5000,25));
            dataBase.put("2",new Product("Lemon",2300,15));
            dataBase.put("3",new Product("pear",2700,33));
            dataBase.put("4",new Product("arandano",9300,5));
            dataBase.put("5",new Product("tomatoes",2100,42));
            dataBase.put("6",new Product("strawberry",4100,3));
            dataBase.put("7",new Product("ice cream",4500,41));
            dataBase.put("8",new Product("cookies",500,8));
            dataBase.put("9",new Product("chocolates",3500,80));
            dataBase.put("10",new Product("jamon",15000,10));
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void updateJson(){
        try (FileWriter writer = new FileWriter(jsonFile)){
            gson.toJson(dataBase,writer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void updateJson2(){
        try (FileWriter writer = new FileWriter(jsonFile2)){
            gson2.toJson(details,writer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void updatexd(){
        loadJsonFile();
        int key=1;
            for (Product product : dataBase.values()){
                dataBase.put(""+key,new Product(product.getName(),product.getPrice(),product.getStock()));
                key+=1;
            }

    }
}
