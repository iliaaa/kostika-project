package java8.FI.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Sample {
    public static void main(String[] args) {
        Function<String, Integer> stringIntegerFunction;

        stringIntegerFunction = s -> {
            return s.length();
        };

        System.out.println(stringIntegerFunction.apply("asasas"));


        BiFunction<String, Integer, Integer> biFunction;

        biFunction = (s, integer) -> {
            System.out.println(s);
            return s.length() + integer;
        };


        System.out.println(biFunction.apply("qwerty", 10));


    }
}
