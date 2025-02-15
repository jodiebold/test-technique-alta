package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;
import fr.altaprofits.exercice.caracteristique.Navigant;

public class JetSki extends Vehicule implements Navigant {
    private static Integer idIndex = 0;

    public JetSki() {
        super();
        ref = refPrefix + ++idIndex;
    }
}
