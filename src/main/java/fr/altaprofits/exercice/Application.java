package fr.altaprofits.exercice;

import java.io.File;
import java.io.FileNotFoundException;

import fr.altaprofits.exercice.vehicule.Avion;
import fr.altaprofits.exercice.vehicule.Helicoptere;
import fr.altaprofits.exercice.vehicule.JetSki;
import fr.altaprofits.exercice.vehicule.Moto;

public class Application {
    public static void main(String[] args) {
        Hangar hangar = new Hangar();

        Moto moto1 = new Moto();
        Avion avion1 = new Avion();
        Avion avion2 = new Avion();
        Helicoptere helico1 = new Helicoptere();
        JetSki jetSki1 = new JetSki();

        hangar.entre(moto1);
        hangar.entre(avion1);
        hangar.entre(avion2);
        hangar.entre(helico1);
        hangar.entre(jetSki1);

        hangar.imprimerToutDansConsole();

        System.out.println("Nombre de v�hicule dans le hangar : " + hangar.nombreDeVehiculeDansHangar());
        System.out.println("Nombre de v�hicule dans l'a�roport : " + hangar.nombreDeVehiculesDansAeroport());
        System.out.println("Nombre de v�hicule dans le garage : " + hangar.nombreDeVehiculesDansGarage());
        System.out.println("Nombre de v�hicule dans le port : " + hangar.nombreDeVehiculeDansPort());

        avion1.seDeplace(10, 30);
        avion1.seDeplace(30, 60);
        avion2.seDeplace(25, 55);
        helico1.seDeplace(23, 11);
        jetSki1.seDeplace(3, 9);

        try {
            hangar.imprimerToutDansFichier(new File("vehicles.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
