package org.squall.service;

import org.squall.domain.Profil;

public interface IAffichageService {
    void displayGreetings();
    void displayMenu();
    // void displayCourse();
    // void displayReservation();
    // void displayChauffeur();
    void afficherOptionInconnue();
    
    void afficherListeProfil(Profil[] profils);

    //void displayProfil();
    //void displayUser(Profil profil);
}
