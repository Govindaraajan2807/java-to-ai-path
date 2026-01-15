package Sprint_1.FunctionalProgramming.src.Lambda.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapsMain {
    public static void main(String[] args) {

        /*
        Stream map(Function mapper) is an intermediate operation and it returns a new Stream a s return value.
         */
        List<String> departmentList = new ArrayList<>();
        departmentList.add ("Supply");
        departmentList.add("HR");
        departmentList.add("Sales");
        departmentList. add ("Marketing");

        departmentList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);


        // flat map

        String[] arrayOfWords = {"Eazy", "Bytes"};
        Arrays.stream(arrayOfWords).flatMap(w -> Arrays.stream(w.split(""))).forEach(System.out::print);
    }
}
