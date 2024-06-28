import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Please enter how many passwords you want to generate:");
        int amount = x.nextInt();
        while (amount <= 0) {
            System.out.println("Invalid amount.");
            System.out.println("Please enter a valid amount:");
            amount = x.nextInt();
        }
        System.out.println("Please enter how many characters you want in each password:");
        int characters = x.nextInt();
        while (characters < 8) {
            System.out.println("Invalid amount.");
            System.out.println("Please enter a valid amount:");
            characters = x.nextInt();
        }

        String[] passwords = new String[amount];
        boolean[] isStrong = new boolean[amount];

        for (int i = 0; i < amount; i++) {
            String password = "";

            for (int j = 0; j < characters; j++) {
                char randomletter = makeletter();
                password += randomletter;
            }

            passwords[i] = password;
            isStrong[i] = isStrongPassword(password);
        }

        System.out.println("Passwords:");

        for (int i = 0; i < amount; i++) {
            String strength = isStrong[i] ? "Strong" : "Weak";
            System.out.println("Password " + (i + 1) + ": " + passwords[i] + " (" + strength + ")");
        }
    }

    public static char makeletter() {
        String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        int randomIndex = (int) (Math.random() * letters.length());
        return letters.charAt(randomIndex);
    }

    public static boolean isStrongPassword(String password) {
        int mayuscules = 0;
        int miniscules = 0;
        int number = 0;

        for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);
            if (letter >= 'A' && letter <= 'Z') {
                mayuscules++;
            } else if (letter >= 'a' && letter <= 'z') {
                miniscules++;
            } else if (letter >= '0' && letter <= '9') {
                number++;
            }
        }

        return mayuscules >= 3 && miniscules >= 2 && number >= 6;
    }
}
