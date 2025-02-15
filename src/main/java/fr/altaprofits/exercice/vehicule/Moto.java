package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;
import fr.altaprofits.exercice.caracteristique.Roulant;

public class Moto extends Vehicule implements Roulant {
    private static Integer idIndex = 0;

    public Moto() {
        super();
        ref = refPrefix + ++idIndex;
    }
}
