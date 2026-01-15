package Sprint_1.FunctionalProgramming.src.Lambda.Streams.Stream;

import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        String[] stringArray = {"Govi","Aksh","John"};
        Arrays.stream(stringArray).map(String::toUpperCase).toList().forEach(System.out::println);

        // Generate n number of random numbers
        Supplier<Integer> randomSupplier = () -> new Random().nextInt();
        Stream.generate(randomSupplier).limit(5).forEach(System.out::println);
    }
}
