package Modelo;

public class Estudiante {
    private String identificacion;
    private String nombre;
    private String segundoNombre;
    private String apellido;
    private String segundoApellido;
    private String correo;
    private String contraseña;
    private String edad;
    private String nivel;
    private String sede;

    public Estudiante(){

    }

    public Estudiante(String nombre, String segundoNombre, String apellido, String segundoApellido, String correo, String contraseña, String edad, String nivel, String sede) {
        this.nombre = nombre;
        this.segundoNombre = segundoNombre;
        this.apellido = apellido;
        this.segundoApellido = segundoApellido;
        this.correo = correo;
        this.contraseña = contraseña;
        this.edad = edad;
        this.nivel = nivel;
        this.sede = sede;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getEdad() {
        return edad;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getNivel() {
        return nivel;
    }

    public String getSede() {
        return sede;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return
                "\n identificacion='" + identificacion +
                "\nnombre='" + nombre +
                "\n segundoNombre='" + segundoNombre +
                "\n apellido='" + apellido +
                "\n segundoApellido='" + segundoApellido +
                "\n correo='" + correo + "\n contraseña='" + contraseña +
                "\n edad=" + edad+"\n nivel='" + nivel +
                        "\n sede='" + sede


                ;
    }
}

