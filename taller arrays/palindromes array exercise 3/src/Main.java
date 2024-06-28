import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("please enter a word or a sentence");
        String original = x.nextLine();
        original = original.replace(" ", "");
        String reverse = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }
        System.out.println(reverse);
        boolean palindrome=true;
        for (int i = 0 ;i<original.length();i++){
            if (original.charAt(i) != reverse.charAt(i)){
                palindrome=false;
            }


        }
        if (palindrome){
            System.out.println("It's a palindrome");
        }else {
            System.out.println("It's not a palindrome");
        }

}
    }
