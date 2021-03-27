package org.squall.domain;

public class Course {
    private int id;
    private String provenance, destination, date;
    private long prix;
    private Vehicule vehicule;
    private User client, chauffeur;

    public Course(int id, String provenance, String destination, String date, long prix, User client, User chauffeur, Vehicule vehicule) {
        this.id = id;
        this.provenance = provenance;
        this.destination = destination;
        this.date = date;
        this.prix = prix;
        this.vehicule = vehicule;
        this.client = client;
        this.chauffeur = chauffeur;
    }

    public int getId() {
        return id;
    }

    public String getProvenance() {
        return provenance;
    }
    
    public String getDestination() {
        return destination;
    }

    public String getDate() {
        return date;
    }

    public long getPrix() {
        return prix;
    }

    public User getClient() {
        return client;
    }
    
    public User getChauffeur() {
        return chauffeur;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }
}
