package com.ftninformatika.termin17_z1;

import java.util.ArrayList;
import java.util.List;

public class NamesProvider {

    private static List<String> names;

    private static void init() {
        if (names == null){
            names = new ArrayList<>();
            names.add("Pera");
            names.add("Mika");
            names.add("Djoka");
            //provera da li ima nesto u listi, ako nema onda dodaje
            //moze lista jela sa zadataka sa 14. vezbi

        }

    }

    public static List<String> getAllNames() {
        init();
        return names;

    }

    public static String getNameById(int id) {
        init();
        if ((id >= 0) && (id < names.size())) {
            return names.get(id);
                    // ako su jela, onda idem for-i preko id-jeva
        }
        return null;
    }

}
