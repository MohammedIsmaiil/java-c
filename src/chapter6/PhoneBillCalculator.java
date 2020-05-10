package chapter6;

// task 5
public class PhoneBillCalculator {

    public static void main(String[] args) {

        PhoneBill phoneBill = new PhoneBill(1500);
        phoneBill.setMinutesUsed(800);
        phoneBill.printItemizedBill();
    }

}
