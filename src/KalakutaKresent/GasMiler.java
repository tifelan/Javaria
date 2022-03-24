package KalakutaKresent;

import java.util.Scanner;

public class GasMiler {
    private static int milesDriven;
    private static int gallonUsed;
    private static double tripMPG;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int data = input.nextInt();
        while(data != -1) {
            System.out.println("Enter miles driven");
            int mileage= input.nextInt();
            mileage = milesDriven+mileage;
            System.out.println("Enter gallons used");
            int fuel = input.nextInt();
            fuel = gallonUsed+fuel;
            double tripMPG = (double) mileage / fuel;
        }
        double totalMPG = (double) milesDriven / gallonUsed;
        System.out.printf("The average amount of fuel used per trip is %f\n The amount of fuel used for the total trip is %f",tripMPG,totalMPG);
    }

}

