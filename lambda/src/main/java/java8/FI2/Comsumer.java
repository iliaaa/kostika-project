package java8.FI2;

import javax.crypto.spec.PSource;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

class ComsumerSample {
    public static void main(String[] args) {
        User tom = new User("Tom", true, 100);
        User jack = new User("Jack", false, 100);

        Consumer<User> userConsumer = user -> {
            if (user.isIll) {
                user.setName(user.getName() + " is ill");
            }
        };
//        System.out.println(tom.getName());
//        userConsumer.accept(tom);
//        System.out.println(tom.getName());
//
//        System.out.println(jack.getName());
//        userConsumer.accept(jack);
//        System.out.println(jack.getName());

        Consumer<User> lifeConsumer = user -> {
            if (user.isIll()) {
                user.setLifeBar(user.getLifeBar() - 35);
            }
        };

        System.out.println(tom.getName());
        System.out.println(tom.getLifeBar());
        userConsumer.andThen(lifeConsumer).accept(tom);
        System.out.println(tom.getLifeBar());
        System.out.println(tom.getName());

        System.out.println(jack.getName());
        System.out.println(jack.getLifeBar());
        userConsumer.andThen(lifeConsumer).accept(jack);
        System.out.println(jack.getLifeBar());
        System.out.println(jack.getName());


    }
}
