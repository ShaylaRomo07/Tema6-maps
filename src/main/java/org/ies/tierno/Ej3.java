package org.ies.tierno;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.ies.tierno.Ej2.getPhoneByNif;

public class Ej3 {
    public static List<String> getPhones(Map<String, User> usersByNif) {
        List<String> phoneNumbers= new ArrayList<>();
        for (User user : usersByNif.values()) {
            phoneNumbers.add(getPhoneByNif(usersByNif, user.getNif()));
        }
        return phoneNumbers;
    }
}
