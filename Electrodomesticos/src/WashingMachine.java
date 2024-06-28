public class  WashingMachine extends HomeAppliances {
    private int charge;

    public WashingMachine(){
        super();
        this.charge=5;
    }

    public WashingMachine(int basePrice, float weight) {
        super(basePrice, weight);
        this.charge = 5;
    }
    public  WashingMachine(int charge, int basePrice,String color , char eConsumption,float weight){
        super(basePrice, color, eConsumption,weight);
        this.charge=charge;
    }

    //getter
    public int getCharge() {
        return charge;
    }

    @Override
    public int finalPrice() {
        int totalPrice=super.finalPrice();

        if (this.charge>30){
            totalPrice+=50;
        }

        return totalPrice;
    }
}
