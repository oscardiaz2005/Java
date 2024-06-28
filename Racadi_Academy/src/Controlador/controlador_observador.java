package Controlador;

import Vista.vista_observador;
import Modelo.BD_observador;
import Modelo.observador;

public class controlador_observador {
    vista_observador vis = new vista_observador();
    BD_observador BD = new BD_observador();

    public void control() {
        boolean continuar = true;

        while (continuar) {
            int opcion = vis.menu();
            switch (opcion) {
                case 1:
                    String ID = vis.recicibirIDHash();
                    String fecha = vis.recicibirFecha();
                    String nombre = vis.recicibirNombre();
                    String documento = vis.recicibirID();
                    String comunicado = vis.recicibirComunicado();


                    vis.mensajeMostrar(BD.añadir(ID, new observador(fecha, nombre, documento, comunicado)));
                    break;
                case 2:
                    BD.mostrar();
                    break;
                case 3:
                    vis.salida();
                    continuar = false;
                    break;
                default:
                    vis.mensajeMostrar("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }
}
