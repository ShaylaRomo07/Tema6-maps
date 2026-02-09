package org.ies.tierno;

import java.util.HashMap;
import java.util.Map;

public class Ej1 {
    public static Map<String, User> put(User user) {
        Map<String, User> usersByNif = new HashMap<>();
        usersByNif.put(user.getNif(), user);
        return usersByNif;
    }
}
