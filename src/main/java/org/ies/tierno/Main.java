package org.ies.tierno;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.ies.tierno.Ej1.put;
import static org.ies.tierno.Ej3.getPhones;

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User("15225X", "Sofia", "Diaz", "90251", "laranitakawaiuwu@gmail.com", 19),
                new User("24552G", "Luis", "Fernandez", "5845745", "chefpringao@gmail.com", 19),
                new User("55216H", "Peppa", "Pig", "90251", "qloq@gmail.com", 19)
        };
        Map<String, User> usersByNif = new HashMap<>();
        for (User user : users) {
            usersByNif = put(user);
        }

    }
}
