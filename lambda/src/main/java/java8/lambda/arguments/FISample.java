package java8.lambda.arguments;

public class FISample {
    public static void main(String[] args) {
        FI <Integer> powTwo = i -> {
            return ((Double) Math.pow(i, 2)).intValue();
        };

        FI <String> toUpper = String::toUpperCase;


        System.out.println(test1(10, powTwo));

        System.out.println(test1("ssdd", toUpper));

    }

    private static <T> T test1(T value, FI<T> action){
        return action.doAction(value);

    }
}
