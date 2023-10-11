import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Rolling the dice
        // Kasta två tärningar” och visa resultatet enligt skärmdump ända tills man 
        // INTE svarar ”y” eller ”yes” på frågan om igen

            Random myRandom = new Random(0);
            boolean gameLoop = true;

        while(gameLoop){
            boolean playAgain = true;

            int dice1 = myRandom.nextInt(6) + 1;
            int dice2 = myRandom.nextInt(6) + 1;

            System.out.println("Rolling the dices...");
            System.out.println("The values are.... ");

            System.out.println(dice1);
            System.out.println(dice2);


            while(playAgain){
                System.out.println("Roll the dices again?");
                Scanner myScanner = new Scanner(System.in);
                String userChoice = myScanner.nextLine();

                if(userChoice.equalsIgnoreCase("no")){
                    System.out.println("Tack för att du spelade!");
                    playAgain = false;
                    gameLoop = false;
                }
                else if(userChoice.equalsIgnoreCase("yes")){
                    playAgain = false;
                }
                else{
                    System.out.println("Du måste skriva ja eller nej!");
                }
                
            }
            
        }

    }
}