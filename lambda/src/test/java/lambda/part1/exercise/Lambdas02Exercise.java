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
        final GenericProduct<Integer> prod = null;

        assertEquals(prod.prod(3, 2), Integer.valueOf(6));
    }

    @Test
    public void generic1() {
        //TODO Use statement lambda
        final GenericProduct<Integer> prod = null;

        assertEquals(prod.prod(3, 2), Integer.valueOf(6));
    }

    @Test
    public void generic2() {
        //TODO Use expression lambda
        final GenericProduct<Integer> prod = null;

        assertEquals(prod.prod(3, 2), Integer.valueOf(6));
    }

    private static String stringProd(String s, int i) {
        //TODO any realization (String, StringBuilder)
        return "?";
    }

    private static String stringGenerator(String s, int i) {
        //TODO Use stream.generate
        return "?";
    }

    @Test
    public void strSum() {
        final GenericProduct<String> prod = null;
        final GenericProduct<String> prod2 = null;

        assertEquals(prod.prod("a", 2), "aa");
        assertEquals(prod2.prod("a", 3), "aaa");
    }

    private final String delimeter = "-";

    private String stringSumWithDelimeter(String s, int i) {
        //TODO any realization (String, StringBuilder)
        return "?";
    }

    @Test
    public void strSum2() {
        final GenericProduct<String> prod = null; // use stringSumWithDelimeter;

        assertEquals(prod.prod("a", 3), "a-a-a");
    }


}
