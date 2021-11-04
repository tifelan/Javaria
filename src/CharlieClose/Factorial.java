package CharlieClose;

import java.util.Scanner;

public class Factorial {
        public static void main(String args[]){
            int factorial=1;
            int number;
            System.out.println("Enter a number and I will tell you its factorial");
            Scanner input = new Scanner(System.in);
            number = input.nextInt();
            for(int i=1;i<=number;i++){
                factorial=factorial*i;
            }
            System.out.println("Factorial of "+number+" is "+factorial);
        }
    }

