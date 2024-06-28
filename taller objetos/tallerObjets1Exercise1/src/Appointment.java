public class Appointment {

    private int number;
    private int type;
    private double rate;
    private double finalValue;

    //builder
    public Appointment(int number, int type, double rate) {
        this.number = number;
        this.type = type;
        this.rate = rate;
    }

    public int getNumber() {
        return number;
    }

    public String getType() {


         String message="";
        if (type== 1 || type==2 || type==3){
            message= "General";
        }
        else if (type== 4 || type==5){
            message= "Specialist";
        }
        return message;
    }

    public double getRate() {
        return rate;
    }

    public double calculateValueFinal(){
        if (getType().equals("Specialist")){
            double value =getRate()*0.5;
            finalValue= value+getRate();
            return finalValue;
        }
        else {
            double value =getRate()*0.5;
            finalValue=getRate()-value;
            return finalValue;
        }
    }
}


