package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;
import fr.altaprofits.exercice.caracteristique.Roulant;

public class Voiture extends Vehicule implements Roulant {
    private static Integer idIndex = 0;

    public Voiture() {
        super();
        ref = refPrefix + ++idIndex;
    }
}
