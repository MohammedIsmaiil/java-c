package chapter5;

import java.util.Scanner;

// task 4
public class PhoneBillCalculatorTask {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base cost of the plan: ");
        double planCost = scanner.nextDouble();

        System.out.println("Enter overage minutes: ");
        double overage = scanner.nextInt();

        scanner.close();

        double overageCharge = calculateOverage(overage);
       double tax = calculateTax(planCost , overageCharge);
        calculateTotalBill(planCost , overageCharge ,tax );


    }

    public static double calculateOverage(double overage ){
        double rate = .25;
         overage = overage * 0.25;
         return overage;
    }

    public static double calculateTax(double planCost , double overageCharge){
        double rate = .15;
        double tax = ( planCost + overageCharge ) * rate;
        return  tax;
    }

    public static void calculateTotalBill(double planCost, double overageCharge , double tax ){

        double total = planCost + overageCharge + tax;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" +  planCost);
        System.out.println("overage: $" +  overageCharge);
        System.out.println("Tax: $" +  tax);
        System.out.println("Total: $" + total);
    }

}
