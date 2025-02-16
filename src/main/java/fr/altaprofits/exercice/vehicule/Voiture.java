package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.caracteristique.Roulant;

public class Voiture extends Vehicule implements Roulant {
    private static Integer idIndex = 0;

    public Voiture() {
        super();
        ref = refPrefix + ++idIndex;
    }

    @Override
    public void roule(int x, int y) {
        super.seDeplace(x, y, "roule");
    }

    @Override
    public void seDeplace(int x, int y) {
        roule(x, y);
    }
}
