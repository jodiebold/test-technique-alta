package fr.altaprofits.exercice.animal;

import fr.altaprofits.exercice.caracteristique.Volant;

public class Poule extends Animal implements Volant {
    
    private static Integer idIndex = 0;

    public Poule() {
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
