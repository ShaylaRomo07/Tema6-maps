package org.ies.tierno;

import java.util.Map;

public class Ej6 {
    public static void changePhoneNumber(Map<String, User> usersByNif, String nif, String phoneNumber) {
        if (usersByNif.containsKey(nif)) {
            User user = usersByNif.get(nif);
            user.setPhoneNumber(phoneNumber);
        }
    }
}
