package Modelo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

public class BD_profesores {

    boolean funciono=false;
    Profesor profe= new Profesor();
    public HashMap<String,Profesor> baseDatos= new HashMap<>();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private String archivoJson="baseDatosProfesores.json";


    private void leerJson(){
        try(FileReader reader = new FileReader(archivoJson)){
            Type type= new TypeToken<HashMap<String,Profesor>>(){}.getType();
            baseDatos= gson.fromJson(reader,type);
        }catch (FileNotFoundException e){
            baseDatos = new HashMap<>();
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    private void actualizarJson(){
        try(FileWriter writer = new FileWriter(archivoJson)){
            gson.toJson(baseDatos, writer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public BD_profesores(){
        leerJson();
    }

    public void agregarProfesor(String identificacion, Profesor profe){
        profe.setIdentificacion(identificacion);
        baseDatos.put(identificacion,profe);
        actualizarJson();
    }

    public String mostrarProfesores (){
        StringBuilder texto=new StringBuilder();
        for (Profesor profe: baseDatos.values()){
            texto.append(profe);
        }
        return texto.toString();
    }

    public void modificarProfesor(String identificacionVieja, String identificacionNueva,Profesor profe) {
        if (baseDatos.containsKey(identificacionVieja)) {
            baseDatos.remove(identificacionVieja);
            profe.setIdentificacion(identificacionNueva);
            baseDatos.put(identificacionNueva, profe);
            actualizarJson();
        }
    }


    public String buscarPorIdentificacion(String identificacion) {
        if (baseDatos.containsKey(identificacion)) {
            return identificacion;
        }else;
        return "";
    }

    public boolean eliminarProfesor(String identificacion){
        if(baseDatos.containsKey(identificacion)){
            baseDatos.remove(identificacion);
            actualizarJson();
            return funciono =true;
        }else {
            return funciono = false;
        }
    }

    public boolean comprobar_inicio_sesion(String correo, String contrasena){
        boolean validar = false;
        for (Profesor profe: baseDatos.values()){
            if(profe.getCorreo().equals(correo)&& profe.getPassword().equals(contrasena)){
                validar=true;
                break;
            }
        }
        return validar;
    }
}
