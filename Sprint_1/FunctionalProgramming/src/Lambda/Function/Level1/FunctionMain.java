package Sprint_1.FunctionalProgramming.src.Lambda.Function.Level1;


import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionMain {
    public static void main(String[] args) {

        /*
            Takes input, returns output
         */
        Function<String, Integer> stringLength = s -> s.length();
        String string = "Macha";
        System.out.println(stringLength.apply(string));

        Employee employee1 = new Employee(1,"Govind",70000,"IT");
        Employee employee2 = new Employee(2,"Dinesh",60000,"Finance");
        Employee employee3 = new Employee(3,"Suresh",80000,"Admin");

        Function<Employee, String> getName = e -> e.name;
        System.out.println(getName.apply(employee1));

        // Function.Identity

        List<String> names = List.of("A","B","C");
        System.out.println(names.stream().collect(Collectors.toMap(Function.identity(),n -> n.length())));
    }
}
