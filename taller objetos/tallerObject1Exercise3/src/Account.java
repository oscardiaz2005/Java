public class Account {
    private String number;
    private String type;
    private double currentBalance;
    private double minimumBalance;
    private double creditCapacity;

    public Account (String number,String type,double initialBalance){
        this.number=number;
        this.type=type;
        this.currentBalance=initialBalance;
        this.minimumBalance=initialBalance * 0.1;
        this.creditCapacity=0;


    }
    public void consing (double amount){
        if(amount<=0){
            System.out.println("invalid amount" );
        }else {
            currentBalance+=amount;
            System.out.println("you have consigned $"+amount);
        }
    }


    public void withdraw(double amount){
        double verify=currentBalance-amount;
        if (amount<=0){
            System.out.println("invalid amount" );
        } else if(verify<minimumBalance){
            System.out.println("you cannot withdraw that amount because it's bigger than your minimum balance");
        }else {
            currentBalance-=amount;
            System.out.println("you have withdraw  $"+amount);
        }

    }

    public double getCurrentBalance() {
        System.out.println("your current balance is =" +currentBalance);
        return currentBalance;
    }

    public double getMinimumBalance() {
        System.out.println("your minimum balance is =" +minimumBalance);
        return minimumBalance;
    }

    public double getCreditCapacity(){
        String invalid="Invalid type";
        if (type.equals("saving")){
            double capacity=currentBalance-minimumBalance;
            System.out.println("your credit capacity due to your account is type " + type + " is " + capacity);
            return capacity;
        }
        else if (type.equals("credit")) {
            double capacity =currentBalance*3;
            System.out.println("your credit capacity due to your account is type " + type + " is " + capacity);
            return capacity;
        }
        else {
            return 0;
        }

    }


}
