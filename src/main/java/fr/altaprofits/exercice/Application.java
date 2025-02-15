package fr.altaprofits.exercice;

import java.io.File;
import java.io.FileNotFoundException;

import fr.altaprofits.exercice.animal.Canard;
import fr.altaprofits.exercice.animal.Poule;
import fr.altaprofits.exercice.vehicule.Avion;
import fr.altaprofits.exercice.vehicule.Helicoptere;
import fr.altaprofits.exercice.vehicule.Hydravion;
import fr.altaprofits.exercice.vehicule.JetSki;
import fr.altaprofits.exercice.vehicule.Moto;

public class Application {
    public static void main(String[] args) throws FileNotFoundException {
        Hangar hangar = new Hangar();

        Moto moto1 = new Moto();
        Avion avion1 = new Avion();
        Avion avion2 = new Avion();
        Helicoptere helico1 = new Helicoptere();
        JetSki jetSki1 = new JetSki();
        Hydravion hydravion1 = new Hydravion();
        Hydravion hydravion2 = new Hydravion();

        hangar.entre(moto1);
        hangar.entre(avion1);
        hangar.entre(avion2);
        hangar.entre(helico1);
        hangar.entre(jetSki1);
        hangar.entre(hydravion1);
        hangar.entre(hydravion2);

        hangar.imprimerToutDansConsole();
        hangar.imprimerToutDansFichier(new File("vehicles.txt"));

        System.out.println("Nombre de v�hicule dans le hangar : " + hangar.nombreDeVehiculeDansHangar());
        System.out.println("Nombre de v�hicule dans l'a�roport : " + hangar.nombreDeVehiculesDansAeroport());
        System.out.println("Nombre de v�hicule dans le garage : " + hangar.nombreDeVehiculesDansGarage());
        System.out.println("Nombre de v�hicule dans le port : " + hangar.nombreDeVehiculeDansPort());

        avion1.seDeplace(10, 30);
        avion1.seDeplace(30, 60);
        avion2.seDeplace(25, 55);
        helico1.seDeplace(23, 11);
        jetSki1.seDeplace(3, 9);
        hydravion1.seDeplace(5, 2);
        hydravion1.seDeplace(6, 3);
        hydravion2.seDeplace(10, 0);
        hydravion2.seDeplace(15, 10);

        Ferme ferme = new Ferme();
        Poule poule1 = new Poule();
        Poule poule2 = new Poule();
        Canard canard1 = new Canard();

        ferme.entre(poule1);
        ferme.entre(poule2);
        ferme.entre(canard1);

        Environnement environnement = new Environnement();
        environnement.add(hangar);
        environnement.add(ferme);
        
        System.out.println("Nombre d'éléments volants dans l'environnement: " + environnement.nombreDelementsVolants());
        System.out.println("Nombre d'éléments roulants dans l'environnement: " + environnement.nombreDelementsRoulants());
        System.out.println("Nombre d'éléments navigants dans l'environnement: " + environnement.nombreDelementsNavigants());
    }
}
