package org.ies.tierno;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User("15225X", "Sofia", "Diaz", "90251", "laranitakawaiuwu@gmail.com", 19),
                new User("24552G", "Luis", "Fernandez", "5845745", "chefpringao@gmail.com", 19),
                new User("55216H", "Peppa", "Pig", "90251", "qloq@gmail.com", 19)
        };
        Map<String, User> usersByNif = put(users);
        String phoneNumber = getPhoneByNif(usersByNif, "55216H");
    }

    public static Map<String, User> put(User[] users) {
        Map<String, User> usersByNif = new HashMap<>();
        for (User user : users) {
            usersByNif.put(user.getNif(), user);
        }
        return usersByNif;
    }

    public static String getPhoneByNif(Map<String, User> usersByNif, String nif) {
        if (usersByNif.containsKey(nif)) {
            User user = usersByNif.get(nif);
            System.out.println(user.getPhoneNumber());
            return user.getPhoneNumber();
        }
        return null;
    }
}
