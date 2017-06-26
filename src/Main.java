import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        double roomLength = 0;
        double roomWidth = 0;
        double roomArea = 0;
        double roomPerm = 0;



        System.out.println("Enter length: ");
        roomLength = scnr.nextDouble();

        System.out.println("Enter width: ");
        roomWidth = scnr.nextDouble();

        roomArea = (roomLength * roomWidth);
        roomPerm = ((2 * roomLength) + (2 * roomWidth));
        System.out.println("Area: " + roomArea);
        System.out.println("Perimeter: " + roomPerm);
        System.out.println("");
        System.out.println("Continue? y/n");



    }
}
