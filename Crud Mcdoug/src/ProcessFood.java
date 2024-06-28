import java.util.ArrayList;

public class ProcessFood {
    private ArrayList<Food> catalogue = new ArrayList<>();
    public ProcessFood(){
        catalogue.add(new Food("cuarto de libra",10200,5000,"burger"));
        catalogue.add(new Food("coca-cola",2000,500,"drink"));
        catalogue.add(new Food("chocolate cake",5000,1500,"dessert"));
        catalogue.add(new Food("mexicana",4000,1500,"pizza"));
    }



    //getter
    public ArrayList<Food> getCatalogue() {
        return catalogue;
    }

    //show all catalogue
    public void showCatalogue(){
        System.out.println(getCatalogue());
    }

    //show category
    public String showCategory( String searchedFood){
        ArrayList<String> matchFood = new ArrayList<>();
        String message = "The category has not been found";
        for (Food f : this.catalogue) {
            if (f.getCategory().equals(searchedFood)) {
                matchFood.add(f.getName());
                message = "Matched food in " + searchedFood +" category "+ matchFood;
            }
        }
        return message;
    }

    //add a product
    public String addFood( Food newProduct){
        String message="";
        boolean valid=false;
        for (Food i :this.catalogue){
            if( i.getName().equals(newProduct.getName())) {
                valid=true;
                message="this food is already in the catalogue";
                break;
            }
        }
        if (!valid){
            catalogue.add(newProduct);
            message= "the food " + newProduct.getName() + " was added successfully";
        }
        return message;
    }

    //edit a product
    public String edidFood( String name ,Food productChanged){
         String message="";
         Boolean found=false;
         for (int i =0; i< catalogue.size();i++){
             if(catalogue.get(i).getName().equals(name)){
                  catalogue.set(i,new Food(productChanged.getName(),productChanged.getPrice(),productChanged.getProductionCost(),productChanged.getCategory()));
                  message="the food "+name+ " was changed successfully";
                  found=true;
                  break;
         }
    }
        if (!found){
            message="the product has not been found";
        }
        return message;
    }

    //delete a product
    public String deleteFood(String name){
        String message="";
        Boolean found=false;
        for (int i =0;i< catalogue.size();i++){
            if(catalogue.get(i).getName().equals(name)){
                catalogue.remove(i);
                message="the food "+ name +" was deleted successfully";
                found=true;
                break;
            }
        }
        if (!found){
            message="the product has not been found";
        }
        return message;
    }

    //show utility of a product
    public String showUtilityProduct( String searchedProduct){
        String message="the product has not been found";
        for ( int i=0;i<catalogue.size();i++){
            if(catalogue.get(i).getName().equals(searchedProduct)){
                message="the utility of "+searchedProduct+" is "+ catalogue.get(i).getUtility();
                break;
            }

        }
        return message;
    }

    //show utility of a category
    public String showUtilityCategory( String searchedCategory){
         double totalUtility=0;
         String message="the category has not been found";
         for (int i =0;i<catalogue.size();i++){
             if(catalogue.get(i).getCategory().equals(searchedCategory)){
                 totalUtility+=catalogue.get(i).getUtility();
                 message="the total utility of "+searchedCategory+" category is "+totalUtility;
             }
         }
         return message;
    }

    //show total utility
    public void showTotalUtility(){
        double totalUtility=0;
        for (int i =0;i< catalogue.size();i++){
            totalUtility+=catalogue.get(i).getUtility();
        }
        System.out.println("the utility of the whole catalogue is " + totalUtility);
    }

    //show most expensive food
    public void showMostExpensiveFood() {
        ArrayList<String> matchFood = new ArrayList<>();
        double expensiveFood = catalogue.get(0).getPrice();
        for (int i = 0; i < catalogue.size(); i++) {
            if (catalogue.get(i).getPrice() > expensiveFood) {
                expensiveFood = catalogue.get(i).getPrice();
            }
        }
        for (int i = 0; i < catalogue.size(); i++) {
            if (catalogue.get(i).getPrice() == expensiveFood) {
                matchFood.add(catalogue.get(i).getName());
            }
        }
        if (matchFood.size() > 0) {
            if (matchFood.size() == 1) {
                System.out.println("The most expensive food is " + matchFood.get(0)+ " with a cost of " + expensiveFood );
            } else {
                System.out.println("The most expensive foods are " + matchFood + " with a cost of " + expensiveFood) ;
            }
        }
    }

    //show most purchased food
    public void showMostPurchasedFood() {
        ArrayList<String> matchFood = new ArrayList<>();
        double purchasedFood = catalogue.get(0).getTimesPurchased();
        for (int i = 0; i < catalogue.size(); i++) {
            if (catalogue.get(i).getTimesPurchased() > purchasedFood) {
                purchasedFood= catalogue.get(i).getTimesPurchased();
            }
        }
        for (int i = 0; i < catalogue.size(); i++) {
            if (catalogue.get(i).getTimesPurchased() == purchasedFood) {
                matchFood.add(catalogue.get(i).getName());
            }
        }
        if (matchFood.size() > 0) {
            if (matchFood.size() == 1) {
                System.out.println("The most purchased food is " + matchFood.get(0)+ " with " + purchasedFood +" times purchased" );
            } else {
                System.out.println("The most purchased foods are " + matchFood + " with " + purchasedFood + " times purchased") ;
            }
        }
    }

