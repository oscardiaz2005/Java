package Model;

import java.util.ArrayList;

public class BaseDataTriangle {
    public ArrayList<Triangle>BaseData=new ArrayList<>();

    public BaseDataTriangle(){
        BaseData.add(new Triangle(1,1,1));
        BaseData.add(new Triangle(1,1,2));
        BaseData.add(new Triangle(3,1,2));

        for (Triangle triangle : BaseData){
            triangle.TriangleType(triangle);
            triangle.TriangleArea(10);
        }
    }

    public void getAll(){
        System.out.println(BaseData);
    }

    public void addTriangle( Triangle triangle,int height){
        BaseData.add(triangle);
        System.out.println("The triangle was added successfully");
        triangle.TriangleType(triangle);
        triangle.TriangleArea(height);
    }

    public String searchType(String sType){
        String AllTypes="";
        for (Triangle triangle : BaseData){
            if( triangle.getType().equals(sType)){
                AllTypes+=triangle;
            }
        }
        System.out.println(AllTypes);
        return AllTypes;

    }

    @Override
    public String toString() {
        return " the Base Data of Triangles is " +
                "\nBase Data=" + BaseData
                ;
    }
}
