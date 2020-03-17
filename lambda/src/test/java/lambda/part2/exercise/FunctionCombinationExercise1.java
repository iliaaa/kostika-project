package lambda.part2.exercise;

import data.Person;
import org.junit.Test;

import java.util.function.Predicate;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FunctionCombinationExercise1 {

    @Test
    public void personHasNotEmptyLastNameAndFirstName0() {
        // TODO Person -> boolean
        Predicate<Person> validate = null;

        assertTrue(validate.test(new Person("a", "b", 0)));
        assertFalse(validate.test(new Person("", "b", 0)));
        assertFalse(validate.test(new Person("a", "", 0)));
    }

    // TODO
    // negate1: (Person -> boolean) -> (Person -> boolean)
    private Predicate<Person> negate1(Predicate<Person> test) {
        return null;
    }

    // TODO
    // validateFirstNameAndLastName: (Person -> boolean, Person -> boolean) -> (Person -> boolean)
    private Predicate<Person> validateFirstNameAndLastName(Predicate<Person> t1, Predicate<Person> t2) {
        return null;
    }

    @Test
    public void personHasNotEmptyLastNameAndFirstName1() {
        Predicate<Person> hasEmptyFirstName = p -> p.getFirstName().isEmpty();
        Predicate<Person> hasEmptyLastName = p -> p.getLastName().isEmpty();

        Predicate<Person> validateFirstName = negate1(hasEmptyFirstName);
        Predicate<Person> validateLastName = negate1(hasEmptyLastName);

        Predicate<Person> validate = validateFirstNameAndLastName(validateFirstName, validateLastName);

        assertTrue(validate.test(new Person("a", "b", 0)));
        assertFalse(validate.test(new Person("", "b", 0)));
        assertFalse(validate.test(new Person("a", "", 0)));
    }

    // TODO
    // negate: (T -> boolean) -> (T -> boolean)
    private <T> Predicate<T> negate(Predicate<T> test) {
        return null;
    }

    // TODO
    // and: (T -> boolean, T -> boolean) -> (T -> boolean)
    private <T> Predicate<T> and(Predicate<T> t1, Predicate<T> t2) {
        return null;
    }

    @Test
    public void personHasNotEmptyLastNameAndFirstName2() {
        Predicate<Person> hasEmptyFirstName = p -> p.getFirstName().isEmpty();
        Predicate<Person> hasEmptyLastName = p -> p.getLastName().isEmpty();

        Predicate<Person> validateFirstName = negate(hasEmptyFirstName);
        Predicate<Person> validateLastName = negate(hasEmptyLastName);

        Predicate<Person> validate = and(validateFirstName, validateLastName);

        assertTrue(validate.test(new Person("a", "b", 0)));
        assertFalse(validate.test(new Person("", "b", 0)));
        assertFalse(validate.test(new Person("a", "", 0)));
    }

    @Test
    public void personHasNotEmptyLastNameAndFirstName3() {
        Predicate<Person> hasEmptyFirstName = p -> p.getFirstName().isEmpty();
        Predicate<Person> hasEmptyLastName = p -> p.getLastName().isEmpty();

        Predicate<Person> validateFirstName = hasEmptyFirstName.negate();
        Predicate<Person> validateLastName = hasEmptyLastName.negate();

        Predicate<Person> validate = validateFirstName.and(validateLastName);

        assertTrue(validate.test(new Person("a", "b", 0)));
        assertFalse(validate.test(new Person("", "b", 0)));
        assertFalse(validate.test(new Person("a", "", 0)));
    }

}
