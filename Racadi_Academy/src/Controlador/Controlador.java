package Controlador;

import Modelo.BaseDatosEstudiante;
import Modelo.Estudiante;
import Vista.VistaEstudiante;

public class Controlador {
    VistaEstudiante vistaEstudiante = new VistaEstudiante();
    BaseDatosEstudiante baseDatosEstudiante = new BaseDatosEstudiante();
    Estudiante estudiante = new Estudiante();

    public void control(){
        Boolean continuar = true;

        while (continuar){
            int opcion=vistaEstudiante.menu();
            switch (opcion){
                case 1:
                    String documento = vistaEstudiante.pedirDocumento();
                    estudiante=vistaEstudiante.pedirDatosEstudiante();
                    vistaEstudiante.mostrarMensaje(baseDatosEstudiante.añadirEstudiante(documento,estudiante));
                    break;
                case 2:
                    String aDocumento= vistaEstudiante.pedirDocumento();
                    estudiante=vistaEstudiante.pedirDatosEstudiante();
                    vistaEstudiante.mostrarMensaje(baseDatosEstudiante.actualizarEstudiante(aDocumento,estudiante));
                    break;
                case 3:
                    vistaEstudiante.mostrarMensaje(baseDatosEstudiante.mostrarEstudiantes());
                    break;
                case 4:
                    String eDocumento= vistaEstudiante.pedirDocumento();
                    vistaEstudiante.mostrarMensaje(baseDatosEstudiante.eliminarEstudiante(eDocumento));
                    break;
                case 5:
                    String bDocumento= vistaEstudiante.pedirDocumento();
                    vistaEstudiante.mostrarMensaje(baseDatosEstudiante.buscarEstudiante(bDocumento));
                    break;
                case 6:
                    vistaEstudiante.mostrarMensaje("saliendo de el programa.............");
                    continuar=false;
            }

        }


    }
}
