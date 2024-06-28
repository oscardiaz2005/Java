package Model;

public class Product {
    private String name;
    private int price;
    private int stock;
    private int subTotal;
    private double subTotalIva;

    public Product( String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.subTotal=this.price*this.stock;
        this.subTotalIva=this.subTotal*1.19;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public double getSubTotalIva() {
        return subTotalIva;
    }

    @Override
    public String toString() {
        return
                "\nName = " + name +
                "\nPrice = " + price +
                "\nStock = " + stock +
                "\nSubtotal = "+ subTotal+
                "\nSubtotal Iva= " + subTotalIva+
                "\n-------------------------"
                ;
    }
}
