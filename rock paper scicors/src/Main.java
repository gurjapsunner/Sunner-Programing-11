import java.util.Scanner;

import java.util.Random;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to rock, paper, scissors");
        while (true) {
            System.out.println("To play input the corresponding number for each move");
            System.out.println(" 1-rock\n 2-papers\n 3-scissors");

//asks player for move and checks to see if its an acc move
            System.out.println("what is ur move?");
            while (!scanner.hasNextInt()) {
                System.out.println("thats not a number dude");
                scanner.next();
            }
            int userMove = scanner.nextInt();

            if (userMove < 1 || userMove > 3) {
                System.out.println("Invalid Input, please provide one of the following numbers: ");
                System.out.println("1-rock");
                System.out.println("2-paper");
                System.out.println("3-scissors");
                continue;
            }

//match the number to an acc move nd give ur own random move

            String[] choices = {"Rock", "Paper", "Scissors"};
            String userMoveStr = choices[userMove - 1];
            System.out.println("user choice: " + userMoveStr);

            int computerIndex = random.nextInt(choices.length);
            String computerChoice = choices[computerIndex];
            System.out.println("computer choice: " + computerChoice);

            //figure out who won
            if (userMoveStr.equals(computerChoice)) {
                System.out.println("issa tie");
            } else if (
                    (userMove == 1 && computerChoice.equals("Scissors")) ||
                            (userMove == 2 && computerChoice.equals("Rock")) ||
                            (userMove == 3 && computerChoice.equals("Paper"))
            ) {
                System.out.println("You win");
            } else {
                System.out.println("computer wins");
            }

        }

    }
}