package Model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

public class BaseDataProduct {
    private HashMap<String, Product> baseData = new HashMap<>();
    final
    private Gson gson = new GsonBuilder().setPrettyPrinting().create();
    final

    private String jsonFile = "baseData.json";

    public BaseDataProduct() {
        // Intentar cargar los datos desde el archivo JSON
        loadFromJsonFile();
    }

    public String showAll() {
        StringBuilder result = new StringBuilder("All Products:\n");
        for (String key : baseData.keySet()) {
            result.append("Key: ").append(key).append(", Product: ").append(baseData.get(key)).append("\n");
        }
        return result.toString();
    }

    public String addProduct(String newKey, Product newProduct) {
        if (baseData.containsKey(newKey)) {
            return "The product is already in the base data.";
        } else {
            baseData.put(newKey, newProduct);
            updateJsonFile();
            return "The product " + newKey + " was added.";
        }
    }

    public String updateProduct(String findKey, Product updateProduct) {
        if (baseData.containsKey(findKey)) {
            baseData.put(findKey, updateProduct);
            updateJsonFile();
            return "The product " + findKey + " was updated.";
        } else {
            return "The key " + findKey + " does not exist in the base data.";
        }
    }

    public String deleteProduct(String findKey) {
        if (baseData.containsKey(findKey)) {
            baseData.remove(findKey);
            updateJsonFile();
            return "The product " + findKey + " was deleted.";
        } else {
            return "The key " + findKey + " does not exist in the base data.";
        }
    }

    public String increasePriceCategory(String findCategory) {
        boolean exist = false;
        String findCategoryLowerCase = findCategory.toLowerCase();
        for (Product product : baseData.values()) {
            if (product.getCategory().toLowerCase().equals(findCategoryLowerCase)) {
                exist = true;
                break;
            }
        }
        if (exist) {
            for (Product product : baseData.values()) {
                if (product.getCategory().toLowerCase().equals(findCategoryLowerCase)) {
                    product.setPrice(product.getPrice() * 1.10);
                }
            }
            updateJsonFile();
            return "The category was found and all the products were updated successfully.";
        } else {
            return "The category does not exist.";
        }
    }

    public String findProductKey(String key) {
        if (baseData.containsKey(key)) {
            return  key + ": " + baseData.get(key);
        } else {
            return "There is not any product with that code.";
        }
    }

    private void updateJsonFile() {
        try (FileWriter writer = new FileWriter(jsonFile)) {
            gson.toJson(baseData, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void loadFromJsonFile() {
        try (FileReader reader = new FileReader(jsonFile)) {
            Type type = new TypeToken<HashMap<String, Product>>(){}.getType();
            baseData = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            baseData = new HashMap<>();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}


