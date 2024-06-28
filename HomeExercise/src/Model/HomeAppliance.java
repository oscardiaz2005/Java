package Model;

public class HomeAppliance {
    private String name;
    private String brand;
    private int price ;

    public HomeAppliance(String name, String brand, int price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "\nName= " + name +
                "\nbrand= " + brand +
                "\nprice= " + price
                ;
    }
}
