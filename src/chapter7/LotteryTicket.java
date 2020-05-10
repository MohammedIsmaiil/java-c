package chapter7;

/*
We're going to create a Lottery Quick Pick application that will generate a lottery ticket with 6 random numbers,
 between 1 and 69. I'm going to show you how to write this program,
 but if any one of you uses this and wins the lottery,
I do expect my cut. Okay?
 */
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;
    public static void main(String[] args) {

        int[] tickets = generateNumbers();
        printNumbers(tickets);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for (int i=0; i<6; i++){
            ticket[i] = random.nextInt(MAX_TICKET_NUMBER) + 1;
        }
        return ticket;
    }

    public static void printNumbers(int[] tickets){
        for (int i=0; i<6; i++){
            System.out.print(tickets[i] + " | ");
        }
    }
}
