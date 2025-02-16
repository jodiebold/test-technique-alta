package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.caracteristique.Volant;

public class Avion extends Vehicule implements Volant {

    private static Integer idIndex = 0;

    public Avion() {
        super();
        ref = refPrefix + ++idIndex;
    }

    @Override
    public void seDeplace(int x, int y) {
        vole(x, y);
    }

    @Override
    public void vole(int x, int y) {
        super.seDeplace(x, y, "vole");
    }


}
