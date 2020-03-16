package java8.lambda.methodRefernce.constructor.example;

import java8.lambda.methodRefernce.constructor.model.User;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Bob", "Alex", "Tom", "Jack");
        List<User> users = produceUsers(strings, User::new);

        System.out.println(users);

    }

    static List<User> produceUsers(List<String> names, FI fi){
        List<User> users = new LinkedList<>();
        for (String name : names) {
            users.add(fi.convert(name));
        }
        return users;
    }
}
