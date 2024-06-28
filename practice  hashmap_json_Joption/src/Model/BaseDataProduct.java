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

public class BaseDataProduct {
    private HashMap<String, Product> baseData = new HashMap<>();
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private String jsonFile = "baseData.json";

    public BaseDataProduct() {
        filesFromJson();
    }

    public void showAll() {
        System.out.println(baseData);
    }

    public void addProduct(String newKey, Product newProduct) {
        if (baseData.containsKey(newKey)) {
            System.out.println("The product is already in the base data");
        } else {
            baseData.put(newKey, newProduct);
            updateJson();
            System.out.println("The product " + newKey + " was added");
        }
    }

    public void updateProduct(String findKey, Product updateProduct) {
        if (baseData.containsKey(findKey)) {
            baseData.put(findKey, updateProduct);
            updateJson();
            System.out.println("The product " + findKey + " was updated");
        } else {
            System.out.println("The key " + findKey + " does not exist in the base data");
        }
    }

    public void deleteProduct(String findKey) {
        if (baseData.containsKey(findKey)) {
            baseData.remove(findKey);
            updateJson();
            System.out.println("The product " + findKey + " was deleted");
        } else {
            System.out.println("The key " + findKey + " does not exist in the base data");
        }
    }

    public void increasePriceCategory(String findCategory) {
        boolean exist = false;
        String findCategoryLowerCase = findCategory.toLowerCase();
        for (Product product : baseData.values()) {
            if (product.getCategory().toLowerCase().equals(findCategoryLowerCase)) {
                exist = true;
                break;
            }
        }
        if (exist) {
            System.out.println("The category was found");
            System.out.println("All the products were updated successfully");
            for (Product product : baseData.values()) {
                if (product.getCategory().toLowerCase().equals(findCategoryLowerCase)) {
                    product.setPrice(product.getPrice() * 1.10);
                }
            }
            updateJson();
        } else {
            System.out.println("The category does not exist");
        }
    }

    public void findProductKey(String key) {
        if (baseData.containsKey(key)) {
            System.out.println("The product that you search is:\n" + key + ": " + baseData.get(key));
        } else {
            System.out.println("There is not any product with that code");
        }
    }

    public void filesFromJson(){
        try (FileReader fileReader = new FileReader(jsonFile)){
            Type type = new TypeToken<HashMap<String,Product>>(){}.getType();
            baseData = gson.fromJson(fileReader, type);
            System.out.println("Data loaded from JSON file.");
        } catch (FileNotFoundException e) {
            System.out.println("JSON file not found, initializing empty base data.");
            baseData = new HashMap<>();
        } catch (IOException e) {
            System.out.println("Error reading JSON file.");
            e.printStackTrace();
        }
    }

    public void updateJson(){
        try (FileWriter writer = new FileWriter(jsonFile)){
            gson.toJson(baseData, writer);
            System.out.println("Data saved to JSON file.");
        } catch (IOException e) {
            System.out.println("Error writing to JSON file.");
            e.printStackTrace();
        }
    }
}

