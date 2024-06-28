package Controller;
import Model.*;
import View.ViewTriangle;

public class TriangleController {
    Triangle triangle=new Triangle();
    BaseDataTriangle baseDataTriangle= new BaseDataTriangle();
    ViewTriangle viewTriangle = new ViewTriangle();

    public void Controller(){
        boolean follow=true;
        while (follow){
            int option=viewTriangle.menu();

            switch (option){
                case 1 :
                    int sideA = viewTriangle.requestSide();
                    int sideB = viewTriangle.requestSide();
                    int sideC = viewTriangle.requestSide();
                    int height = viewTriangle.requestHeight();
                    triangle=new Triangle(sideA,sideB,sideC);
                    baseDataTriangle.addTriangle(triangle,height);
                    break;
                case 2 :
                    baseDataTriangle.getAll();
                    break;
                case 3:
                    String searchType=viewTriangle.ConsultType();
                    baseDataTriangle.searchType(searchType);
                    break;
                case 4:
                    follow=false;
                    break;
            }

        }


    }


}