package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.caracteristique.Volant;

public class Helicoptere extends Vehicule implements Volant {
    private static Integer idIndex = 0;

    public Helicoptere() {
        super();
        ref = refPrefix + ++idIndex;
    }

    @Override
    public void vole(int x, int y) {
        super.seDeplace(x, y, "vole");
    }

    @Override
    public void seDeplace(int x, int y) {
        vole(x, y);
    }
}
