package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.ElementMobile;
import fr.altaprofits.exercice.Point;
import fr.altaprofits.exercice.caracteristique.Navigant;

public class JetSki extends Vehicule implements Navigant {
    private static Integer idIndex = 0;

    public JetSki() {
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
