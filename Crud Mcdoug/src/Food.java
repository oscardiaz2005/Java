public class Food {
    private String name;
    private double price;
    private double productionCost;
    private String category;
    private double utility;
    private int timesPurchased;
    private double profit;

    public Food(String name, double price, double productionCost, String category) {
        this.name = name;
        this.price = price;
        this.productionCost = productionCost;
        this.category = category;
        this.utility = this.price - this.productionCost;
        this.timesPurchased = 0;
        this.profit= this.timesPurchased*this.utility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getProductionCost() {
        return productionCost;
    }

    public void setProductionCost(double productionCost) {
        this.productionCost = productionCost;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getUtility() {
        return utility;
    }

    public int getTimesPurchased() {
        return timesPurchased;
    }

    public void setTimesPurchased(int timesPurchased) {
        this.timesPurchased = timesPurchased;
    }



    public double getProfit() {
        return timesPurchased * utility;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    @Override
    public String toString() {
        return
                " \uD83D\uDCA0 Name= " + name +
                "  |  Price= " + price +
                "  |  ProductionCost= " + productionCost +
                "  |  Category= " + category +
                "  |  Utility=" + utility +
                "  |  TimesPurchased=" + timesPurchased +
                "  |  Profit=" + profit +
                '}'+
                "\n";
    }
}

