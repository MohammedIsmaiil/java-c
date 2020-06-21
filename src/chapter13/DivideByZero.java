package chapter13;

// Exceptions
public class DivideByZero {

    public static void main(String[] args) {
        try{
            int c = 30/0;

        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("Dividing by zero is not permitted");
        }finally {
            System.out.println("Division is fun!");
        }
    }
}
