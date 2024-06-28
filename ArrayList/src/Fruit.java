public class Fruit {
    private  int code;
    private String name;
    private String flavor;
    private int cost;

    public Fruit (){

    }

    public Fruit(int code, String name, String flavor, int cost) {
        this.code = code;
        this.name = name;
        this.flavor = flavor;
        this.cost = cost;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "\ncode = " + code+
                "\nname = " + name +
                "\nflavor =" + flavor +
                "\ncost =" + cost
                ;
    }
}
