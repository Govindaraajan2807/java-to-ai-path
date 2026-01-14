package Sprint_1.FunctionalProgramming.src.Lambda.Supplier;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierMain {
    public static void main(String[] args) {
        /*
        Supplier<T> = takes nothing, returns something
        Used for:
            lazy object creation
            default values
            factories
            test data
            cache loaders

         Supplier is used when we want to get or create a value without providing any input
         */
        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 100);

        List<Integer> numbers =
                Stream.generate(randomSupplier)
                        .limit(5)
                        .toList();
        System.out.println(numbers);

        // Mini task - random 6-digit OTP as String 😄

        Supplier<String> otpSupplier = () -> {
            Random random = new Random();
            return String.valueOf(100000 + random.nextInt(900000));
        };

        System.out.println("random 6-digit OTP as String " + otpSupplier.get());
    }
}
