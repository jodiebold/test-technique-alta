package fr.altaprofits.exercice.animal;

import fr.altaprofits.exercice.Point;
import fr.altaprofits.exercice.caracteristique.Navigant;
import fr.altaprofits.exercice.caracteristique.Volant;

public class Canard extends Animal implements Volant, Navigant {

    private static Integer idIndex = 0;

    public Canard() {
        super();
        ref = refPrefix + ++idIndex;
    }

    @Override
    public void navigue(int x, int y) {
        super.seDeplace(x, y, "navigue");
    }

    @Override
    public void vole(int x, int y) {
        super.seDeplace(x, y, "vole");
    }

    @Override
    public void seDeplace(int x, int y) {
        
    }

}
