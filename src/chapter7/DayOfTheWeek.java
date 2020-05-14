package chapter7;

// Task 6
/*
Make an array that holds its actual values of the days of the week,
 and then have the user input a number corresponding to some day of the week.
 And assume that the week starts on Monday.
Your program should output the String that represents the day of the week that corresponds to the number that the user input.
 For example, if the user inputs the number 1, your program should print “Monday”.
 */

import java.util.Scanner;

public class DayOfTheWeek {

    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println("Enter a number for the day of the week");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        scanner.close();
        System.out.println(week[index - 1]);
    }
}
