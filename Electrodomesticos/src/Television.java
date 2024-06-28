public class Television extends HomeAppliances{
    private int resolution;
    private Boolean TDT;

    public Television(){
        super();
        this.resolution=20;
        this.TDT=false;
    }

    public Television(int basePrice, float weight) {
        super(basePrice, weight);
        this.resolution = 20;
        this.TDT=false;

    }

    public Television(int basePrice, String color, char eConsumption, float weight, int resolution, Boolean TDT) {
        super(basePrice, color, eConsumption, weight);
        this.resolution = resolution;
        this.TDT = TDT;
    }

    //getters
    public int getResolution() {
        return resolution;
    }

    public Boolean getTDT() {
        return TDT;
    }

    @Override
    public int finalPrice() {
        int totalPrice=super.finalPrice();
        if (this.resolution>40){
            totalPrice*=1.3;
        }
        if (TDT){
            totalPrice+=50;
        }
        return totalPrice;
    }
}
