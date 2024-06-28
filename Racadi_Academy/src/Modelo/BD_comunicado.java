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


public class BD_comunicado {


    HashMap<String, Objeto_comunicado>base_datos = new HashMap<>();
    Gson gson =new GsonBuilder().setPrettyPrinting().create();
    private String  archivoJson="baseDatosComunicado.Json";

    public BD_comunicado(){
        leer_Jason();
    }


    private void leer_Jason(){
        try (FileReader reader = new FileReader(archivoJson)){
            Type type = new TypeToken<HashMap<String, Objeto_comunicado> >(){}.getType();
            base_datos =gson.fromJson(reader,type);
        }catch (FileNotFoundException e){
            base_datos =new  HashMap<>();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    private void actualizarJson(){
        try (FileWriter writer = new FileWriter(archivoJson)){
            gson.toJson(base_datos,writer);
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public  String añadir(String ID, Objeto_comunicado observador){
        actualizarJson();

        if (base_datos.containsKey(ID)){
            String mensaje="ID ya se encuentra ingresa un ID unico a tu prefrencia";
            return mensaje;

        }
        else {
            base_datos.put(ID,observador);
            actualizarJson();
            String mensaje ="el comunicado  fue añadido";
            return mensaje;

        }


    }
    public void mostrar() {
        if (base_datos == null || base_datos.isEmpty()) {
            Vista.vista_comunicado vis = new Vista.vista_comunicado();
            vis.mostrar("No hay observadores para mostrar.");
            return;
        }

        StringBuilder mensaje = new StringBuilder();
        for (Objeto_comunicado observador : base_datos.values()) {
            mensaje.append("Documento: ").append(observador.getDocumento()).append("\n");
            mensaje.append("Fecha: ").append(observador.getFecha()).append("\n");
            mensaje.append("Nombre: ").append(observador.getNombre()).append("\n");
            mensaje.append("Comunicado: ").append(observador.getComunicado()).append("\n");
            mensaje.append("---------------------------\n");
        }

        Vista.vista_comunicado vis = new Vista.vista_comunicado();
        vis.mostrar(mensaje.toString());
    }


}
