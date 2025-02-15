package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;
import fr.altaprofits.exercice.caracteristique.Volant;

public class Helicoptere extends Vehicule implements Volant {
    private static Integer idIndex = 0;

    public Helicoptere() {
        super();
        ref = refPrefix + ++idIndex;
    }
}
