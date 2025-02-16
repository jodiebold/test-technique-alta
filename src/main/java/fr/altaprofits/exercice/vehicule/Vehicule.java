package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.ElementMobile;
import fr.altaprofits.exercice.environnement.SectionType;

public abstract class Vehicule extends ElementMobile {

    protected SectionType sectionType;

    protected void seDeplace(int x, int y, String action) {
        super.seDeplace(x, y, action, Vehicule.class.getSimpleName());
    }

    public void setSectionType(SectionType sectionType) {
       this.sectionType = sectionType;
    }
}