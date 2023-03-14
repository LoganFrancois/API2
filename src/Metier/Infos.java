package Metier;

import Metier.Employe;
import Metier.Message;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Infos {
    private LocalDate dateLecture;
    private Employe employe;
    private Message message; // Référence à un objet de la classe Message
    private int idMessage; // Identifiant du message

    public Infos(LocalDate dateLecture) {
        this.dateLecture = dateLecture;
    }

    public Infos(LocalDate dateLecture, Employe employe, Message message) {
        this.dateLecture = dateLecture;
        this.employe = employe;
        this.message = message;
    }

    public Infos(LocalDate dateLecture, Employe employe, int idMessage) {
        this.dateLecture = dateLecture;
        this.employe = employe;
        this.idMessage = idMessage;
    }

    public LocalDate getDateLecture() {
        return dateLecture;
    }

    public void setDateLecture(LocalDate dateLecture) {
        this.dateLecture = dateLecture;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }
}