    //show most useful food
    public void showMostUsefulFood(){
        ArrayList<String> matchFood = new ArrayList<>();
        double usefulFood = catalogue.get(0).getUtility();
        for (int i = 0; i < catalogue.size(); i++) {
            if (catalogue.get(i).getUtility() > usefulFood) {
                usefulFood= catalogue.get(i).getUtility();
            }
        }
        for (int i = 0; i < catalogue.size(); i++) {
            if (catalogue.get(i).getUtility() == usefulFood) {
                matchFood.add(catalogue.get(i).getName());
            }
        }
        if (matchFood.size() > 0) {
            if (matchFood.size() == 1) {
                System.out.println("The most useful food is " + matchFood.get(0) + " with a utility of " + usefulFood);
            } else {
                System.out.println("The most useful foods are " + matchFood + " with a utility of " + usefulFood );
            }
        }
    }

    //show most profit food
    public void showMostProfitFood(){
        ArrayList<String> matchFood = new ArrayList<>();
        double profitFood = catalogue.get(0).getProfit();
        for (int i = 0; i < catalogue.size(); i++) {
            if (catalogue.get(i).getProfit() > profitFood) {
                profitFood= catalogue.get(i).getProfit();
            }
        }
        for (int i = 0; i < catalogue.size(); i++) {
            if (catalogue.get(i).getProfit() == profitFood) {
                matchFood.add(catalogue.get(i).getName());
            }
        }
        if (matchFood.size() > 0) {
            if (matchFood.size() == 1) {
                System.out.println("The food with  the most profits is " + matchFood.get(0) + " with a profit of " + profitFood);
            } else {
                System.out.println("The food with the most profits  are " + matchFood + " with a profits of " + profitFood );
            }
        }
    }





    // show most expensive category
    public void showMostExpensiveCategory() {
        // Add all categories to an ArrayList
        ArrayList<String> categories = new ArrayList<>();
        for (Food food : catalogue) {
            if (!categories.contains(food.getCategory())) {
                categories.add(food.getCategory());
            }
        }

        // Calculate the total price for each category
        ArrayList<Double> prices = new ArrayList<>();
        for (String category : categories) {
            double totalPrice = 0;
            for (Food food : catalogue) {
                if (food.getCategory().equals(category)) {
                    totalPrice += food.getPrice();
                }
            }
            prices.add(totalPrice);
        }

        // Find the maximum price
        double maxPrice = prices.get(0);
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }

        // Find the index of the maximum price
        ArrayList<Integer> maxPriceIndices = new ArrayList<>();
        for (int i = 0; i < prices.size(); i++) {
            if (prices.get(i) == maxPrice) {
                maxPriceIndices.add(i);
            }
        }

        // Print the result
        if (maxPriceIndices.size() == 1) {
            System.out.println("The most expensive category is " + categories.get(maxPriceIndices.get(0)) + " with a cost of " + maxPrice);
        } else {
            System.out.print("The most expensive categories are ");
            for (int i = 0; i < maxPriceIndices.size(); i++) {
                System.out.print(categories.get(maxPriceIndices.get(i)));
                if (i < maxPriceIndices.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" with a cost of " + maxPrice);
        }
    }

