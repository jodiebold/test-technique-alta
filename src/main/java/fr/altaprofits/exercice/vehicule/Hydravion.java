package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.caracteristique.Navigant;
import fr.altaprofits.exercice.caracteristique.Volant;
import fr.altaprofits.exercice.environnement.SectionType;

public class Hydravion extends Vehicule implements Navigant, Volant {

    private static Integer idIndex = 0;

    public Hydravion() {
        super();
        ref = refPrefix + ++idIndex;
    }

    @Override
    public void vole(int x, int y) {
        super.seDeplace(x, y, "vole");
    }

    @Override
    public void navigue(int x, int y) {
        super.seDeplace(x, y, "navigue");
    }

    @Override
    public void seDeplace(int x, int y) {
        if (SectionType.AEROPORT.equals(sectionType)) {
            vole(x, y);
        } else if (SectionType.PORT.equals(sectionType)) {
            navigue(x, y);
        }
    }

}
