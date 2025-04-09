package com.ism.menu;

import com.ism.views.MainView;

public abstract class MainMenu {

    private MainMenu() {}
    public static void start() {
        int choice;
        do {
            choice = MainView.menu();

            switch (choice) {
                case 1:
                    // Ajout d'un proprietaire
                    break;
                case 2:
                    // Liste des proprietaire
                    break;
                case 3:
                    // Ajout d'un nouveau bien à un proprietaire
                    break;
                case 4:
                    // Liste des biens
                    break;
                default: System.out.println("Choix invalide!");
            }
        } while (choice != 0);
    }
}
