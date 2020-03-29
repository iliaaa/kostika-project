package lambda.part1.exercise;

import org.junit.Test;

import java.util.StringJoiner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class Lambdas02Exercise {

    private interface GenericProduct<T> {
        T prod(T a, int i);

        default T twice(T t) {
            return prod(t, 2);
        }
    }

    @Test
    public void generic0() {
        //TODO Use anonymous class
        final GenericProduct<Integer> prod = new GenericProduct<Integer>() {
            @Override
            public Integer prod(Integer a, int i) {
                return a * i;
            }
        };
        assertEquals(prod.prod(3, 2), Integer.valueOf(6));
    }

    @Test
    public void generic1() {
        //TODO Use statement lambda
        final GenericProduct<Integer> prod = (a, i) -> {
            return a * i;
        };

        assertEquals(prod.prod(3, 2), Integer.valueOf(6));
    }

    @Test
    public void generic2() {
        //TODO Use expression lambda
        final GenericProduct<Integer> prod = (a, i) -> a * i;

        assertEquals(prod.prod(3, 2), Integer.valueOf(6));
    }

    private static String stringProd(String s, int i) {
        //TODO any realization (String, StringBuilder)
        StringBuilder sb = new StringBuilder();
        for (int j = 1; j <= i; j++) {
            sb.append(s);
        }
        return String.valueOf(sb);
    }

    private static String stringGenerator(String s, int i) {
        //TODO Use stream.generate

        return Stream.generate(() -> s).limit(i).collect(Collectors.joining());
    }

    @Test
    public void strSum() {
        final GenericProduct<String> prod = (s, i) -> stringProd(s, i);
        final GenericProduct<String> prod2 = Lambdas02Exercise::stringGenerator;

        assertEquals(prod.prod("a", 2), "aa");
        assertEquals(prod2.prod("a", 3), "aaa");
    }

    private final String delimeter = "-";

    private String stringSumWithDelimeter(String s, int i) {
        //TODO any realization (String, StringBuilder)
        StringBuilder sb = new StringBuilder(s);
        for (int j = 2; j <= i; j++) {
            sb.append(delimeter + s);
        }
        return String.valueOf(sb);
    }

    @Test
    public void strSum2() {
        final GenericProduct<String> prod = (s, i) -> stringSumWithDelimeter(s, i); // use stringSumWithDelimeter;

        assertEquals(prod.prod("a", 3), "a-a-a");
    }


}
