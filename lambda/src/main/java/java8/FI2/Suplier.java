package java8.FI2;

import java.util.function.Supplier;

class SupplierSample {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> {
            for (int i = 1; i < 10; i++) {
                if (i % 2 == 0 ){
                    return "return " + String.valueOf(i);
                }
            }
            return "dd";
        };


        System.out.println(supplier.get());
    }
}
