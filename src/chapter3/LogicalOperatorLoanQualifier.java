package chapter3;

/*
 *logical operators :
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String[] args) {

        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYearsEmployed = 2;


        //Get what we don't
        System.out.println("Enter your salary:");
        Scanner scanner = new Scanner(System.in);
        double Salary = scanner.nextDouble();

        System.out.println("Enter the number of years with your current employer:");
        int years = scanner.nextInt();

        scanner.close();

        //Make decision

        if (Salary >= requiredSalary && years >= requiredYearsEmployed ){
                System.out.println("Congrats! You qualify for the loan");
        }

        else{
            System.out.println("Sorry, you must earn at least $" + requiredSalary + " to qualify for the loan");
        }
    }

}
