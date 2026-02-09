package org.ies.tierno;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ej5 {
    public static List<String> getNifs(Map<String, User> usersByNif){
        List<String> nifs=new ArrayList<>();
        for(String nif: usersByNif.keySet()){
            nifs.add(nif);
        }
        return nifs;
    }
}
