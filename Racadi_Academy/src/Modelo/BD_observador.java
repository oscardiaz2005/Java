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

public class BD_observador {

    HashMap<String, observador> base_datos = new HashMap<>();
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    private String archivoJson = "baseDatosObservador.Json";

    public BD_observador() {
        leerJson();
    }

    private void leerJson() {
        try (FileReader reader = new FileReader(archivoJson)) {
            Type type = new TypeToken<HashMap<String, observador>>() {}.getType();
            base_datos = gson.fromJson(reader, type);
        } catch (FileNotFoundException e) {
            base_datos = new HashMap<>();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void actualizarJson() {
        try (FileWriter writer = new FileWriter(archivoJson)) {
            gson.toJson(base_datos, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String añadir(String ID, observador observador) {
        if (base_datos.containsKey(ID)) {
            return "ID ya se encuentra, ingresa un ID único a tu preferencia";
        } else {
            base_datos.put(ID, observador); // Añadir el observador al base_datos primero
            actualizarJson(); // Luego actualizar el archivo JSON
            return "El comunicado fue añadido";
        }
    }

    public void mostrar() {
        if (base_datos == null || base_datos.isEmpty()) {
            Vista.vista_observador vis = new Vista.vista_observador();
            vis.mostrar("No hay observadores para mostrar.");
            return;
        }

        StringBuilder mensaje = new StringBuilder();
        for (observador observador : base_datos.values()) {
            mensaje.append("Documento: ").append(observador.getDocumento()).append("\n");
            mensaje.append("Fecha: ").append(observador.getFecha()).append("\n");
            mensaje.append("Nombre: ").append(observador.getNombre()).append("\n");
            mensaje.append("Comunicado: ").append(observador.getComunicado()).append("\n");
            mensaje.append("---------------------------\n");
        }

        Vista.vista_observador vis = new Vista.vista_observador();
        vis.mostrar(mensaje.toString());
    }
}