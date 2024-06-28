import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the length of the passwords");
        int length=scanner.nextInt();

        System.out.println("Enter how many passwords you want to generate");
        int arraySize=scanner.nextInt();
        Password [] passwords =new Password[arraySize];
        boolean [] isStrongArray =new boolean[arraySize];

        for (int i=0;i<arraySize;i++){
            passwords[i]=new Password(length);
            isStrongArray[i]=passwords[i].itsStrong();
        }
        for (int i =0;i<arraySize;i++){
            System.out.println(passwords[i].getPassword());
            if(isStrongArray[i]){
                System.out.println("strong");
            }else {
                System.out.println("week");
            }
        }

    }
}