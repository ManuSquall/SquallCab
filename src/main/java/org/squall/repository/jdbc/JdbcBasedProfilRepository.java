package org.squall.repository.jdbc;

import org.squall.domain.Profil;
import org.squall.repository.IProfilRepository;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcBasedProfilRepository implements IProfilRepository {


    private final DataSource dataSource;

    public JdbcBasedProfilRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Profil[] getAll()  {
        //requête sql pour récupèrer les infos
        String query = "SELECT id, libelle FROM profil";
        //mapper le résultat
        List<Profil> profils = new ArrayList<Profil>();

        try {
            Connection connection = dataSource.createConnection();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query) ;

            while (rs.next()) {
                int id = rs.getInt("id");
                String libelle = rs.getString("libelle");
                //mapping retour db (relationnel) avec objet Prestation
                Profil profil = new Profil( id, libelle);

                profils.add(profil);
            }
            return profils.toArray(new Profil[0]);

        }
        catch (SQLException e) {
            return new Profil[0];
        }
        catch (Exception ex){
            return new Profil[0];
        }

    }

    public Profil getById(int id) {
        String query = "SELECT id, libelle from profil where id = ?";
        try {
            Connection connection = dataSource.createConnection();
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            int retrievedId = rs.getInt("id");
            String retrievedName = rs.getString("libelle");
            Profil profil = new Profil(retrievedId, retrievedName);
            return profil;
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    
    
}
