package vista;

import controlador.Controlador;
import modelo.Estudiante;

import javax.swing.*;

public class VistaEstudiante {
    private int opcion;

    public int menu(){
        String opciones ="elige una opcion :\n1. Agregar un nuevo estudiante \n2. actualizar un estudiante \n3. Mostrar todos los estudiantes \n4. Eliminar un estudiante \n5. buscar un estudiante\n6. salir";
        String input = JOptionPane.showInputDialog(null,opciones);
        opcion=Integer.parseInt(input);
        while(opcion<0 || opcion>6){
            mostrarMensaje("opcion invalida");
            opciones ="elige una opcion :\n1. Agregar un nuevo estudiante \n2. Modificar un estudiante \n3. Mostrar todos los estudiantes \n4. Eliminar un estudiante \n5. buscar un estudiante\n6. salir";
            input = JOptionPane.showInputDialog(null,opciones);
            opcion=Integer.parseInt(input);
        }
        return opcion;
    }



    public String pedirDocumento(){
        String documento =JOptionPane.showInputDialog(null,"ingrese el documento");
        while (documento.equals("")){
            JOptionPane.showMessageDialog(null,"campo invalido\ningreselo de nuevo");
            documento =JOptionPane.showInputDialog(null,"ingrese el documento");

        }
        return documento;
    }
    public Estudiante pedirDatosEstudiante(){
        String nombre =JOptionPane.showInputDialog(null,"ingrese el  primer nombre");
        String segundoNombre =JOptionPane.showInputDialog(null,"ingrese el segundo nombre");
        String apellido =JOptionPane.showInputDialog(null,"ingrese el  primer apellido");
        String segundoApellido =JOptionPane.showInputDialog(null,"ingrese el segundo apellido");
        String correo =JOptionPane.showInputDialog(null,"ingrese el correo");
        String contraseña =JOptionPane.showInputDialog(null,"ingrese la contraseña");
        String edad =JOptionPane.showInputDialog(null,"ingrese la edad");
        String nivel =JOptionPane.showInputDialog(null,"ingrese el nivel de el estudiante");
        String sede =JOptionPane.showInputDialog(null,"ingrese la sede donde estudia el estudinate");

        while (nombre.equals("") || segundoNombre.equals("") ||  apellido.equals("")  ||  segundoApellido.equals("") ||   correo.equals("") ||  edad.equals("") || contraseña.equals("") || nivel.equals("") || sede.equals("")){
            JOptionPane.showMessageDialog(null,"alguno de los campos  es invalido\npor favor ingrese los datos de nuevo");
            nombre =JOptionPane.showInputDialog(null,"ingrese el  primer nombre");
            segundoNombre =JOptionPane.showInputDialog(null,"ingrese el segundo nombre");
            apellido =JOptionPane.showInputDialog(null,"ingrese el  primer apellido");
            segundoApellido =JOptionPane.showInputDialog(null,"ingrese el segundo apellido");
            correo =JOptionPane.showInputDialog(null,"ingrese el correo");
            edad =JOptionPane.showInputDialog(null,"ingrese la edad");
        }

        return new Estudiante(nombre,segundoNombre,apellido,segundoApellido,correo,contraseña,edad,nivel,sede);
    }



    public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null,mensaje);
    }


    public  void  conectar(){
        Controlador controlador = new Controlador();
        controlador.control();
    }


}
