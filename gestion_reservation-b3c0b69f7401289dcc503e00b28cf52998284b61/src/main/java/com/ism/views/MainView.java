package com.ism.views;

import com.ism.data.models.Proprietaire;

import java.util.List;
import java.util.Scanner;

public abstract class MainView {
    private static final Scanner scanner = new Scanner(System.in);

    private MainView(){}

    public static int menu() {
        System.out.println("1. Ajouter un propriétaire dans une liste");
        System.out.println("2. Lister les propriétaires");
        System.out.println("3. Ajouter un nouveau bien à un propriétaire");
        System.out.println("0. Afficher la liste des biens d'un propriétaire");
        System.out.println("0. Lister les biens");
        System.out.println("Faites votre choix : ");

        return Integer.parseInt(scanner.nextLine());
    }

    public static Proprietaire create() {
        System.out.println("========= Enregistrer un propriétaire =========");

        System.out.println("Noms : ");
        String noms = scanner.nextLine();

        System.out.println("Prénoms : ");
        String prenoms = scanner.nextLine();

        System.out.println("Téléphone : ");
        String telephone = scanner.nextLine();

        System.out.println("Adresse : ");
        String adresse = scanner.nextLine();


        return null;
    }

    public static void show(List<Proprietaire> proprietaires) {
        System.out.println("========= Liste des proprietaires =========");
        if(proprietaires.isEmpty()) {
            System.out.println("Aucun proprietaire trouvé.");
        } else {
            for (Proprietaire proprietaire : proprietaires) {
                System.out.println(proprietaire);
            }
        }
    }

    public static int inputIdentifiant() {
        System.out.println("Veuillez saisir l'identifiant du proprietaire : ");
        return Integer.parseInt(scanner.nextLine());
    }
}
