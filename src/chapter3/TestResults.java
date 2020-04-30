package chapter3;

import java.util.Scanner;

/*
 * IF-ELSE-IF
 * Display the letter grade for a student based on their test score.
 */
public class TestResults {

    public static void main(String[] args) {

        //Get the test score
        System.out.println("enter your score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();
        scanner.close();


        //Determine the letter grade
        char grade;
        if (score >= 90){
            grade = 'A';
        }
        else if (score >= 80){
            grade = 'B';
        }
        else if (score >= 70){
            grade = 'C';
        }
        else if ( score >= 60){
            grade = 'D';
        }
        else{
            grade = 'F';
        }

        System.out.println("your grade is " + grade);

    }
}
