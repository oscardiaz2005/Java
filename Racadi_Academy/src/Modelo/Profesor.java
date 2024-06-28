package Modelo;

public class Profesor {
    private String identificacion;
    private String nombre;
    private String segundoNombre;
    private String apellido;
    private String segundoApellido;
    private String correo;
    private String password;
    private int edad;

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }



    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profesor(String nombre, String segundoNombre, String apellido, String segundoApellido, String correo, String password, int edad) {
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.password = password;
        this.edad = edad;
    }

    public Profesor() {
    }

    @Override
    public String toString() {
        return "\nProfesor" +  '\n'+
                "Identificacion: " + identificacion + '\n' +
                "Nombre: " + nombre + '\n' +
                "Segundo Nombre: " + segundoNombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Segundo Apellido: " + segundoApellido + '\n' +
                "Correo: " + correo + '\n' +
                "Conntraseña: " + password + '\n' +
                "Edad: " + edad +'\n';
    }
}
