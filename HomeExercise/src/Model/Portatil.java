package Model;

public class Portatil extends HomeAppliance {
    private String year;


    public Portatil (String name, String brand , int price,String year){
        super(name,brand,price);
        this.year=year;

    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nyear= " + year+
                "\n---------------------------";
    }
}
