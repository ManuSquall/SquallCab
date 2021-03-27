package org.squall.service.console;


import org.squall.domain.Profil;
import org.squall.repository.IProfilRepository;
import org.squall.service.IAffichageService;
import org.squall.service.IInputMenuService;

/**
 * Affiche le menu utilisateur
 * interprète les choix de l'utilisateur
 * et affiche en retour le sous menu
 */

import java.util.Scanner;


public class InputMenuService implements IInputMenuService{

    private IAffichageService affichageService;
    private final Scanner scanner;
    private final IProfilRepository IProfilRepository;

    public InputMenuService(IAffichageService affichageService, IProfilRepository IProfilRepository) {
        this.affichageService = affichageService;
        this.IProfilRepository = IProfilRepository;
        this.scanner = new Scanner(System.in);
    }


    private String lireChoix() {
        return scanner.next();
    }


    private void afficherMenu( String choix) {
        Profil[] profils = IProfilRepository.getAll();
        affichageService.afficherListeProfil(profils);

        if("l".equalsIgnoreCase(choix)){
            int choice = scanner.nextInt();

            // //get prestation by id
            // Prestation prestation = prestationRepository.getById(idPrestation);
            // //get prestataires by prestation
            // Prestataire[] prestataires = prestataireRepository.getAllByPrestation(prestation);
            // //afficher les prestataires qui fournissent ce service
            // displayService.afficherListeProfil();

            // int idPrestataire = scanner.nextInt();
            // Prestataire prestataire = prestataireRepository.findById(idPrestataire);
            // if(2 == idPrestataire){
            //     displayService.afficherDetailsPrestation();

            //     int idDetailPrestation = scanner.nextInt();
            //     if(3 == idDetailPrestation){
            //         displayService.afficherDetailsContrat();
            //         displayService.afficherDemandeHeure();
            //         String heure = scanner.next();
            //         displayService.afficherConfirmation(heure);
            //     }
            // }
        }
        //afficher le menu inconnu
        else {
            affichageService.afficherOptionInconnue();
        }
    }

    
    
    
    public void afficherMenu() {
        String choix = lireChoix();
        afficherMenu(choix );
    }
    
}
