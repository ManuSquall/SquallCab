package org.squall.service.console;

import org.squall.domain.Profil;
import org.squall.service.IAffichageService;

// a appeller chaque fois qu'on veut aficher un service

public class AffichageService implements IAffichageService{


    

    public AffichageService() {
        
    }

    public void afficherListeProfil(Profil[] prestations) {
        System.out.println("Les profils disponibles sont:");
        for (int i = 0; i < prestations.length; i++) {
            Profil prestation = prestations[i];
            System.out.println(String.format("> %s %s", prestation.getId(), prestation.getLibelle()));
        }
    }

    public void displayGreetings(){
        System.out.println("Bienvenu sur la plateforme SquallCab!");

    }
    
    public void displayMenu(){
        System.out.println("> l - lister les profils ");
        System.out.println("> 2 - pour lister les courses ");
        System.out.println("> 3 - faire une réservation ");
        System.out.println("> 4 - Editer son compte ");

    }
    
    public void displayChauffeur(){
        // System.out.println( "Hello World!" );

    }
    
    public void displayPassager(){
        // System.out.println( "Hello World!" );

    }
    
    public void displayCourse(){
        // System.out.println( "Hello World!" );

    }
    
    public void displayReservation(){
        // System.out.println( "Hello World!" );

    }

    

    public void afficherOptionInconnue() {
        System.out.println("Choix inconnu");
    }
    
}
