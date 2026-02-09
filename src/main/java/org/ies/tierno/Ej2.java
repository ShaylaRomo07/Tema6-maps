package org.ies.tierno;

import java.util.Map;

public class Ej2 {
    public static String getPhoneByNif(Map<String, User> usersByNif, String nif) {
        if (usersByNif.containsKey(nif)) {
            User user = usersByNif.get(nif);
            return user.getPhoneNumber();
        }
        return null;
    }
}
