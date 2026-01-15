package Sprint_1.FunctionalProgramming.src.Lambda.Streams.Stream;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TasksMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10, 15, 20, 25, 30, 35);

        List<String> names = List.of("Ravi", "Arun", "Macha", "Kumar", "Ajay");

        //Print only even numbers
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

        // Create a list of squares
        numbers.stream().map(n -> n * n).toList().forEach(System.out::println);

        //Convert all names to uppercase
        names.stream().flatMap(n -> Stream.of(n.split(""))).map(String::toUpperCase).forEach(System.out::print);

        //Filter names with length > 4
        System.out.println();
        names.stream().filter(n -> n.length() > 4).forEach(System.out::println);

        //Check if all numbers are even
        Predicate<Integer> numberList = n -> n % 2 == 0;
        numbers.stream().filter(numberList).forEach(System.out::println);
        // print true false
        numbers.stream().map(numberList::test).forEach(System.out::println);

        //Print employees with salary > 60000
        //Get list of employee names
        //Sort employees by salary

        List<Employee> employees = List.of(
                new Employee(1, "A", 50000),
                new Employee(2, "B", 80000),
                new Employee(3, "C", 90000),
                new Employee(4, "D", 30000)
        );

        employees.stream().filter(e -> e.salary > 60000).forEach(e -> System.out.println(e.name));

        //Get list of employee names
        employees.forEach(e -> System.out.println(e.name));

        //Sort employees by salary
        System.out.println();
        employees.stream().sorted(Comparator.comparing(e -> e.salary)).forEach(e -> System.out.println(e.name));

    }
}
