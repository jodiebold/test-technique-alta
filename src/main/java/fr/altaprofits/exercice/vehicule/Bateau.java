package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.caracteristique.Navigant;

public class Bateau extends Vehicule implements Navigant {
    private static Integer idIndex = 0;

    public Bateau() {
        super();
        ref = refPrefix + ++idIndex;
    }

    @Override
    public void navigue(int x, int y) {
        super.seDeplace(x, y, "navigue");
    }

    @Override
    public void seDeplace(int x, int y) {
        navigue(x, y);
    }
}
