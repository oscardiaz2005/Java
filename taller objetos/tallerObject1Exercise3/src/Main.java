import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("enter the number of your account");
        String number=x.next();
        System.out.println("enter the type of your account (saving/credit)");
        String type=x.next();
        System.out.println("enter your initial balance");
        double initialBalance=x.nextDouble();
        Account newAccount = new Account(number,type,initialBalance);

        boolean start;
        start = true ;

        while (start){
            System.out.println("1. consing");
            System.out.println("2. withdraw");
            System.out.println("3. print current balance");
            System.out.println("4. print minimum balance");
            System.out.println("5. print credit capacity");
            System.out.println("6. exit");
            System.out.println("\nchoose an option");
            int option=x.nextInt();
            if (option==1){
                System.out.println("enter the amount that you want to consing ");
                double amount=x.nextDouble();
                newAccount.consing(amount);
            } else if (option==2) {
                System.out.println("enter the amount that you want to withdraw ");
                double amount=x.nextDouble();
                newAccount.withdraw(amount);
            } else if (option==3) {
                newAccount.getCurrentBalance();
            } else if (option==4) {
            newAccount.getCurrentBalance();
            } else if (option==5) {
                newAccount.getCreditCapacity();
            } else if (option==6) {
                break;
            }
        }


    }
}