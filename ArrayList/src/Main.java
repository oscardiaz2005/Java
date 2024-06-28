import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
         /*
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("passionFruit");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("grape");
        System.out.println(fruits);
        System.out.println(fruits.get(2));//ger objet by position
        System.out.println("size = " + fruits.size()); //size
        for ( int i = 0; i<fruits.size();i++){
            System.out.println(fruits.get(i));
        }
        for (String f :fruits ){ //for each
            System.out.println(f);
        }
        fruits.set(1,"coconut");//change value
        System.out.println(fruits);

         Boolean verify=fruits.contains("banana");//verify if the object is in the list
        if (verify){
            System.out.println("exist");
        }else {
            System.out.println("don't exist");
        }
        fruits.remove(0); // deleteee

        int index=fruits.indexOf("orange");//search index of object//return -1 if the object is not in the list
        fruits.remove(index);
        System.out.println(fruits);
        fruits.clear();//empty the list
     */
        ProcessFruit gestion = new ProcessFruit();
        System.out.println(gestion.getList());
        System.out.println(gestion.getList().get(2));
        System.out.println(gestion.getList().get(2).getName());

        gestion.showList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the code");
        int code=scanner.nextInt();
        System.out.println("enter the name");
        String name=scanner.next();
        System.out.println("enter the flavor");
        String flavor=scanner.next();
        System.out.println("enter the cost");
        int cost=scanner.nextInt();

        Fruit newFruit=new Fruit(code,name,flavor,cost);
        System.out.println(gestion.addFruit(newFruit));
        gestion.showList();

        System.out.println("enter the searched flavor");
        String searchedFlavor=scanner.next();
        System.out.println(gestion.mactchFruit(searchedFlavor));


    }
}
