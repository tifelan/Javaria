package AlphaAlley;

import java.util.Scanner;
public class Chapter2Obj {
   public static void main(String[] args) {
       int number ;
       Scanner input = new Scanner(System.in);
       System.out.println("Enter five number");
       number = input.nextInt();
      if (number > 99999){
          System.out.println("Entry overloaded");
      }
        if(number < 10000){
            System.out.println("incomplete Entry");
        }
        else
        //System.out.printf("%d%s%d%s%d%s%d%s%d", number);
       System.out.println(number + " ");
   }
}
