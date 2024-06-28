// Definición de la clase Perro
class Perro {
    // Atributos
    String nombre;
    String raza;
    int edad;

    // Método para ladrar
    void ladrar() {
        System.out.println("Guau! Guau!");
    }

    // Método para mostrar información del perro
    void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad + " años");
    }
}

// Clase principal donde se ejecutará el programa
public class Main {
    public static void main(String[] args) {
        // Crear un objeto de tipo Perro
        Perro miPerro = new Perro();

        // Asignar valores a los atributos del perro
        miPerro.nombre = "Fido";
        miPerro.raza = "Labrador";
        miPerro.edad = 3;

        // Invocar métodos del perro
        miPerro.ladrar();
        miPerro.mostrarInformacion();
    }
}
