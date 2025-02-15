package fr.altaprofits.exercice;

import java.util.Collection;

public class Utils {

    public static int nombreDElements(Collection<?> coll, Class<?> type) {
        return (int) coll.stream().filter(type::isInstance).count();
    }

}
