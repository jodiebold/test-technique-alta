package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.caracteristique.Navigant;
import fr.altaprofits.exercice.caracteristique.Volant;

public class Hydravion extends Vehicule implements Navigant, Volant {

    private static Integer idIndex = 0;

    public Hydravion() {
        super();
        ref = refPrefix + ++idIndex;
    }

}
