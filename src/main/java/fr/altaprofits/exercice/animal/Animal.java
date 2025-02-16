package fr.altaprofits.exercice.animal;

import fr.altaprofits.exercice.ElementMobile;

public abstract class Animal extends ElementMobile {

    protected void seDeplace(int x, int y, String action) {
        super.seDeplace(x, y, action, Animal.class.getSimpleName());
    }

}
