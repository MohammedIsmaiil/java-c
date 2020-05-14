package chapter7;

/*
We're going to create a Lottery Quick Pick application that will generate a lottery ticket with 6 random numbers,
 between 1 and 69. I'm going to show you how to write this program,
 but if any one of you uses this and wins the lottery,
I do expect my cut. Okay?
 */
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] tickets = generateNumbers();
        Arrays.sort(tickets);
        printNumbers(tickets);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();


        for (int i=0; i<LENGTH; i++){
            int randomNumber;
                /*
                    generate random number then search to make sure it doesn't
                    already exist in the array. if it dose, regenerate and search again.
                 */
            do {
                 randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
                 System.out.println(randomNumber);
            }while (search(ticket , randomNumber) );
            // number is unique if you get here, add it to array
            ticket[i] = randomNumber;
        }
        return ticket;
    }

    /**
     *
     * @param array  array to search
     * @param numberToSearchFor  value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array , int numberToSearchFor){
        // Array must be sorted first
//        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if (index >= 0){
            return true;
        }
        else return false;
    }

    public static void printNumbers(int[] tickets){
        for (int i=0; i<LENGTH; i++){
            System.out.print(tickets[i] + " | ");
        }
    }
}
