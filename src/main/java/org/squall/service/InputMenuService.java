package org.squall.service;

import java.util.Scanner;

/**
 * Affiche le menu utilisateur
 * interprète les choix de l'utilisateur
 * et affiche en retour le sous menu
 */

public class InputMenuService implements IInputMenuService{

    private IAffichageService affichageService;
    private final Scanner scanner;

    public void processListing(){
        this.scanner = new Scanner(in);
    }

    public void processListOfCourse(){

    }
    
}
