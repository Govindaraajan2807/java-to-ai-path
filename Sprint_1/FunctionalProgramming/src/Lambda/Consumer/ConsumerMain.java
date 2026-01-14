package Sprint_1.FunctionalProgramming.src.Lambda.Consumer;


import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {

        /*Consumer<T> = takes input, returns nothing (void)
        Used for: printing, logging, saving, sending, side-effects.*/

        Consumer<String> printer = n -> System.out.println(n.toUpperCase());

        printer.accept("Govi");

        Employee employee = new Employee(1,"Govind",10000,"IT");
        Consumer<Employee> employeeConsumer = e -> System.out.println(e.id + e.name + e.salary + e.dept);
        employeeConsumer.accept(employee);

        Consumer<Employee> saveToDbConsumer = e -> System.out.println("Saving employee "+ e.name);
        saveToDbConsumer.accept(employee);

    }
}
