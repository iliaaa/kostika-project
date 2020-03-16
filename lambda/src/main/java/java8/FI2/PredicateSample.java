package java8.FI2;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {


        Predicate<String> predicate  = (s) -> {
            return s.endsWith(".txt");
        };

        Predicate<String> negate = predicate.negate();

        System.out.println(predicate.test("lol.txt"));
        System.out.println(negate.test("lol.txt"));

        System.out.println(predicate.test("lol1.exe"));
        System.out.println(negate.test("lol1.exe"));

        Predicate<String> andPredicate = (s) -> {
            return s.length() == 5;
        };

        System.out.println(predicate.and(andPredicate).test("1.txt"));
        System.out.println(predicate.or(andPredicate).test("lol.txt"));



        BiPredicate<String, String> biPredicate = (s, s1) -> {
            return s.endsWith(s1);
        };

        System.out.println(biPredicate.test("lol.txt1", "txt"));

    }
}

