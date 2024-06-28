public class HomeAppliances {
    private int basePrice;
    private String color;
    private char eConsumption;
    private float weight;

    public HomeAppliances() {
        this.basePrice = 100;
        this.color = "white";
        this.eConsumption ='F';
        this.weight = 5;
    }

    public HomeAppliances(int basePrice, float weight) {
        this.basePrice = basePrice;
        this.weight = weight;
        this.color="white";
        this.eConsumption='F';
    }

    public HomeAppliances(int basePrice, String color, char eConsumption, float weight) {
        this.basePrice = basePrice;
        this.color = color;
        this.eConsumption = verifyEConsumption(eConsumption);
        this.weight = weight;
    }


    public int getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public char geteConsumption() {
        return eConsumption;
    }

    public float getWeight() {
        return weight;
    }


    public char verifyEConsumption(char eConsumption){
        char validConsumption=Character.toUpperCase(eConsumption);
        if (validConsumption>='A' && validConsumption<='F'){
            return validConsumption;
        }
        else {
            return 'F';
        }
    }
    public String verifyColor(String color){
        String validColor=color.toLowerCase();
        if (validColor.equals("white" ) || validColor.equals("black") || validColor.equals("red") || validColor.equals("blue")|| validColor.equals("grey")){
            return validColor;
        }
        else {
            return "white";
        }
    }

    public  int finalPrice(){
        int finalPrice=this.basePrice;

        if(this.eConsumption=='A'){
            finalPrice+=100;
        }
        else if (this.eConsumption=='B'){
            finalPrice+=80;
        }
        else if (this.eConsumption=='C'){
            finalPrice+=60;
        }
        else if (this.eConsumption=='D'){
            finalPrice+=50;
        }
        else if (this.eConsumption=='E'){
            finalPrice+=20;
        }
        else if (this.eConsumption=='F'){
            finalPrice+=10;
        }


        if (this.weight>=0 && this.weight<=19){
            finalPrice+=10;
        }
        else if (this.weight>=20 && this.weight<=49){
            finalPrice+=50;
        }
         else if (this.weight>=50 && this.weight<=79){
            finalPrice+=80;
        }
         else if (this.weight>=80){
            finalPrice+=100;
        }
        return finalPrice;
    }


}
