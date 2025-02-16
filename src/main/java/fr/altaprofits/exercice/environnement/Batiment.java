package fr.altaprofits.exercice.environnement;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Set;

import fr.altaprofits.exercice.ElementMobile;
import fr.altaprofits.exercice.Utils;
import fr.altaprofits.exercice.caracteristique.Navigant;
import fr.altaprofits.exercice.caracteristique.Roulant;
import fr.altaprofits.exercice.caracteristique.Volant;

public abstract class Batiment {

    protected int nombreDelementsRoulants() {
        return Utils.nombreDElements(getElementsMobiles(), Roulant.class);
    }

    protected int nombreDelementsVolants() {
        return Utils.nombreDElements(getElementsMobiles(), Volant.class);
    }

    protected int nombreDelementsNavigants() {
        return Utils.nombreDElements(getElementsMobiles(), Navigant.class);
    }

    public void imprimerToutDansConsole() {
		System.out.println(getElementsMobilesListMessage());
	}

	private String getElementsMobilesListMessage() {
		StringBuilder sb = new StringBuilder();
        for (ElementMobile elementMobile : getElementsMobiles()) {
            sb.append(elementMobile).append(System.lineSeparator());
        }
		return sb.toString();
	}

	public void imprimerToutDansFichier(File f) throws FileNotFoundException {
		PrintStream printStream = new PrintStream(new FileOutputStream(f));
		printStream.println(getElementsMobilesListMessage());
	}

    protected abstract Set<ElementMobile> getElementsMobiles();

    protected int nombreElementsMobiles() {
        return getElementsMobiles().size();
    }

}
