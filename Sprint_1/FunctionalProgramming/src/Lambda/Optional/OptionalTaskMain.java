package Sprint_1.FunctionalProgramming.src.Lambda.Optional;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalTaskMain {
    public static void main(String[] args) {

        Employee employee1 = new Employee(1,"A","a@gmail.com");
        Employee employee2 = new Employee(2,"B","b@gmail.com");
        Employee employee3 = new Employee(3,"C","c@gmail.com");
        Employee employee4 = new Employee(4,"D",null);

        //Create Optional from possibly null value
        Optional<String> emailOpt = Optional.ofNullable(employee1.getEmail());

        //2️⃣ Use default value
        String emailOptDefault = Optional.ofNullable(employee4.getEmail()).orElse("d@gmail.com");
//        employee4.setEmail(emailOptDefault);
//        System.out.println(employee4.getEmail());

        //3️⃣ Lazy default (Supplier)
        String emailOrElseGet = Optional.ofNullable(employee4.getEmail()).orElseGet(() -> "d@gmail.com");
//        System.out.println(emailOrElseGet);

        //4️⃣ Throw exception if null

//        String emailException = Optional.ofNullable(employee4.getEmail()).orElseThrow(() -> new RuntimeException("Email id is missing"));
//        System.out.println(emailException);

        //5️⃣ Use map
        Optional<Integer> emailIdLength = emailOpt.map(String::length);
        System.out.println(emailIdLength);

    }
}
