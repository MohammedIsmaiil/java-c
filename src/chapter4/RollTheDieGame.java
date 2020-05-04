package chapter4;

import java.util.Random;
import java.util.Scanner;

// Task 3
public class RollTheDieGame {

    public static void main(String[] args) {

        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();
        System.out.println("Welcome to Roll the Die! Let's begin...");
//        Scanner scanner = new Scanner(System.in);

        for (int i=1; i<= maxRolls; i++){

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;
            System.out.print("Roll #:" + i + " You've rolled a "+ die);

            if (currentSpace == lastSpace){
                System.out.println("you won");
                break;
            }
            else if (currentSpace > lastSpace){
                System.out.println(" You're space must be " + lastSpace );
                break;
            }
            else if (i == maxRolls && currentSpace < lastSpace){

                System.out.println("You're on space " + currentSpace + ".");
                System.out.println(" Unfortunately, you didn't make it to all " + lastSpace + " spaces. You lose!");
            }
            else {
                int spacesToGo = lastSpace - currentSpace;
                System.out.println(" You are now on space " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

        }

    }
}
