package KalakutaKresent;

import java.util.Scanner;

public class SevenSegmentScreen {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        SevenSegment segment = new SevenSegment();
        System.out.print("Enter 8 digits in 1s and 0s to print\na seven segment display:");
        String UserInput = input.nextLine();
        segment.setSevenSegmentScreen(UserInput);
        segment.displayScreen();
    }
}