package CharlieClose;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
//Lambdas
public class StreamReduce {
    public static void main(String[] args) {
        System.out.printf("Sum of 1 through 10 is %d%n", IntStream.rangeClosed(1,10).sum());
        System.out.printf("Sum of the even ints from 2 through 20 %d%n", IntStream.rangeClosed(1,10)
                                                                                   .map((int x)->{return x * 2;}).sum());
        System.out.printf("Sum of the triplets of the even ints from 2 through 10 is %d%n", IntStream.rangeClosed(1,10).filter(x -> x%2==0).map(x -> x * 3).sum());
        SecureRandom randomNumbers = new SecureRandom();
        System.out.println("Random numbers on seperate lines:");
        randomNumbers.ints(10,1,7).forEach(System.out::println);
        String numbers = randomNumbers.ints(10,1,7).mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.printf("%nRandom numbers on one line %s%n", numbers);



//        () -> System.out.println("Welcome to Lamdas")

    }
}
