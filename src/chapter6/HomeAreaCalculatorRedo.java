package chapter6;

// we can use objects as the arguments for methods,
import java.util.Scanner;

public class HomeAreaCalculatorRedo {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        HomeAreaCalculatorRedo calculator = new HomeAreaCalculatorRedo();
        Rectangle kitchen = calculator.getRoom();
        Rectangle bathRoom = calculator.getRoom();

        double area = calculator.calculateTotalArea(kitchen , bathRoom);

        System.out.println("The total area is: " + area);
        calculator.scanner.close();
    }

    public Rectangle getRoom(){
        System.out.println("Enter the length of your room: ");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of your room: ");
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length , width);
        return  rectangle;
    }

    public double calculateTotalArea(Rectangle rect1 , Rectangle rect2){

        return rect1.calculateArea() + rect2.calculateArea();

    }
}
