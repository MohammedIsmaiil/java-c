package chapter6;

// task 5
public class PhoneBill {

    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int minutesUsed;


    public PhoneBill(){
        id = 0;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 79.99;
        allottedMinutes = 800;
        minutesUsed = 800;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int minutesUsed ){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.minutesUsed = minutesUsed;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public int getMinutesUsed(){
        return minutesUsed;
    }
    public void setMinutesUsed(int minutesUsed){
        this.minutesUsed = minutesUsed;
    }


    public double calculateOverage(){
        if (minutesUsed <= allottedMinutes){
            return 0;
        }
         double rate = 0.25;
         double overMin = minutesUsed - allottedMinutes;
         return overMin * rate;
    }

    public double calculateTax(){
        double taxRate = 0.15;
        double overCharge = calculateOverage();
        double tax = (baseCost + overCharge) * taxRate;
        return tax;
    }

    public double calculateTotalBill(){
        double tax = calculateTax();
        double overage = calculateOverage();
        double total = baseCost + overage + tax;
        return total;
    }

    public void printItemizedBill(){
        System.out.println("ID: " + id);
        System.out.println("Base Rate: $" + baseCost);
        System.out.println("Overage Fee: $" + calculateOverage());
        System.out.println("Tax: $" +calculateTax());
        System.out.println("Total: $" +  calculateTotalBill());
    }
}
