package fr.altaprofits.exercice.vehicule;

import fr.altaprofits.exercice.Point;

public class Vehicule {

    protected String refPrefix;
    protected String ref;
    protected Point position;

    public Vehicule() {
        position = new Point(0, 0);
        refPrefix = this.getClass().getSimpleName().substring(0, 3) + "-";
    }

    public void seDeplace(int x, int y) {
        Point destination = new Point(x, y);
        System.out.printf(toString() + ", se d�place de la position %s vers %s\n", position, destination);
        position = destination;
    }

    public String toString() {
        return "Vehicule de type " + this.getClass().getSimpleName() + " (Ref : " + ref + ")";
    }
}
