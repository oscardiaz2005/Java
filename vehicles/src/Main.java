import java.util.Scanner;
        /*

         */

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        vehicle myCar = new vehicle(); //instanciar una clase
        //myCar.brand="Checrolet";
        System.out.println(myCar.getBrand());
        myCar.setBrand("chevrolet");
        System.out.println(myCar.getBrand());



        vehicle juanCar = new vehicle("ford"); //constructor con argumento
        System.out.println( "juan's car = " + juanCar.brand);




        System.out.println("hello oscar what is your car license plate)");
        String oscarCarLicensePlate= x.next();

        System.out.println("hello oscar what is your car color)");
        String oscarCarColor= x.next();

        System.out.println("hello oscar what is your car brand)");
        String oscarCarBrand= x.next();



        vehicle oscarCar = new vehicle(oscarCarLicensePlate ,oscarCarColor,oscarCarBrand );


        System.out.println( "oscar's car license plate = " + oscarCar.licensePlate + " oscar's car color = " + oscarCar.color + " oscar's car brand = " + oscarCar.brand );

        oscarCar.accelerate();
        oscarCar.brake();

        System.out.println("your speed is " + oscarCar.speed);
        System.out.println( "your state is "+ oscarCar.state);


        oscarCar.start();
        System.out.println("your speed is " + oscarCar.speed);
        System.out.println( "your state is "+ oscarCar.state);

        oscarCar.start();


        //change the coloooooor
        String message= oscarCar.changeColor("red");
        System.out.println(message);

        //accelerate
        oscarCar.accelerate();
        oscarCar.accelerate();

        //brakee
        oscarCar.brake();

        oscarCar.accelerate();
        oscarCar.accelerate();
        //stooop
        oscarCar.stop();

        oscarCar.brake();
        oscarCar.brake();
        oscarCar.brake();

        oscarCar.stop();
        System.out.println("your state is " + oscarCar.state);

        oscarCar.accelerate();




    }
}