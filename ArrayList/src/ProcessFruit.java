import java.util.ArrayList;

public class ProcessFruit {
    private ArrayList<Fruit> list =new ArrayList<>();

    public ProcessFruit(){
        list.add(new Fruit(1,"orange","sweet",4000));
        list.add(new Fruit(2,"coconut","sweet",2000));
        list.add(new Fruit(3,"lemon","bitter",500));
        list.add(new Fruit(4,"orange","bitter",3000));
        list.add(new Fruit(5,"banana","sweet",1500));
    }

    public ArrayList<Fruit> getList() {
        return list;
    }
    public void showList(){
        for (Fruit f: this.list){
            System.out.println(list);
        }
    }

    public String addFruit(Fruit f){
        String message="";
        boolean valid=false;
        for (Fruit i :this.list){
            if(i.getCode()==f.getCode() || i.getName().equals(f.getName())) {
                valid=true;
                message="the code or name is already in the list";
                break;
            }
        }
        if (!valid){
            list.add(f);
            message= "the fruit was added successfully";
        }
        return message;
    }

    public String mactchFruit ( String searchedflavor){
        ArrayList<String> matchFruits=new ArrayList<>();
        String message="";
         for (Fruit i:this.list){
             if(i.getFlavor().equals(searchedflavor)){
                 matchFruits.add(i.getName());
                 message="match fruit"+matchFruits;
             }else {
                 message="the flavor has not been found";


             }


         }
        return message ;

    }
}
