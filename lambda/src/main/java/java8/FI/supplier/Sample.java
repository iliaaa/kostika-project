package java8.FI.supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Sample {
    public static void main(String[] args) {
        Supplier<String> stringSupplier;

        stringSupplier = () -> {
            Random random = new Random();
             if (random.nextInt(10) > 5) {
                 return "more than 5";
            }
             else
                 return "less thaт 5";
        };

        for (int i = 0; i < 10; i++) {
            System.out.println("run - " + i + " " + stringSupplier.get());
        }


    }
}
