package fr.altaprofits.exercice;

import fr.altaprofits.exercice.caracteristique.Navigant;
import fr.altaprofits.exercice.caracteristique.Roulant;
import fr.altaprofits.exercice.caracteristique.Volant;
import fr.altaprofits.exercice.vehicule.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Hangar {
	
	private HashSet<Section> sections = new HashSet<>();

	public Hangar() {
		this.sections.add(new Section(SectionType.AEROPORT));
		this.sections.add(new Section(SectionType.GARAGE));
		this.sections.add(new Section(SectionType.PORT));
	}

	public void entre(Vehicule vehicule) {
		if (vehicule instanceof Navigant) {
			getSectionByType(SectionType.PORT).ajoute(vehicule);
		} else if (vehicule instanceof Roulant) {
			getSectionByType(SectionType.GARAGE).ajoute(vehicule);
		} else if (vehicule instanceof Volant) {
			getSectionByType(SectionType.AEROPORT).ajoute(vehicule);
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
		return this.sections.stream().map(s -> s.getVehicules().size()).reduce(0, (a, b) -> a + b);
	}

	public void imprimerToutDansConsole() {
		System.out.println(getVehiculesListMessage());
	}

	private String getVehiculesListMessage() {
		StringBuilder sb = new StringBuilder();
		for (Section section : sections) {
			for (Vehicule vehicule : section.getVehicules()) {
				sb.append(vehicule).append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

	public void imprimerToutDansFichier(File f) throws FileNotFoundException {
		PrintStream printStream = new PrintStream(new FileOutputStream(f));
		printStream.println(getVehiculesListMessage());
	}
}
