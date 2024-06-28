import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        ProcessFood management = new ProcessFood();
        boolean programContinue=true;
        while (programContinue){
            System.out.println("\n---- MAIN MENU ----");
            System.out.println("Welcome to MacDoug restaurant \nplease choose your role");
            System.out.println("1.Manager \t2.Customer \t3.Exit");
            System.out.println("Enter you option");
            int option = scanner.nextInt();
            scanner.nextLine();
            while (option<1 || option>3){
                System.out.println("INVALID OPTION  \n1.Manager \t2.Customer \t3.Exit");
                System.out.println("Enter you option");
                option=scanner.nextInt();
                scanner.nextLine();
            }
            if(option==1){
                boolean managerMenu=true;
                while (managerMenu){
                    System.out.println("\n---- MANAGER MENU ----");
                    System.out.println("OPTIONS ");
                    System.out.println("1. Show Catalogue");
                    System.out.println("2. Show food from a category");
                    System.out.println("3. Add food");
                    System.out.println("4. edit food");
                    System.out.println("5. delete food");
                    System.out.println("6. utility menu");
                    System.out.println("7. Food menu");
                    System.out.println("8. category menu");
                    System.out.println("9. profits menu");
                    System.out.println("10. Back to main menu");
                    System.out.println("Enter you option");
                    int managerOption=scanner.nextInt();
                    scanner.nextLine();

                    if (managerOption==1){
                        System.out.println("----\tCATALOGUE\t ----");
                        management.showCatalogue();
                    }

                    else if (managerOption==2) {
                        System.out.println("Please enter the name of the category from which you want to see the food ");
                        String name = scanner.nextLine();
                        scanner.nextLine();
                        System.out.println(management.showCategory(name));
                    }

                    else if (managerOption==3) {
                        System.out.println("Please enter the name, the cost, the production cost, and the category of the new food, in that order");
                        String name = scanner.nextLine();
                        double cost = scanner.nextDouble();
                        double productionCost = scanner.nextDouble();
                        scanner.nextLine();
                        String category = scanner.nextLine();
                        Food newfood = new Food(name,cost,productionCost,category);
                        System.out.println(management.addFood(newfood));
                    }

                    else if (managerOption==4) {
                        System.out.println("please enter the name of the product you want to change");
                        String foundFood=scanner.nextLine();
                        System.out.println("Please enter the new name, the new cost, the new production cost, and the new category of the  food, in that order");
                        String name = scanner.nextLine();
                        double cost = scanner.nextDouble();
                        double productionCost = scanner.nextDouble();
                        scanner.nextLine();
                        String category = scanner.nextLine();
                        Food changedfood = new Food(name,cost,productionCost,category);
                        System.out.println(management.edidFood(foundFood,changedfood));
                    }

                    else if (managerOption==5) {
                        System.out.println("please enter the name of the product you want to delete");
                        String findFood=scanner.nextLine();
                        System.out.println(management.deleteFood(findFood));
                    }

                    else if (managerOption==6) {
                        boolean utilityMenu=true;
                        while (utilityMenu){
                            System.out.println("--- UTILITY MENU ---");
                            System.out.println("OPTIONS");
                            System.out.println("1. show utility of a food");
                            System.out.println("2. show utility of a category");
                            System.out.println("3. show total utility");
                            System.out.println("4. back to manager menu");
                            System.out.println("Enter your option");
                            int utilityOption=scanner.nextInt();
                            scanner.nextLine();
                            if (utilityOption==1){
                                System.out.println("please enter the name of the food you want to see the utility");
                                String findFood=scanner.nextLine();
                                System.out.println(management.showUtilityProduct(findFood));
                            }

                            else if (utilityOption==2) {
                                System.out.println("please enter the name of the category you want to see the utility");
                                String findCategory=scanner.nextLine();
                                System.out.println(management.showUtilityCategory(findCategory));
                            }

                            else if (utilityOption==3) {
                                management.showTotalUtility();
                            }

                            else if (utilityOption==4){
                                break;
                            }
                            else {
                                System.out.println("INVALID OPTION");
                            }
                        }
                    }
                    else if (managerOption==7) {
                        boolean foodMenu=true;
                        while (foodMenu){
                            System.out.println("--- FOOD MENU ---");
                            System.out.println("OPTIONS");
                            System.out.println("1. show most expensive food");
                            System.out.println("2. show most purchased food");
                            System.out.println("3. show food with the most utility");
                            System.out.println("4. show food with the most profit");
                            System.out.println("5. back to manager menu");
                            System.out.println("Enter your option");
                            int foodOption= scanner.nextInt();
                            scanner.nextLine();
                            if (foodOption==1){
                                management.showMostExpensiveFood();
                            }
                            else if (foodOption==2){
                                management.showMostPurchasedFood();
                            }
                            else if (foodOption==3){
                                management.showMostUsefulFood();
                            }
                            else if (foodOption==4){
                                management.showMostProfitFood();
                            }
                            else if (foodOption==5){
                                break;
                            }
                            else {
                                System.out.println("INVALID OPTION");
                            }
                        }
                    }
                    else if (managerOption==8) {
                        boolean categoryMenu=true;
                        while (categoryMenu){
                            System.out.println("--- CATEGORY MENU ---");
                            System.out.println("OPTIONS");
                            System.out.println("1. show most expensive category");
                            System.out.println("2. show most purchased category");
                            System.out.println("3. show category with the most utility");
                            System.out.println("4. show category with the most profit");
                            System.out.println("5. back to manager menu");
                            System.out.println("Enter your option");
                            int categoryOption= scanner.nextInt();
                            scanner.nextLine();
                            if (categoryOption==1){
                                management.showMostExpensiveCategory();
                            }
                            else if (categoryOption==2){
                                management.showMostPurchasedCategory();
                            }
                            else if (categoryOption==3){
                                management.showMostUsefulCategory();
                            }
                            else if (categoryOption==4){
                                management.showMostProfitableCategory();
                            }
                            else if (categoryOption==5){
                                break;
                            }
                            else {
                                System.out.println("INVALID OPTION");
                            }
                        }
                    }

                    else if (managerOption==9) {
                        boolean profitMenu=true;
                        while (profitMenu){
                            System.out.println("--- PROFITS MENU ---");
                            System.out.println("OPTIONS");
                            System.out.println("1. show  profits of a food");
                            System.out.println("2. show  profits of a category");
                            System.out.println("3. show total profits");
                            System.out.println("4. back to manager menu");
                            System.out.println("Enter your option");
                            int profitOption= scanner.nextInt();
                            scanner.nextLine();
                            if (profitOption==1){
                                System.out.println("please enter the name of the food you want to see the profits");
                                String findFood=scanner.nextLine();
                                System.out.println(management.showProfitProduct(findFood));
                            }

                            else if (profitOption==2) {
                                System.out.println("please enter the name of the category you want to see the profits");
                                String findCategory=scanner.nextLine();
                                System.out.println(management.showProfitCategory(findCategory));
                            }

                            else if (profitOption==3) {
                                System.out.println(management.totalProfit());
                            }

                            else if (profitOption==4){
                                break;
                            }
                            else {
                                System.out.println("INVALID OPTION");
                            }

                        }
                    }

                    else if (managerOption==10) {
                        break;

                    }
                    else {
                        System.out.println("INVALID OPTION");
                    }


                }

        } else if (option==2) {
                boolean customerMenu=true;
                while (customerMenu){
                    System.out.println("\n---- CUSTOMER MENU ----");
                    System.out.println("OPTIONS");
                    System.out.println("1. show menu");
                    System.out.println("2. Buy food");
                    System.out.println("3. back to main menu");
                    int customerOption=scanner.nextInt();
                    scanner.nextLine();
                    if (customerOption==1){
                        management.showMenu();
                    } else if (customerOption == 2) {
                        boolean continueShopping = true;
                        double totalPurchase = 0;
                        while (continueShopping) {

                            System.out.print("Enter the name of the product you want to buy: ");
                            String productName = scanner.nextLine();

                            System.out.print("Enter the quantity you want to buy: ");
                            int quantity = scanner.nextInt();
                            scanner.nextLine();

                            double totalCost = management.purchase(productName, quantity);
                            totalPurchase += totalCost;

                            System.out.print("Do you want to buy another product? (y/n): ");
                            String response = scanner.nextLine().trim().toLowerCase();
                            while (!response.equals("y") && !response.equals("n")){
                                System.out.println("INVALID ANSWER");
                                System.out.print("Do you want to buy another product? (y/n): ");
                                response = scanner.nextLine().trim().toLowerCase();
                            }

                            if (response.equals("n")) {
                                continueShopping = false;
                            }
                        }

                        System.out.println("\n--- PURCHASE SUMMARY ---");
                        System.out.println("Product\t\t\tTimes Purchased\t\t\tTotal");
                        for (Food food : management.getCatalogue()) {
                            int timesPurchased = food.getTimesPurchased();
                            if (timesPurchased > 0) {
                                double totalProduct = food.getPrice() * timesPurchased;
                                System.out.println(String.format("%-20s %-16d $%.2f", food.getName(), timesPurchased, totalProduct));
                            }
                        }


                        System.out.println("\nTotal purchase: $" + totalPurchase);
                    } else if (customerOption==3) {
                        break;

                    }

                }


        } else if (option==3) {
                break;
            }else {
                System.out.println("INVALID OPTION");
            }


        }
        System.out.println("GOOD BYE \nSEE YOU LATER ;)");
        scanner.close();
}
    }


