package fr.altaprofits.exercice.environnement;

import java.util.HashSet;
import java.util.Set;

import fr.altaprofits.exercice.ElementMobile;
import fr.altaprofits.exercice.animal.Animal;

public class Ferme extends Batiment {

    private Set<ElementMobile> animaux = new HashSet<>();

    @Override
    protected Set<ElementMobile> getElementsMobiles() {
        return this.animaux;
    }

    public void entre(Animal animal) {
        this.animaux.add(animal);
    }

}
