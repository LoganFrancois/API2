package Metier;

import java.time.LocalDate;

public class Employe {

    private static int idEmployeAct = 0;
    private int idEmploye;
    private String mail;
    private String nom;
    private String prenom;
    private Bureau bureau;

    public Employe(int idEmploye, String mail, String nom, String prenom, Bureau bureau) {
        this.idEmploye = ++idEmployeAct;
        this.mail = mail;
        this.nom = nom;
        this.prenom = prenom;
        this.bureau = bureau;
    }

    public Employe(String mail, String nom, String prenom, Bureau bureau) {
        this.mail = mail;
        this.nom = nom;
        this.prenom = prenom;
        this.bureau = bureau;
    }

    public Employe(String mail) {
        this.mail = mail;
    }


    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Bureau getBureau() {
        return bureau;
    }

    public void setBureau(Bureau bureau) {
        this.bureau = bureau;
    }


    @Override
    public String toString() {
        return "Employe{" +
                "idEmploye=" + idEmploye +
                ", mail='" + mail + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", bureau=" + bureau +
                '}';
    }
}
