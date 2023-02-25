package Metier;
import java.time.LocalDate;

public class Message {


    private static int idMessageAct = 0;
    private int idMessage;
    private String objet;
    private String contenu;
    private LocalDate dateEnvoi;
    private Employe employe;


    public Message(int idMessage, String objet, String contenu, LocalDate dateEnvoi, Employe employe) {
        this.idMessage = ++idMessageAct;
        this.objet = objet;
        this.contenu = contenu;
        this.dateEnvoi = dateEnvoi;
        this.employe = employe;
    }


    public Message(String objet, String contenu, LocalDate dateEnvoi, Employe employe) {
        this.objet = objet;
        this.contenu = contenu;
        this.dateEnvoi = dateEnvoi;
        this.employe = employe;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public LocalDate getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(LocalDate dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    @Override
    public String toString() {
        return "Message{" +
                "idMessage=" + idMessage +
                ", objet='" + objet + '\'' +
                ", contenu='" + contenu + '\'' +
                ", dateEnvoi=" + dateEnvoi +
                ", employe=" + employe +
                '}';
    }
}