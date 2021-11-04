package KalakutaKresent;

import java.util.Scanner;

public class LicensingExam {
    private static int scholars;
    private static int resitters;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for(int counter = 1; counter<=10; counter++) {
            System.out.println("Enter result " + (counter));
            int result = input.nextInt();
//            while(result!=1||(result!=2)){
//                System.out.println("Enter a valid score");
//            }
            if(result == 1){
                scholars = scholars + 1;
            }
            else resitters = resitters + 1;
        }
        System.out.printf("Total number of stud who passed are %d \nTotal numbers of resiters are %d", scholars, resitters);
        System.out.println();
        if(scholars>8) System.out.println("Bonus to instructor");
    }
}