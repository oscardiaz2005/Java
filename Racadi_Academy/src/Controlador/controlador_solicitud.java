package Controlador;

import Modelo.BD_solicitud;
import Modelo.Objeto_solicitud;
import Vista.vista_solicitud;


public class controlador_solicitud {

    vista_solicitud vis = new vista_solicitud();
    BD_solicitud BD = new BD_solicitud();

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


                    vis.mensajeMostrar(BD.añadir(ID, new Objeto_solicitud(fecha, nombre, documento, comunicado)));
                    break;
                case 2:
                    BD.mostrar();
                    break;
                case 3:
                    continuar = false;
                    break;
                default:
                    vis.mensajeMostrar("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }
}
