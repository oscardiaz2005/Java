package modelo;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;

public class BaseDatosEstudiante {

    HashMap<String,Estudiante> BaseDatos = new HashMap<>();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private String archivoJson="baseDatosEstudiante.json";

    public BaseDatosEstudiante(){
        leerJson();
    }

    public String añadirEstudiante(String documento,Estudiante estudiante){
        String mensaje="";
        if (BaseDatos.containsKey(documento)){
            mensaje ="el estudiante ya se encuentra en la base de datos ";
        }
        else {
            BaseDatos.put(documento,estudiante);
            estudiante.setIdentificacion(documento);
            actualizarJson();
            mensaje ="el estudiante fue añadido";
        }
        return mensaje;
    }

    public String mostrarEstudiantes (){
        StringBuilder texto=new StringBuilder();
        for (Estudiante estudiante: BaseDatos.values()){
            texto.append(estudiante+"\n");
        }
        return texto.toString();
    }

    public String actualizarEstudiante(String documentoBuscado, Estudiante estudianteActualizado) {
        if (BaseDatos.containsKey(documentoBuscado)) {
            estudianteActualizado.setIdentificacion(documentoBuscado);
            BaseDatos.put(documentoBuscado, estudianteActualizado);
            actualizarJson();
            return "el estudiante fue actualizado";
        } else {
            return "el documento " + documentoBuscado + " no exite en la base de datos.";
        }
    }


    public String eliminarEstudiante(String documentoBuscado) {
        if (BaseDatos.containsKey(documentoBuscado)) {
            BaseDatos.remove(documentoBuscado);
            actualizarJson();
            return "el estudiante fue eliminado";
        } else {
            return "el documento " + documentoBuscado + " no exite en la base de datos.";
        }
    }

    public String buscarEstudiante(String key) {
        if (BaseDatos.containsKey(key)) {
            return  "Estudiante:"+ BaseDatos.get(key);
        } else {
            return "el documento " + key + " no exite en la base de datos.";

        }
    }





    private void leerJson(){
        try (FileReader reader = new FileReader(archivoJson)){
            Type type = new TypeToken<HashMap<String,Estudiante>>(){}.getType();
            BaseDatos = gson.fromJson(reader,type);
        }catch (FileNotFoundException e){
            BaseDatos = new HashMap<>();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void actualizarJson(){
        try (FileWriter writer = new FileWriter(archivoJson)) {
            gson.toJson(BaseDatos,writer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }



}
