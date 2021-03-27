package org.squall.domain;

    
public class User {

    
    private int id;
    private String nomComplet;
    private String tel;
    private String adresse;
    private String email;
    private String login;
    private String mdp;
    private Profil profil;

    public User(int id, String nomComplet, String tel, String adresse, String email, String login, String mdp, Profil profil) {
        this.id = id;
        this.nomComplet = nomComplet;
        this.tel = tel;
        this.adresse = adresse;
        this.email = email;
        this.login = login;
        this.mdp = mdp;
        this.profil = profil;
    }

    public int getId() {
        return id;
    }

    public String getNomComplet() {
        return nomComplet;
    }

    public String getTel() {
        return tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public Profil getProfil() {
        return profil;
    }
}
