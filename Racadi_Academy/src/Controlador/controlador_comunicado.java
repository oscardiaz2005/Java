package Controlador;

import Modelo.BD_comunicado;
import Modelo.Objeto_comunicado;
import Vista.vista_comunicado;


public class controlador_comunicado {

    vista_comunicado vis = new vista_comunicado();
    BD_comunicado BD = new BD_comunicado();

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


                    vis.mensajeMostrar(BD.añadir(ID, new Objeto_comunicado(fecha, nombre, documento, comunicado)));
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
