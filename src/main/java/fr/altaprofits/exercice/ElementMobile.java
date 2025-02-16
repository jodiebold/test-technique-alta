package fr.altaprofits.exercice;

import java.util.Objects;

import fr.altaprofits.exercice.caracteristique.Mobile;
import fr.altaprofits.exercice.environnement.Section;
import fr.altaprofits.exercice.vehicule.Vehicule;

public abstract class ElementMobile implements Mobile {

    protected String refPrefix;
    protected String ref;
    protected Point position;

    public ElementMobile() {
        position = new Point(0, 0);
        refPrefix = this.getClass().getSimpleName().substring(0, 3) + "-";
    }

    protected void seDeplace(int x, int y, String action, String type) {
        Point destination = new Point(x, y);
        System.out.printf(type + " de type " + toString() + " " + action + " de la position %s vers %s\n", position, destination);
        position = destination;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " (Ref : " + ref + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ElementMobile elementMobile = (ElementMobile) obj;
        return Objects.equals(ref, elementMobile.ref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref);
    }
}
