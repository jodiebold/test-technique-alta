package fr.altaprofits.exercice;

import java.util.HashSet;

import fr.altaprofits.exercice.vehicule.Vehicule;

public class Section {

    private SectionType type;

    private HashSet<Vehicule> vehicules = new HashSet<>();

    public Section(SectionType type) {
        this.type = type;
    }
    
    HashSet<Vehicule> getVehicules() {
        return vehicules;
    }

    void ajoute(Vehicule vehicule) {
        vehicules.add(vehicule);
    }

    SectionType getType() {
        return type;
    }

}
