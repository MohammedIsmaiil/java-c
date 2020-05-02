package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args) {

        double penny = .01;
        double nickel = .05;
        double dime = .1;
        double quarter = .25;
        int dollar = 1;

        System.out.println("Welcome to 'Change for a Dollar'! Your goal is to enter enough change to make exactly $1.00 ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your pennies");
        int numOfPennies = scanner.nextInt();

        System.out.println("enter your nickels");
        int numOfNickels = scanner.nextInt();

        System.out.println("enter your dimes");
        int numOfDimes = scanner.nextInt();

        System.out.println("enter your quarters");
        int numOfQuarters = scanner.nextInt();

        scanner.close();
        double totalCoins = penny * numOfPennies + nickel * numOfNickels + dime * numOfDimes + quarter * numOfQuarters;

        if (totalCoins > dollar){
            double amountOver =  totalCoins -dollar;
            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");        }
        else if (totalCoins < dollar){
            double amountShort = dollar - totalCoins;
            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        else {
            System.out.println("Yay! That's exactly $1.00! You win!");

        }
    }
}
