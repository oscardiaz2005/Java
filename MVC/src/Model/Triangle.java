package Model;

public class Triangle {
    private int sideA ;
    private int sideB ;
    private int sideC ;
    private Float area ;
    private String type ;

    public Triangle(){}

    public Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public float getArea() {
        return area;
    }

    public String getType() {
        return type;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void TriangleType(Triangle triangle){
        if (triangle.getSideA()==triangle.getSideB() && triangle.getSideB()==triangle.getSideC()){
            triangle.setType("EQUILATERAL");
        } else if (triangle.getSideA()== triangle.getSideB() || triangle.getSideA()== triangle.getSideC() || triangle.getSideC()== triangle.getSideB() ) {
            triangle.setType("ISOSCELES");
        }else {
            triangle.setType("SCALENE");
        }

    }

    public void TriangleArea(int height){
        setArea ((float) (sideC*height/2));
    }

    @Override
    public String toString() {
        return "Triangle=" +
                "\nsideA=" + sideA +
                "\n sideB=" + sideB +
                "\n sideC=" + sideC +
                "\n area=" + area +
                "\n type='" + type + '\n'
                ;
    }
}

