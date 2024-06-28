import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x =new Scanner(System.in);
        System.out.println("enter the appointment's number ");
        int appointmentNumber =x.nextInt();
        System.out.println("enter the appointment's type (1 to 5) ");
        int appointmentType= x.nextInt();
        while (appointmentType<0 || appointmentType>5){
            System.out.println("invalid type");
            System.out.println("enter a valid  appointment's type (1 to 5) ");
            appointmentType= x.nextInt();
        }
        System.out.println("enter the appointment rate");
        int appointmentRate=x.nextInt();

        Appointment newAppointment = new Appointment(appointmentNumber,appointmentType,appointmentRate);

        System.out.println("the appointment's number is " + newAppointment.getNumber());
        System.out.println("the appointment's type is " + newAppointment.getType());
        System.out.println("the normally rate is " + newAppointment.getRate());
        System.out.println("but the type is "+newAppointment.getType() + "the final value is = "+ newAppointment.calculateValueFinal());







    }
}