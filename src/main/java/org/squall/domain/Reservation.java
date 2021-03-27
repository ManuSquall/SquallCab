package org.squall.domain;

    public class Reservation {
        private int id;
        private String libelle;
    
        public Reservation(int id, String libelle) {
            this.id = id;
            this.libelle = libelle;
        }
    
        public int getId() {
            return id;
        }
    
        public String getLibelle() {
            return libelle;
        }
    }
