package java8.streams.generate;

import java.util.Random;
import java.util.stream.Stream;

public class Sample {
    public static void main(String[] args) {
        Random random = new Random();
        Stream
                .generate(() -> random.nextInt(100))
                .limit(20)
                .forEach(System.out::println );
    }
}
