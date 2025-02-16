package fr.altaprofits.exercice.environnement;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import fr.altaprofits.exercice.ElementMobile;
import fr.altaprofits.exercice.caracteristique.Navigant;
import fr.altaprofits.exercice.caracteristique.Roulant;
import fr.altaprofits.exercice.caracteristique.Volant;
import fr.altaprofits.exercice.vehicule.Vehicule;

public class Hangar extends Batiment {
	
	private HashSet<Section> sections = new HashSet<>();

	public Hangar() {
		this.sections.add(new Section(SectionType.AEROPORT));
		this.sections.add(new Section(SectionType.GARAGE));
		this.sections.add(new Section(SectionType.PORT));
	}

	public void entre(Vehicule vehicule) {
		if (vehicule instanceof Vehicule) {
			SectionType sectionType = null;
			if (vehicule instanceof Navigant) {
				sectionType = SectionType.PORT;
			} else if (vehicule instanceof Roulant) {
				sectionType = SectionType.GARAGE;
			} else if (vehicule instanceof Volant) {
				sectionType = SectionType.AEROPORT;
			}
			getSectionByType(sectionType).ajoute(vehicule);
			vehicule.setSectionType(sectionType);
		}
	}

	private Section getSectionByType(SectionType type) {
        return this.sections.stream().filter(s -> type.equals(s.getType())).findFirst().get();
    }

	public int nombreDeVehiculesDansAeroport() {
		return getSectionByType(SectionType.AEROPORT).getVehicules().size();
	}

	public int nombreDeVehiculesDansGarage() {
		return getSectionByType(SectionType.GARAGE).getVehicules().size();
	}

	public int nombreDeVehiculeDansPort() {
		return getSectionByType(SectionType.PORT).getVehicules().size();
	}

	public int nombreDeVehiculeDansHangar() {
		return nombreElementsMobiles();
	}

	@Override
	public Set<ElementMobile> getElementsMobiles() {
		return this.sections.stream().flatMap(s -> s.getVehicules().stream()).collect(Collectors.toSet());
	}
}
