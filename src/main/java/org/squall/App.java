package org.squall;

import java.util.Scanner;

import org.squall.service.AffichageService;
import org.squall.service.InputMenuService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // System.out.println( "Hello World!" );

        Scanner scanner = new Scanner(System.in);

        AffichageService affichageService = new AffichageService();
        InputMenuService inputMenuService = new InputMenuService();

        //afficher le message de bienvenue
        affichageService.displayGreetings();


        //afficher le menu
        affichageService.displayMenu();

        String menu = scanner.next();


        //selon le choix du menu

        //affficher la liste des chauffeurs
        affichageService.displayChauffeur();

        //afficher la liste des passagers
        affichageService.displayPassager();
        
        //affficher la liste des chauffeurs
        affichageService.displayCourse();

        //afficher la liste des passagers
        affichageService.displayReservation();
        
        //affficher la liste des courses d'un chauffeur
        affichageService.displayCourse();

        //afficher la liste des réservations d'un passagers
        affichageService.displayReservation();
        
        //afficher la liste des réservations d'une course
        affichageService.displayReservation();
    }
}
