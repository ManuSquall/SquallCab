package org.squall.domain;

public class Vehicule {
    private int id;
    private String matricule, description;
    private User proprietaire;


    public Vehicule(int id, String matricule, User proprietaire, String description) {
        this.id = id;
        this.matricule = matricule;
        this.proprietaire = proprietaire;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getMatricule() {
        return matricule;
    }

    public User getProprietaire() {
        return proprietaire;
    }

    public String getString() {
        return description;
    }
}
