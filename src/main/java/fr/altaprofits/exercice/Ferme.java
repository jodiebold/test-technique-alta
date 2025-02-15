package fr.altaprofits.exercice;

import java.util.HashSet;
import java.util.Set;

import fr.altaprofits.exercice.animal.Animal;
import fr.altaprofits.exercice.caracteristique.Navigant;
import fr.altaprofits.exercice.caracteristique.Volant;

public class Ferme extends Batiment {

    private Set<Animal> animaux = new HashSet<>();

    public void entre(Animal animal) {
        this.animaux.add(animal);
    }

    @Override
    public int nombreDelementsRoulants() {
        return 0;
    }

    @Override
    public int nombreDelementsVolants() {
        return Utils.nombreDElements(this.animaux, Volant.class);
    }

    @Override
    public int nombreDelementsNavigants() {
        return Utils.nombreDElements(this.animaux, Navigant.class);
    }

}
