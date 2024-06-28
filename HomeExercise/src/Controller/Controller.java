package Controller;

import Model.DataBaseHome;
import Model.Portatil;
import Model.Tv;
import View.ViewHome;

public class Controller {
    ViewHome viewHome = new ViewHome();
    DataBaseHome dataBaseHome= new DataBaseHome();
    private String key;

    public void control(){
        Boolean follow=true;
        while (follow){
            int option= viewHome.menu();
            switch (option){
                case 1:
                    viewHome.showMessage(dataBaseHome.showAll());
                    break;
                case 2:
                    key=viewHome.askForkey();
                    Tv tv = viewHome.askForTv();
                    viewHome.showMessage(dataBaseHome.addTv(key,tv));
                    break;
                case 3:
                    key=viewHome.askForkey();
                    Portatil portatil = viewHome.askForportatil();
                    viewHome.showMessage(dataBaseHome.addportatil(key,portatil));
                    break;
                case 4:
                    key= viewHome.askForkey();
                    Tv uTv=viewHome.askForTv();
                    viewHome.showMessage(dataBaseHome.updateTv(key,uTv));
                    break;
                case 5:
                    key= viewHome.askForkey();
                    Portatil upor=viewHome.askForportatil();
                    viewHome.showMessage(dataBaseHome.updatePortatil(key,upor));
                    break;
                case 6:
                    key= viewHome.askForkey();
                    viewHome.showMessage(dataBaseHome.deleteHome(key));
                    break;
                case 7:
                    viewHome.showMessage(dataBaseHome.increaseAll());
                    break;
                case 8:
                    viewHome.showMessage(dataBaseHome.increaseTv());
                    break;
                case 9:
                    viewHome.showMessage("leaving program------------------");
                    follow=false;

            }
        }


    }

}
