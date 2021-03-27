package org.squall.controller;



import org.squall.repository.IProfilRepository;
import org.squall.service.console.InputMenuService;
import org.squall.service.console.AffichageService;
import org.squall.service.IAffichageService;
import org.squall.service.IInputMenuService;
import org.squall.repository.jdbc.JdbcBasedProfilRepository;
import org.squall.repository.jdbc.MysqlDataSource;
import org.squall.repository.jdbc.DataSource;


public class ClientController {

    private final IAffichageService displayService ;
    private final IInputMenuService scannerMenuService ;

    public ClientController(){
        DataSource dataSource = new MysqlDataSource();
        displayService = new AffichageService();
        IProfilRepository prestationRepository = new JdbcBasedProfilRepository(dataSource);
        scannerMenuService = new InputMenuService(displayService, prestationRepository);
    }
    
    
    public void process(){

        displayService.displayGreetings();
        displayService.displayMenu();
        scannerMenuService.afficherMenu();
    }
}
