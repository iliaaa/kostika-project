package java8.FI;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        Predicate<String> predicate;
        BiPredicate<String, Integer> biPredicate;

        Supplier<String> supplier;

        Consumer<String> consumer;
        BiConsumer<String, Integer> biConsumer;

        Function<String, Integer> function;
        BiFunction<String, String, Integer> biFunction;

        UnaryOperator<String> unaryOperator;

        BinaryOperator<String> binaryOperator;
    }
}
