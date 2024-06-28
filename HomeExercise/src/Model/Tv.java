package Model;

public class Tv extends HomeAppliance {
    private String color;


    public Tv(String name, String brand , int price,String color) {
        super(name, brand ,price);
        this.color=color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncolor= " + color+
                "\n---------------------------"
                ;
    }
}
