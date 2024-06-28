package Controlador;

import Modelo.BD_profesores;
import Modelo.Profesor;
import Vista.vista_profesor;

import javax.swing.*;

public class controlador_profesor {
    BD_profesores baseDatos= new BD_profesores();
    Profesor profe = new Profesor();
    vista_profesor vista = new vista_profesor();
    int opciones=0;
    boolean continuar = true;

    public void conectar(){
        while(continuar) {
            opciones = vista.menu();
            switch (opciones) {
                case 1:
                    String identificacion = vista.identificacion();
                    profe = vista.pedirDatosProfe();
                    baseDatos.agregarProfesor(identificacion, profe);
                    vista.exito();
                    break;
                case 2:
                    String identificacionVieja  = vista.identificacionVieja();
                    if(identificacionVieja.equals(baseDatos.buscarPorIdentificacion(identificacionVieja))) {
                        String identificacionNueva  = vista.identificacionNueva();
                        profe = vista.pedirDatosProfe();
                        baseDatos.modificarProfesor(identificacionVieja, identificacionNueva,profe);
                    }else{
                        vista.falso();
                    }
                    break;
                case 3:
                    vista.mensajeProfesores(baseDatos.mostrarProfesores());
                    break;
                case 4:
                    String eliminar = vista.identificacion();
                    baseDatos.eliminarProfesor(eliminar);
                    vista.mensajeProfesores(baseDatos.mostrarProfesores());
                    break;
                case 5:
                    continuar=false;
                    vista.salida();
                    break;
            }
        }
    }

}
