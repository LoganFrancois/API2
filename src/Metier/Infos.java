package Metier;

import java.time.LocalDate;


public class Infos {

    private LocalDate dateLecture;
    private Employe employe;
    private Message message;


    public Infos(LocalDate dateLecture) {
        this.dateLecture = dateLecture;
    }

    public Infos(LocalDate dateLecture, Employe employe, Message message) {
        this.dateLecture = dateLecture;
        this.employe = employe;
        this.message = message;
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
}

