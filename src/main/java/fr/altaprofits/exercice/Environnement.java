package fr.altaprofits.exercice;

import java.util.HashSet;
import java.util.Set;

public class Environnement {

    private Set<Batiment> batiments = new HashSet<>();

    public Environnement() {
    }

    public int nombreDelementsVolants() {
        return this.batiments.stream().mapToInt(Batiment::nombreDelementsVolants).sum();
    }

    public int nombreDelementsRoulants() {
        return this.batiments.stream().mapToInt(Batiment::nombreDelementsRoulants).sum();
    }

    public int nombreDelementsNavigants() {
        return this.batiments.stream().mapToInt(Batiment::nombreDelementsNavigants).sum();
    }

    public void add(Batiment batiment) {
        this.batiments.add(batiment);
    }

}
