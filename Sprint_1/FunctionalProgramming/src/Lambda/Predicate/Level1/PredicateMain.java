package Sprint_1.FunctionalProgramming.src.Lambda.Predicate.Level1;

import java.util.function.Predicate;


public class PredicateMain {
    public static void main(String[] args) {
        //Implement the interface
        PredicateInteger predicateInteger = n -> n % 2 == 0;

        Predicate<Integer> predicate = n -> predicateInteger.isEven(n);

        Predicate<Integer> predicate1 = n -> n % 2 == 0;

        System.out.println(predicate1.test(4));


        //Check string is empty or null
        String string = "";
        Lambda.Predicate.Level1.PredicateStringEmpty predicateStringEmpty = s -> s.isEmpty();
        Predicate<String> stringPredicate = s -> predicateStringEmpty.isNullOrEmpty(s);

        System.out.println("Check string is empty or null -> "+stringPredicate.test(string));

//        Predicate<String> stringPredicate1 = s -> s.isEmpty();
//        System.out.println(stringPredicate1.test(string));

        //Check number > 100

        Predicate<Integer> predicate2 = n -> n > 100;
        System.out.println("Check number > 100 -> "+ predicate2.test(2));

        //Check person is eligible to vote (age >= 18)
        Predicate<Integer> predicate3 = n -> n >= 18;
        System.out.println("Check person is eligible to vote (age >= 18) -> "+ predicate3.test(17));



    }
}
