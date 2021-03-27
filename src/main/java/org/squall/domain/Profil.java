package org.squall.domain;

public class Profil {


    private int id;
    private String libelle;

    public Profil(int id, String libelle) {
        this.id=id;
        this.libelle=libelle;
    }

    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }
}
