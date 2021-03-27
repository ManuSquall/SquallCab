package org.squall;

import org.squall.controller.ClientController;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
         System.out.println( "SquallCab launched" );
         ClientController clientController = new ClientController();
        clientController.process();
    }
}
