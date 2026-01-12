package Sprint_1.FunctionalProgramming.src.Lambda.Predicate.Level2;

import java.util.function.Predicate;

public class Level2Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(1,"Govind",70000,"IT");
        Employee employee2 = new Employee(2,"Dinesh",60000,"Finance");
        Employee employee3 = new Employee(3,"Suresh",80000,"Admin");

        //Salary > 60000
        Predicate<Employee> salaryPredicate = n -> n.salary > 60000;
        System.out.println("Salary > 60000 -> "+ salaryPredicate.test(employee1)); //true

        //Dept is "IT"
        Predicate<Employee> deptPredicate = n -> n.dept.equals("IT");
        System.out.println("Dept is IT -> "+ deptPredicate.test(employee2)); //false

        //IT AND salary > 60000
        Predicate<Employee> bothPredicate = salaryPredicate.and(deptPredicate);
        System.out.println("IT AND salary > 60000 -> "+ bothPredicate.test(employee1)); //true


    }
}
