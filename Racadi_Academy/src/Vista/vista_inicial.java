package Vista;

import Controlador.controlador_inicial;
import Controlador.controlador_profesor;

import javax.swing.*;

public class vista_inicial {
    int opciones=0;
    public int menu_inicial(){
        String mostrar="Que desea realizar: \n1. Estudiante \n2. Profesor \n3. Observador \n4. Comunicado\n5. Salir";
        mostrar = JOptionPane.showInputDialog(mostrar);
        opciones = Integer.parseInt(mostrar);
        while(opciones<0 || opciones>5){
            mostrar="Que desea realizar: \n1. Estudiante \n2. Profesor \n3. Observador \n4. Comunicado\n5. Salir \nIngrese una opcion valida";
            mostrar = JOptionPane.showInputDialog(mostrar);
            opciones = Integer.parseInt(mostrar);
        }
        return opciones;
    }

    public void conectar(){
        controlador_inicial control= new controlador_inicial();
        control.conectar();
    }


}
