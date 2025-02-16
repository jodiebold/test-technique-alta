package fr.altaprofits.exercice.environnement;

import java.util.HashSet;
import java.util.Objects;

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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Section section = (Section) obj;
        return Objects.equals(type, section.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

}
