package chapter5;

/*
 * VARIABLE SCOPE
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {

   static int requiredSalary = 25000;
   static int requiredCreditScore = 700;
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Get what we don’t know
        double salary = getSalary();
        int score = getScore();

        // Check if the user is qualified
        boolean isQualified = isUserQualified(salary , score);

        // Notify the user
        notifyUser(isQualified);

    }

    public static double getSalary(){
        System.out.println("enter your salary");
        double salary = scanner.nextDouble();
        return salary;
    }
    public static int getScore(){
        System.out.println("enter your Score");
        int score = scanner.nextInt();
        return score;
    }
    public static boolean isUserQualified(double salary , double score){
        if (salary >= requiredSalary && score >= requiredCreditScore){
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean qualified ){
        if (qualified){
            System.out.println(" Congrats! You've been approved.");
        }
        else {
            System.out.println(" Sorry. You've been declined. ");
        }
    }

}
