package java8.FI2;

import java.util.function.Function;


public class FunctionSample {
    public static void main(String[] args) {
        Function<String, Integer> function = s -> {
            System.out.println("function run - " + s);
            return s.length();
        };


        Function<Integer, Integer> function1 = integer -> {
            System.out.println("add");
            return integer + 10;
        };

        Function<Integer, Integer> function2 = integer -> {
            System.out.println("mult");
            return integer * 2;
        };


        System.out.println(function1.andThen(function2).apply(10));
        System.out.println(function1.compose(function2).apply(10));

    }
}
