package Vista;

import Modelo.BaseDatosEstudiante;

import javax.swing.*;

public class LoginEstudiante {
    BaseDatosEstudiante baseDatosEstudiante = new BaseDatosEstudiante();

    public String PedirCorreo(){
        String correo = JOptionPane.showInputDialog(null, "Ingrese su correo");
        return correo;
    }
    public String PedirContraseña(){
        String contraseña = JOptionPane.showInputDialog(null, "Ingrese su contraseña");
        return contraseña;
    }
}

