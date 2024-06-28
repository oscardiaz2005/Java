import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int betTotal = 200;
        int currentPlayer = 1;
        int throwValue = 0;
        int dice = 0;
        int newDice = 0;
        int bet = 0;
        int game = 0;
        int moneyPlayer1 = 1000;
        int moneyPlayer2 = 1000;

        System.out.println("Welcome Players");
        System.out.println("Player " + currentPlayer + " begin Throwing");

        while ((betTotal > 0) && (game == 0) && (moneyPlayer1 > 0) && (moneyPlayer2 > 0)) {
            dice = (int) (Math.random() * 6 + 1);
            throwValue = 1;

            if ((dice == 1 || dice == 6) && throwValue == 1) {
                System.out.println("Your result was " + dice);
                System.out.println("Player " + currentPlayer + " lost $100");
                if (currentPlayer == 1) {
                    moneyPlayer1 -= 100;
                    System.out.println("Player 1's remaining money is = " + moneyPlayer1);
                } else if (currentPlayer == 2) {
                    moneyPlayer2 -= 100;
                    System.out.println("Player 2's remaining money is = " + moneyPlayer2);
                }
                betTotal += 100;
                System.out.println("The total of money is " + betTotal);
            } else if (dice >= 2 && dice <= 5) {
                throwValue = 2;
                System.out.println("Your result was " + dice);
                System.out.println("How much money do you want to bet?");
                Scanner x = new Scanner(System.in);
                bet = x.nextInt();

                // Check if the bet is valid
                while (bet > betTotal || bet < 0 || (currentPlayer == 1 && bet > moneyPlayer1) || (currentPlayer == 2 && bet > moneyPlayer2)) {
                    if (currentPlayer == 1) {
                        System.out.println("Player 1, you have $" + moneyPlayer1 + " remaining.");
                    } else {
                        System.out.println("Player 2, you have $" + moneyPlayer2 + " remaining.");
                    }
                    System.out.println("Remember that the total of money remaining is " + betTotal);
                    System.out.println("How much money do you want to bet?");
                    bet = x.nextInt();
                }

                if (bet <= betTotal) {
                    System.out.println("You have to get a number bigger than " + dice);
                    newDice = (int) (Math.random() * 6 + 1);
                    System.out.println("You got " + newDice);
                    if (newDice > dice) {
                        System.out.println("You won the bet");
                        betTotal -= bet;
                        if (currentPlayer == 1) {
                            moneyPlayer1 += bet;
                            System.out.println("Player 1's remaining money is " + moneyPlayer1);
                        } else {
                            moneyPlayer2 += bet;
                            System.out.println("Player 2's remaining money is " + moneyPlayer2);
                        }
                        game = 1;
                    } else {
                        System.out.println("You lost");
                        betTotal += bet;
                        System.out.println("the total of money is "+ betTotal);
                        if (currentPlayer == 1) {
                            moneyPlayer1 -= bet;
                            System.out.println("Player 1's remaining money is " + moneyPlayer1);
                        } else {
                            moneyPlayer2 -= bet;
                            System.out.println("Player 2's remaining money is " + moneyPlayer2);
                        }
                    }
                }
            }

            if (game == 0) {
                currentPlayer = currentPlayer == 1 ? 2 : 1; // Switch
                System.out.println("Player " + currentPlayer + " has the next turn");
            }
        }

        if (moneyPlayer1 <= 0) {
            System.out.println("Player 1 has run out of money. Player 2 wins!");
        } else if (moneyPlayer2 <= 0) {
            System.out.println("Player 2 has run out of money. Player 1 wins!");
        } else if (betTotal == 0) {
            System.out.println("The total money is depleted player " + currentPlayer +" has wom the game");
        } else {
            System.out.println("Player " + currentPlayer + " has won");
        }
        System.out.println("The game has finished, thanks for playing");
    }
}
