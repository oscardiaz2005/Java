import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido a nuestra tienda de postres");
        System.out.println("Tenemos 7 increíbles postres para ofrecerte los cuales son:");
        System.out.println("1. Postre de chocolate - Precio: $5000");
        System.out.println("2. Postre de limón - Precio: $3500");
        System.out.println("3. Postre de naranja - Precio: $2400");
        System.out.println("4. Postre de fresa - Precio: $3000");
        System.out.println("5. Postre tres leches - Precio: $8000");
        System.out.println("6. Helado de vainilla - Precio: $1500");
        System.out.println("7. Brownie - Precio: $1000");

        int totalFinal = 0;
        String answer = "si";

        while (answer.toLowerCase().equals("si")) {

            System.out.println("Digite el numero del postre que quiere comprar");
            Scanner x=new Scanner(System.in);
            int postre= x.nextInt();

            while (!(postre >= 1 && postre <= 7)) {
                System.out.println("Ese número de postre no existe. Por favor, ingrese el número nuevamente.");
                postre=x.nextInt();
            }

            System.out.println("Digite el número de unidades que desea comprar");
             int cantidad =x.nextInt();
             while ( cantidad < 1) {
                System.out.println("Cantidad incorrecta. Por favor, ingrese la cantidad deseada nuevamente.");
                cantidad=x.nextInt();
            }

            int total = 0;
            switch (postre) {
                case 1:
                    total = 5000 * cantidad;
                    break;
                case 2:
                    total = 3500 * cantidad;
                    break;
                case 3:
                    total = 2400 * cantidad;
                    break;
                case 4:
                    total = 3000 * cantidad;
                    break;
                case 5:
                    total = 8000 * cantidad;
                    break;
                case 6:
                    total = 1500 * cantidad;
                    break;
                case 7:
                    total = 1000 * cantidad;
                    break;
                default:
                    System.out.println("Ese número de postre no existe.");
            }

            totalFinal += total;
            System.out.println("¿Desea comprar más postres? (si/no)");
              answer=x.next();

            while (!answer.toLowerCase().equals("si") && !answer.toLowerCase().equals("no")) {
                System.out.println("Respuesta invalidad");
                System.out.println("¿Desea comprar más postres? (si/no)");
                answer=x.next();
            }
        }

        System.out.println("De acuerdo, gracias por tu compra. Tu cuenta es de "+totalFinal+'.');


    }

}

