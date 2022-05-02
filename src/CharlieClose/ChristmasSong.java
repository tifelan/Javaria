package CharlieClose;

import java.util.Scanner;

public class ChristmasSong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("The 12 Days of Christmas");
        System.out.println("""
                1. On the first day...
                2. On the second day...
                3. On the third day...
                4. On the fourth day...
                5. On the fifth day...
                6. On the sixth day...
                7. On the seventh day...
                8. On the eight day...
                9. On the ninth day...
                10.On the tenth day...
                11.On the eleventh day...
                12.On the twelve day...
                """);
        int day = input.nextInt();
        switch(day){
            case 12:
                System.out.println("""
                        On the 12th day of Christmas my true love sent to me
                        12 drummers drumming
                        """);
            case 11:
                System.out.println("""
                        On the 11th day of Christmas my true love sent to me
                        11 pipers piping
                        """);
            case 10:
                System.out.println("""
                        On the 10th day of Christmas my true love sent to me
                        10 lords a-leaping
                        """);
            case 9:
                System.out.println("""
                        On the ninth day of Christmas my true love sent to me
                        Nine ladies dancing
                        """);
            case 8:
                System.out.println("""
                        On the eighth day of Christmas my true love sent to me
                        Eight maids a-milking
                        """);
            case 7:
                System.out.println("""
                        On the seventh day of Christmas my true love sent to me
                        Seven swans a-swimming
                        """);
            case 6:
                System.out.println("""
                        On the sixth day of Christmas my true love sent to me
                        Six geese a-laying
                        """);
            case 5:
                System.out.println("""
                        On the fifth day of Christmas my true love sent to me
                        Five golden rings
                        """);
            case 4:
                System.out.println("""
                        On the fourth day of Christmas my true love sent to me
                        Four calling birds
                        """);
            case 3:
                System.out.println("""
                        On the third day of Christmas my true love sent to me
                        Three french hens
                        """);
            case 2:
                System.out.println("""
                        On the second day of Christmas my true love sent to me
                        Two turtle doves and
                        """);
            case 1:
                System.out.println("""
                        On the first day of Christmas my true love sent to me
                        A partridge in a pear tree1
                        """);

        }


    }
}