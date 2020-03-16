package java8.FI.bipredicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Sample {
    public static void main(String[] args) {
        Predicate<String> predicate;
        predicate = (String::isEmpty);
        predicate = s -> s.isEmpty();
        System.out.println(predicate.test("ssss"));

        System.out.println(test());
        System.out.println(testBiPredicate());
    }

    public static boolean test(){
        Predicate<String> predicate1;
        String s = new String("ololo.sss");
        predicate1 = s::endsWith;

        Predicate<String> predicate = st -> st.endsWith("sss");
        System.out.println("test " + predicate.test("ololo.sss"));
        Predicate<String> negate = predicate.negate();
        System.out.println("test negate " + negate.test("ololo.sss"));
        Predicate<String> andPredicate = s1 -> s1.contains("lol");
        Predicate<String> orPredicate = s1 -> s1.contains("lol");
        System.out.println("test and " + predicate.and(andPredicate).test("ol1olo.sss"));
        System.out.println("test or " + predicate.or(orPredicate).test("ol1olo.sss"));
        return predicate1.test("sss");
    }

    public static boolean testBiPredicate(){
        BiPredicate<String, String> biPredicate;
        biPredicate = String::contains;
        return biPredicate.test("lolo.ssso", "lol");
    }
}
