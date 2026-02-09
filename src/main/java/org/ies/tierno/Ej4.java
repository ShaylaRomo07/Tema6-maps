package org.ies.tierno;

import java.util.Map;

public class Ej4 {
    public static void eliminateUser(Map<String, User> usersByNif, String nif){
        if (usersByNif.containsKey(nif)) {
            usersByNif.remove(nif);
            System.out.println("Eliminacion completa");
        }else{
            System.out.println("No existe este usuario");
        }
    }
}
