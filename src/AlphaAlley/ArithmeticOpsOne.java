package AlphaAlley;
import java.util.Scanner;
public class ArithmeticOpsOne {

    public static void main(String[] args) {

        Scanner intake = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = intake.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = intake.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = intake.nextInt();
        System.out.print("Enter fourth number: ");
        int fourthNumber = intake.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber + fourthNumber;
        System.out.printf("Sum is %d%n", sum);

        int modulus =thirdNumber % fourthNumber;
        System.out.printf("Modulus is %d " , modulus);

        int ave = firstNumber + secondNumber + thirdNumber + fourthNumber / 3;
        System.out.printf("Average is %d%n: ", ave);


    }
    }
