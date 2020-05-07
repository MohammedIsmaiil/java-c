package chapter6;

/*
 * Write a class that creates instances of the `Rectangle` class to find the
 * total area of two rooms in a house.
 */
public class HomeAreaCalculator {

    public static void main(String[] args) {

        /*******************
         * RECTANGLE 1
         ********************/
        //Create instance of `Rectangle` class
        Rectangle room1 = new Rectangle();
        room1.setLength(10);
        room1.setWidth(2);
        double areaOfRoom1 = room1.calculateArea();

        /**
         *  RECTANGLE 2
         */
        Rectangle room2 = new Rectangle(20,3);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;

        System.out.println("Area of both rooms:" + totalArea);
    }
}
