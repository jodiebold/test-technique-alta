package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;
import fr.altaprofits.exercice.caracteristique.Navigant;

public class Bateau extends Vehicule implements Navigant {
    private static Integer idIndex = 0;

    public Bateau() {
        super();
        ref = refPrefix + ++idIndex;
    }
}
