import java.util.Random;

public class Person {
    private String name;
    private int age;
    private String IDNumber;
    private char gender;
    private double weight;
    private double height;

    public static char DEFAULT_GENDER = 'H';
    public static int BMI_UNDERWEIGHT = -1;
    public static int BMI_NORMAL = 0;
    public static int BMI_OVERWEIGHT = 1;

    // Default constructor
    public Person() {
        this("", 0, DEFAULT_GENDER, 0, 0);
    }

    public Person(String name, int age, char gender) {
        this(name, age, gender, 0, 0);
    }

    public Person(String name, int age, char gender, double weight, double height) {
        this.name = name;
        this.age = age;
        this.gender = checkGender(gender);
        this.weight = weight;
        this.height = height;
        this.IDNumber = generateIDNumber();
    }

    private char checkGender(char gender) {
        return (gender == 'H' || gender == 'M') ? gender : DEFAULT_GENDER;
    }

    public int calculateBMI() {
        double bmi = weight / (height * height);
        if (bmi < 20) {
            return BMI_UNDERWEIGHT;
        } else if (bmi >= 20 && bmi <= 25) {
            return BMI_NORMAL;
        } else {
            return BMI_OVERWEIGHT;
        }
    }

    public boolean isAdult() {
        return age >= 18;
    }

    private String generateIDNumber() {
        StringBuilder id = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < 8; i++) {
            id.append(rnd.nextInt(10));
        }
        // Calculate the letter of the ID
        String letters = "TRWAGMYFPDXBNJZSQVHLCKE";
        int sum = 0;
        for (int i = 0; i < id.length(); i++) {
            sum += id.charAt(i) - '0';
        }
        int remainder = sum % 23;
        return id.toString() + letters.charAt(remainder);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = checkGender(gender);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person Information:\n" +
                "Name: " + name +
                "\nAge: " + age +
                "\nID Number: " + IDNumber +
                "\nGender: " + gender +
                "\nWeight: " + weight +
                "\nHeight: " + height;
    }
}
