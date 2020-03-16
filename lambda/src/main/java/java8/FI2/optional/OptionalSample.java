package java8.FI2.optional;

import java.util.*;

public class OptionalSample {
    static User alex = new User("Alex", 34, 12);
    static User bob = new User("Bob", 12, 3);

    static List<User> users = Arrays.asList(alex, bob);
    public static void main(String[] args) throws Exception{
//        User user = getUser(3);
//
//        log(user);
//
//        User user1 = getUser(10);
//        log(user1);


        Optional<User> userByStream = getUserByStream(11);
        optionallog(userByStream);
        Optional<User> userByStream1 = getUserByStream(121);
        optionallog(userByStream1);
        System.out.println(modifySatte(userByStream1));


    }

    static User getUser (int id){
        for (User user : users) {
            if (id == user.id){
                return user;
            }
        }
        return null;
    }

    static Optional<User> getUserByStream(int id){
        return users.stream()
                .filter( u -> u.id == id)
                .findFirst();

    };

    static void log (User user){
        if(Objects.nonNull(user)){
            System.out.println("user.age " + user.age);
            System.out.println("user.name " + user.name);
            System.out.println("user.id " + user.id);
        }
        else {
            System.out.println("user is null");
        }

    }
    static void optionallog (Optional<User> user){
        user.ifPresent(user1 -> {
            System.out.println("user.age " + user1.age);
            System.out.println("user.name " + user1.name);
            System.out.println("user.id " + user1.id);
        });
    }

    static String modifySatte(Optional<User> user) throws Exception{
        return user
                .filter(user1 -> user1.age > 20)
                .map(user1 -> {
                 return user1.age + " adult";
                })
                .orElse("lol");
    }

    static String modifySatte1( User user){
        if (Objects.nonNull(user)) {
            if (user.age > 20){
                return user.name + " adult";
            }
        }
        return "lol";
    }
}