    // show most purchased category
    public void showMostPurchasedCategory() {
        // Add all categories to an ArrayList
        ArrayList<String> categories = new ArrayList<>();
        for (Food food : catalogue) {
            if (!categories.contains(food.getCategory())) {
                categories.add(food.getCategory());
            }
        }

        // Calculate the total purchases for each category
        ArrayList<Double> purchases = new ArrayList<>();
        for (String category : categories) {
            double totalPurchases = 0;
            for (Food food : catalogue) {
                if (food.getCategory().equals(category)) {
                    totalPurchases += food.getTimesPurchased();
                }
            }
            purchases.add(totalPurchases);
        }

        // Find the maximum purchase
        double maxPurchased = purchases.get(0);
        for (double purchase : purchases) {
            if (purchase > maxPurchased) {
                maxPurchased = purchase;
            }
        }

        // Find the index of the maximum purchase
        ArrayList<Integer> maxPurchasesIndices = new ArrayList<>();
        for (int i = 0; i < purchases.size(); i++) {
            if (purchases.get(i) == maxPurchased) {
                maxPurchasesIndices.add(i);
            }
        }

        // Print the result
        if (maxPurchasesIndices.size() == 1) {
            System.out.println("The most purchased category is " + categories.get(maxPurchasesIndices.get(0)) + " with " + maxPurchased + " times purchased ");
        } else {
            System.out.print("The most purchased categories are ");
            for (int i = 0; i < maxPurchasesIndices.size(); i++) {
                System.out.print(categories.get(maxPurchasesIndices.get(i)));
                if (i < maxPurchasesIndices.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" with  " + maxPurchased + " times purchased");
        }
    }

    // show most useful category
    public void showMostUsefulCategory() {
        // Add all categories to an ArrayList
        ArrayList<String> categories = new ArrayList<>();
        for (Food food : catalogue) {
            if (!categories.contains(food.getCategory())) {
                categories.add(food.getCategory());
            }
        }

        // Calculate the total utility for each category
        ArrayList<Double> utilities = new ArrayList<>();
        for (String category : categories) {
            double totalUtility = 0;
            for (Food food : catalogue) {
                if (food.getCategory().equals(category)) {
                    totalUtility += food.getUtility();
                }
            }
            utilities.add(totalUtility);
        }

        // Find the maximum utility
        double maxUtility = utilities.get(0);
        for (double utility : utilities) {
            if (utility > maxUtility) {
                maxUtility = utility;
            }
        }

        // Find the index of the maximum utility
        ArrayList<Integer> maxUtilityIndices = new ArrayList<>();
        for (int i = 0; i < utilities.size(); i++) {
            if (utilities.get(i) == maxUtility) {
                maxUtilityIndices.add(i);
            }
        }

        // Print the result
        if (maxUtilityIndices.size() == 1) {
            System.out.println("The most useful category is " + categories.get(maxUtilityIndices.get(0)) + " with a utility of " + maxUtility);
        } else {
            System.out.print("The most useful categories are ");
            for (int i = 0; i < maxUtilityIndices.size(); i++) {
                System.out.print(categories.get(maxUtilityIndices.get(i)));
                if (i < maxUtilityIndices.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" with a utility of " + maxUtility);
        }
    }

    // show most profit category
    public void showMostProfitableCategory() {
        // Add all categories to an ArrayList
        ArrayList<String> categories = new ArrayList<>();
        for (Food food : catalogue) {
            if (!categories.contains(food.getCategory())) {
                categories.add(food.getCategory());
            }
        }

        // Calculate the total profit for each category
        ArrayList<Double> profits = new ArrayList<>();
        for (String category : categories) {
            double totalProfit = 0;
            for (Food food : catalogue) {
                if (food.getCategory().equals(category)) {
                    totalProfit += food.getProfit();
                }
            }
            profits.add(totalProfit);
        }

        // Find the maximum profit
        double maxProfit = profits.get(0);
        for (double profit : profits) {
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        // Find the index of the maximum profit
        ArrayList<Integer> maxProfitIndices = new ArrayList<>();
        for (int i = 0; i < profits.size(); i++) {
            if (profits.get(i) == maxProfit) {
                maxProfitIndices.add(i);
            }
        }

        // Print the result
        if (maxProfitIndices.size() == 1) {
            System.out.println("The most profitable category is " + categories.get(maxProfitIndices.get(0)) + " with a profit of " + maxProfit);
        } else {
            System.out.print("The most profitable categories are ");
            for (int i = 0; i < maxProfitIndices.size(); i++) {
                System.out.print(categories.get(maxProfitIndices.get(i)));
                if (i < maxProfitIndices.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(" with a profit of " + maxProfit);
        }
    }

    //show total profit
    public String totalProfit(){
        double totalProfit=0;
        for (Food food:catalogue){
            totalProfit+=food.getTimesPurchased()*food.getUtility();
        }
        return "the total of profit is " + totalProfit;
    }

    //show profit of category
    public String showProfitCategory( String searchedCategory){
        double totalProfit=0;
        String message="the category has not been found";
        for (int i =0;i<catalogue.size();i++){
            if(catalogue.get(i).getCategory().equals(searchedCategory)){
                totalProfit+=catalogue.get(i).getProfit();
                message="the total profit of "+searchedCategory+" category is "+totalProfit;
            }
        }
        return message;

    }

    //show profit of food
    public String showProfitProduct( String searchedProduct){
        String message="the product has not been found";
        for ( int i=0;i<catalogue.size();i++){
            if(catalogue.get(i).getName().equals(searchedProduct)){
                message="the profit of "+searchedProduct+" is "+ catalogue.get(i).getProfit();
                break;
            }

        }
        return message;
    }




    //CURTOMEEEER

    public double purchase(String productName, int quantity) {
        double totalCost = 0;
        boolean productoEncontrado = false;

        for (Food food : catalogue) {
            if (food.getName().equals(productName)) {
                food.setTimesPurchased(food.getTimesPurchased() + quantity);

                totalCost = food.getPrice() * quantity;
                System.out.println("Purchase done: " + quantity + " " + productName + " por $" + totalCost);

                productoEncontrado = true;

                break;
            }
        }

        if (!productoEncontrado) {
            System.out.println("the food '" + productName + "' is not in the catalogue.");
        }

        return totalCost;
    }

    public void showMenu() {
        System.out.println("NAME\t\t\t\t COST\t\tCATEGORY");
        for (int i = 0; i < catalogue.size(); i++) {
            String name = catalogue.get(i).getName();
            double price = catalogue.get(i).getPrice();
            String category = catalogue.get(i).getCategory();
            // Utilizar String.format para alinear correctamente los campos
            System.out.println(String.format("%-20s %-10.2f %-20s", name, price, category));
        }
    }
}

