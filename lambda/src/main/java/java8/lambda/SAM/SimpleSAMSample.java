package java8.lambda.SAM;

import java.util.Random;

public class SimpleSAMSample {
    public static void main(String[] args) {
        SimpleSAM getString = () -> "SSDD";

        System.out.println(getString.action());

        SimpleSAM convertRandomInt = () -> {
            Random random = new Random();
            return String.valueOf(random.nextInt(100));
        };

        System.out.println(convertRandomInt.action());
    }
}
