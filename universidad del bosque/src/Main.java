import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad, descuentoPorEdad, descuentoPorSalario;
        float puntajeExamen, descuentoPorExamen, salario, descuentoTotal;

        System.out.print("Por favor ingrese su edad: ");
        edad = scanner.nextInt();

        while (edad < 15 || edad > 90) {
            System.out.print("Por favor ingrese una edad válida: ");
            edad = scanner.nextInt();
        }

        // Calcular descuento por edad
        if (edad >= 15 && edad <= 18) {
            descuentoPorEdad = 25;
        } else if (edad >= 19 && edad <= 21) {
            descuentoPorEdad = 15;
        } else if (edad >= 22 && edad <= 25) {
            descuentoPorEdad = 10;
        } else {
            descuentoPorEdad = 0;
        }

        System.out.print("Ingrese el puntaje del examen entre 0 y 100: ");
        puntajeExamen = scanner.nextFloat();

        while (puntajeExamen < 0 || puntajeExamen > 100) {
            System.out.print("Por favor ingrese un puntaje válido entre 0 y 100: ");
            puntajeExamen = scanner.nextFloat();
        }

        // Calcular descuento por puntaje en el examen
        if (puntajeExamen < 80) {
            descuentoPorExamen = 0;
        } else if (puntajeExamen < 86) {
            descuentoPorExamen = 30;
        } else if (puntajeExamen < 91) {
            descuentoPorExamen = 35;
        } else if (puntajeExamen < 96) {
            descuentoPorExamen = 40;
        } else {
            descuentoPorExamen = 45;
        }

        System.out.print("Ingrese cuántos salarios mínimos gana (entre 0 y 10): ");
        salario = scanner.nextFloat();

        while (salario < 0 || salario > 10) {
            System.out.print("Por favor ingrese un número válido entre 0 y 10 de acuerdo a sus salarios mínimos: ");
            salario = scanner.nextFloat();
        }

        // Calcular descuento por salario
        if (salario <= 1) {
            descuentoPorSalario = 30;
        } else if (salario <= 2) {
            descuentoPorSalario = 20;
        } else if (salario <= 3) {
            descuentoPorSalario = 10;
        } else if (salario <= 4) {
            descuentoPorSalario = 5;
        } else {
            descuentoPorSalario = 0;
        }

        // Calcular el descuento total
        descuentoTotal = descuentoPorEdad + descuentoPorExamen + descuentoPorSalario;

        // Mostrar los beneficios y descuentos al usuario
        System.out.println("Sus beneficios son: Descuento por edad: " + descuentoPorEdad + "%, Descuento por puntaje en el examen: "
                + descuentoPorExamen + "%, Descuento por salario: " + descuentoPorSalario + "%. Descuento total de matrícula: " + descuentoTotal + "%");

        scanner.close();
    }
}
