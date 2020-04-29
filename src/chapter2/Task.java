package chapter2;

import java.util.Scanner;

public class Task {

    public static void main(String[] args) {

        // 1-get the season of year
        System.out.println(" enter season of the year");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();


        // 2- get whole number
        System.out.println(" enter a whole number");

        int wholeNum = scanner.nextInt();


        // 3- get an adjective
        System.out.println("enter an adjective");
        String adj = scanner.next();

        scanner.close();

        System.out.println("on an " + adj + " " + season + " day i drink a minimum of "+ wholeNum + " cups of coffee");


    }
}
