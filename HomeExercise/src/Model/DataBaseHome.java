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

public class DataBaseHome {

    HashMap<String,HomeAppliance> database = new HashMap<>();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private String jsonFile = "dataBase.json";

    public DataBaseHome(){
        LoadJsonFile();
    }


    public String showAll(){
        String all ="";
        for (HomeAppliance homeAppliance : database.values()){
            all+=homeAppliance;
        }
        return all;


    }
    public String addTv(String key,Tv newtv){
        if (database.containsKey(key)){
            return "the tv is already in the data base";
        }else {
            database.put(key,newtv);
            updateJsonFile();
            return "the tv was added successfully";

        }
    }

    public String addportatil(String key,Portatil newportatil){
        if (database.containsKey(key)){
            return "the portatil is already in the data base";
        }else {
            database.put(key,newportatil);
            updateJsonFile();
            return "the portatil was added successfully";

        }
    }

    public String updateTv(String findkey , Tv tvUptade){
        if (database.containsKey(findkey)){
            database.put(findkey,tvUptade);
            updateJsonFile();
            return "the tv was updated successfully";
        }
        else {
            return "the tv does not exist";
        }

    }

    public String updatePortatil(String findkey , Portatil porUptade){
        if (database.containsKey(findkey)){
            database.put(findkey,porUptade);
            updateJsonFile();
            return "the portatil was updated successfully";
        }
        else {
            return "the portatil does not exist";
        }

    }

    public String deleteHome(String findkey){
        if (database.containsKey(findkey)){
            database.remove(findkey);
            updateJsonFile();
            return "the Home appliance was deleted successfully";
        }
        else {
            return "the Home appliance does not exist";
        }

    }

    public String increaseAll(){
        for (HomeAppliance homeAppliance : database.values()){
            homeAppliance.setPrice((int) (homeAppliance.getPrice()*1.10));
            updateJsonFile();
        }
        updateJsonFile();

        return "all home appliance's price was increased  ";

    }

    public String increaseTv() {
        for (HomeAppliance homeAppliance : database.values()) {
            if (homeAppliance instanceof Tv) {
                homeAppliance.setPrice(6000);
            }
        }
        updateJsonFile();

        return "all tv prices was updated  ";

    }










    private void LoadJsonFile(){
        try(FileReader reader = new FileReader(jsonFile)) {
            Type type = new TypeToken<HashMap<String,HomeAppliance>>(){}.getType();
            database = gson.fromJson(reader,type);
        }catch (FileNotFoundException e){
            database=new HashMap<>();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void updateJsonFile(){
        try (FileWriter writer = new FileWriter(jsonFile)){
            gson.toJson(database,writer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
