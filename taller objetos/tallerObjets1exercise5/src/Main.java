import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = scanner.nextLine();

        System.out.println("Enter age:");
        int age = scanner.nextInt();

        System.out.println("Enter gender (H for male, M for female):");
        char gender = scanner.next().charAt(0);

        System.out.println("Enter weight (kg):");
        double weight = scanner.nextDouble();

        System.out.println("Enter height (cm):");
        double height = scanner.nextDouble() / 100;

        Person person1 = new Person(name, age, gender, weight, height);

        Person person2 = new Person(name, age, gender);

        Person person3 = new Person();
        person3.setName("Person 3");
        person3.setAge(30);
        person3.setGender('M');
        person3.setWeight(70);
        person3.setHeight(1.65);

        System.out.println("\nPerson 1:");
        showPersonInfo(person1);

        System.out.println("\nPerson 2:");
        showPersonInfo(person2);

        System.out.println("\nPerson 3:");
        showPersonInfo(person3);
    }

    public static void showPersonInfo(Person person) {
        System.out.println(person);
        int bmiResult = person.calculateBMI();
        switch (bmiResult) {
            case -1:
                System.out.println("Is below ideal weight.");
                break;
            case 0:
                System.out.println("Is at ideal weight.");
                break;
            case 1:
                System.out.println("Is overweight.");
                break;
            default:
                System.out.println("Could not calculate BMI.");
        }

        if (person.isAdult()) {
            System.out.println("Is an adult.");
        } else {
            System.out.println("Is not an adult.");
        }
    }
}
