package Sprint_1.FunctionalProgramming.src.Lambda.Optional;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        /*
            Optional.of() should be used only when we are sure the value is not null,
            otherwise it throws NullPointerException
         */
        String name = "Govind";
        Optional<String> optionalString = Optional.of(name);

        /*
            ofNullable() - Returns a n Optional describing the given value, if non-null, otherwise returns an empty Optional.
         */
        String emptyName = null;
        Optional<String> emptyOptionalString = Optional.ofNullable(emptyName);

        /*
            Returns the value if present; otherwise, returns the given default value
         */
        String optionalName = emptyOptionalString.orElse("Govind");

        /*
            orElseGet() - Returns the value if present; otherwise, returns the one provided by the given Supplier
         */
        Optional<String> orElseGetName = Optional.ofNullable(emptyName);
        String orElseGetString = orElseGetName.orElseGet(name::toUpperCase);
        System.out.println(orElseGetString);

        /*
            orElseThrow() - Returns the value if present; otherwise, throws the exception created by the given Supplier
         */
        String orElseThrowString = Optional.ofNullable(emptyName).orElseThrow(() -> new RuntimeException("Name is missing"));
//        System.out.println(orElseThrowString);

    }
}
