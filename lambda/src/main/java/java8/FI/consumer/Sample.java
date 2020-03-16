package java8.FI.consumer;

import java8.FI.supplier.Val;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Sample {
    public static void main(String[] args) {
        Consumer<Val> stringConsumer;

        stringConsumer = v -> {
            v.setValue(v.getValue() + " ---> lol <--- ");
        };

        Val kek = new Val("kek");
        stringConsumer.accept(kek);

        System.out.println(kek.getValue());


        Consumer<Val> then;

        then = val -> {
            Random random = new Random();
            val.setValue(val.getValue() + " " + random.nextInt(10));
        };


        for (int i = 0; i < 10; i++) {
            stringConsumer.accept(kek);
            Consumer<Val> valConsumer = stringConsumer.andThen(then);
            valConsumer.accept(kek);
            System.out.println("run " + i + " " + kek.getValue());
        }

        BiConsumer<Val, String> biConsumer;
        biConsumer = (v, s) -> {
            v.setValue(v.getValue() + " " + s);
        };

        Val aaaa = new Val("aaaa");
        String s2 = "str2";

        biConsumer.accept(aaaa, s2);

        System.out.println("bi consumer - " + aaaa.getValue());


    }
}
