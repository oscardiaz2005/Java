package Modelo;

public class observador {

    private String fecha;
    private String Nombre;
    private String documento;
    private String comunicado;

    public observador(){}

    public observador(String fecha, String nombre, String documento, String comunicado) {
        this.fecha = fecha;
        this.Nombre = nombre;
        this.documento = documento;
        this.comunicado = comunicado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getComunicado() {
        return comunicado;
    }

    public void setComunicado(String comunicado) {
        this.comunicado = comunicado;
    }
}
