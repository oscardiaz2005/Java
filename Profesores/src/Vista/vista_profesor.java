package Vista;

import Controlador.controlador_profesor;
import Modelo.Profesor;

import javax.swing.*;

public class vista_profesor {
    int opciones=0;
    public int menu(){
        String mostrar="Que desea realizar: \n1. Agregar un nuevo profesor \n2. Modificar un profesor \n3. Mostrar todos los profesores \n4.Eliminar un Profesor \n5. Salir";
        mostrar = JOptionPane.showInputDialog(mostrar);
        opciones = Integer.parseInt(mostrar);
        while(opciones<0 || opciones>5){
            mostrar="Que desea realizar: \n1. Agregar un nuevo profesor \n2. Modificar un profesor \n4. Mostrar todos los profesores \n3.Eliminar un Profesor \n4. Salir \nIngrese una opcion valida";
            mostrar = JOptionPane.showInputDialog(mostrar);
            opciones = Integer.parseInt(mostrar);
        }
        return opciones;
    }


    public String identificacion(){
        String mostrar="Ingrese la identificacion";
        mostrar = JOptionPane.showInputDialog(mostrar);
        return mostrar;
    }

    public String identificacionVieja(){
        String mostrar="Ingrese la identificacion Vieja";
        mostrar = JOptionPane.showInputDialog(mostrar);
        return mostrar;
    }

    public String identificacionNueva(){
        String mostrar="Ingrese la identificacion nueva";
        mostrar = JOptionPane.showInputDialog(mostrar);
        return mostrar;
    }


    public Profesor pedirDatosProfe() {

        String mostrar = "Por favor ingrese su Nombre";
        String nombre = JOptionPane.showInputDialog(mostrar);

        mostrar = "Por favor ingrese su Segundo Nombre";
        String segundoNombre = JOptionPane.showInputDialog(mostrar);

        mostrar = "Por favor ingrese su Apellido";
        String apellido = JOptionPane.showInputDialog(mostrar);

        mostrar = "Por favor ingrese su Segundo Apellido";
        String segundoapellido = JOptionPane.showInputDialog(mostrar);

        mostrar = "Por favor ingrese su Correo";
        String correo = JOptionPane.showInputDialog(mostrar);

        mostrar = "Por favor ingrese su edad";
        mostrar = JOptionPane.showInputDialog(mostrar);
        opciones = Integer.parseInt(mostrar);
        return new Profesor(nombre, segundoNombre, apellido, segundoapellido, correo, opciones);
    }



    public void  exito(){
        String mostrar="Se ha realizado la tarea correctamente";
        JOptionPane.showMessageDialog(null,mostrar);
    }

    public void falso(){
        String mostrar="La identifiacaion que registro no existe";
        JOptionPane.showMessageDialog(null,mostrar);
    }

    public void salida(){
        String mostrar="Gracias porm usar nuestro sistema todo quedara subido en un archivo json, Hasta Pronto :D";
        JOptionPane.showMessageDialog(null,mostrar);
    }

    public void mensajeProfesores(String s){
        String mostrar= "Listado de profesores\n " +s;
        JOptionPane.showMessageDialog(null,mostrar);
    }

    public void conectar(){
        controlador_profesor control= new controlador_profesor();
        control.conectar();
    }


}
