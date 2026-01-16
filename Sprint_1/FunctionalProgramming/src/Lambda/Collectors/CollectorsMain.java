package Sprint_1.FunctionalProgramming.src.Lambda.Collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsMain {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1, "A", 50000, "IT"),
                new Employee(2, "B", 80000, "HR"),
                new Employee(3, "C", 90000, "IT"),
                new Employee(4, "D", 30000, "SALES"),
                new Employee(5, "E", 70000, "HR")
        );

        //Collect all employee names into a List<String>
         List<String> employeeNames = employees.stream().map(e -> e.name).toList();

        //Collect all departments into a Set<String> (no duplicates)
        Set<String> departments = employees.stream().map(Employee::getDept).collect(Collectors.toSet());
        departments.forEach(System.out::println);

        //Create a Map<Integer, String> id → name
        Map<Integer,String> map = employees.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
        map.forEach((k,v) -> System.out.println(k+" "+v));

        //Group employees by department
       Map<String, List<Employee>> employeeMap = employees.stream().collect(Collectors.groupingBy(Employee::getDept));
       employeeMap.forEach((k,v) -> System.out.println(k +" "+v));

       //Average salary per department
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary))));

    }
}
