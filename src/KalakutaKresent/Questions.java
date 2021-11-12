package KalakutaKresent;

import java.util.Scanner;

public class Questions {
    private String prompt;
    private String optionOne;
    private String optionTwo;
    private String answer;


    public Questions(String prompt, String optionOne, String optionTwo, String answer){
        this.prompt = prompt;
        this.optionOne = optionOne;
        this.optionTwo = optionTwo;
        this.answer = answer;
    }
    public static void takeEITest(Questions[] questionEI){
        Scanner input = new Scanner(System.in);
        int numberOfA = 0;
        int numberOfB = 0;
        System.out.println("""
                Welcome to the first section.
                
                This section test introversion/extroversion.
                At the end of the questions you will be told
                if you are an introvert or an extrovert.
                """);
        System.out.println();
        for (Questions questions : questionEI) {
            System.out.println(questions.prompt);
            questions.answer = input.next();
            while(!(questions.answer.equals("A")||questions.answer.equals("B"))){
                System.out.println("""
                        Invalid input.
                        Input must be in upper case and must be A or B
                        """);
                questions.answer = input.next();
            }
            if (questions.answer.equals(questions.optionOne)) {
                numberOfA++;
            } else {
                numberOfB++;
            }
        }
            System.out.println();
            if(numberOfA>numberOfB)
                System.out.println("You are an Introvert");
            else
                System.out.println("You are an Extrovert");
        System.out.println();
        }

    public static void takeSITest(Questions[]questionSI){
       Scanner input = new Scanner(System.in);
       int numberOfA = 0;
       int numberOfB = 0;
       System.out.println("""
                Welcome to the second section.
                
                This section will test your level of sensing/intuition.
                At the end of the section you will be told
                if you do more by sensing or by intuition
                """);
        System.out.println();
       for (Questions questions : questionSI) {
           System.out.println(questions.prompt);
           String answer = input.next();
           while (!(answer.equals("A") || answer.equals("B"))) {
               System.out.println("""
                       Invalid input.
                       Input must be in upper case and must be A or B
                       """);
               answer = input.next();
       if (answer.equals(questions.optionOne)) {
           System.out.println("enter option of A or B");
           answer = input.next();

           numberOfA++;
       }
            else numberOfB++;
       }
       }
        System.out.println();
        if(numberOfA>numberOfB)
            System.out.println("You tend to do more by sensing");
        else
            System.out.println("You tend to do more by intuition");
        System.out.println();
    }

    public static void takeTFTest(Questions[]questionTF) {
        Scanner input = new Scanner(System.in);
        int numberOfA = 0;
        int numberOfB = 0;
        System.out.println("""
                Welcome to the third section.
                
                This section test  your thinking/feeling.
                At the end of the questions you will be told
                if you are a thinker or a feeler.
                """);
            System.out.println();
        for (Questions questions : questionTF) {
            System.out.println(questions.prompt);
            String answer = input.next();
            while(!(answer.equals("A")||answer.equals("B"))){
                System.out.println("""
                        Invalid input.
                        Input must be in upper case and must be A or B
                        """);
                System.out.println(questions.prompt);
                answer = input.next();
            }
            if (answer.equals(questions.optionOne)) {
                numberOfA++;
            } else numberOfB++;
        }
        System.out.println();
        if(numberOfA>numberOfB)
            System.out.println("You are a thinker");
        else
            System.out.println("You are a feeler");
        System.out.println();
    }
    public static void takeJPTest(Questions[]questionJP) {
        Scanner input = new Scanner(System.in);
        int numberOfA = 0;
        int numberOfB = 0;
        System.out.println("""
                Welcome to the last section
                
                This section test your level of judgement/perception.
                At the end of the questions you will be told
                if you judge or perceive.
                """);
        System.out.println();
        for (Questions questions : questionJP) {
            System.out.println(questions.prompt);
            String answer = input.next();
            while(!(answer.equals("A")||answer.equals("B"))){
                System.out.println("""
                        Invalid input.
                        Input must be in upper case and must be A or B
                        """);
                answer = input.next();
            }
            if (answer.equals(questions.optionOne)) {
                numberOfA++;
            } else numberOfB++;
        }

        if(numberOfA>numberOfB) {
            System.out.println("You are the judgy type");
        }
        else
            System.out.println("You are the perceiving type");
        System.out.println();
    }

    public static void printAnswers(Questions[]questionEI,Questions[]questionSI,Questions[]questionTF,Questions[]questionJP) {
        Scanner input = new Scanner(System.in);
        String[] userInput = new String[8];
        for (int i = 0; i < userInput.length; i++) {
            userInput[i] = input.next();
        }
        for (String s : userInput) {
//            for (int c2 = 0; c2 < userInput[c].length; c2++)
            System.out.printf("%-10s", s);
        }
    }
        }


