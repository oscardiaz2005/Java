public class vehicle {

    public int model;
    public String brand;
    public float displacement;
    public String licensePlate;
    public String color;
    public String state;
    public int speed;


    public vehicle(){
         this.speed=0;
         this.state="stopped";
    }

    public vehicle(String brand){
        this.brand=brand;
        this.speed=0;
        this.state="stopped";
    }
    public vehicle(String licensePlate, String color, String brand ){
        this.brand=brand;
        this.licensePlate=licensePlate;
        this.color=color;
        this.speed=0;
        this.state="stopped";
    }

    //staaart the vehicle
    public void start(){
         if(this.state.equals("stopped")){
             System.out.println(" you have started the car the  vehicle is moving ..........");
             this.state="moving";
             this.speed=10;

         }else {
             System.out.println(" you cannot start again the vehicle is already moving");
         }
    }

    //change the colooor
    public String changeColor(String color){
         this.color=color;
         String message= "color changed into " + this.color;
         return message;

    }

    //accelerateeeee
    public int accelerate(){
        if (this.state.equals("moving") && this.speed<120) {
            this.speed+=10;
            System.out.println(" you have accelerated , your speed is " + this.speed);

        }
        else{
            System.out.println("you cannot accelerate ,your car is stopped or your speed is bigger than 120km");
        }
        return this.speed;

    }
    //brakeee
    public void brake(){
        if (this.state.equals("moving") && this.speed>0) {
            this.speed-=10;
            System.out.println("you have braked , your speed is " + this.speed);

        }
        else {
            System.out.println("you cannot brake, your car is stopped or your speed is less than 0");
        }
    }

    //stoooop
    public void stop(){
        if (this.state.equals("moving") && this.speed>0 && this.speed<20) {
            this.speed=0;
            System.out.println("you have stopped the car");
            this.state="stopped";

        }
        else {
            System.out.println("you cannot stop the car due to your speed is bigger than 20");
        }


    }

    //clasee del jueves
    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getBrand() {
        return "my brand is = "+ brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }
}
