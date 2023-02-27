package Metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Infos {

    private LocalDate dateLecture;
    private Employe employe;
    private int idMessage;


    public Infos(LocalDate dateLecture) {
        this.dateLecture = dateLecture;
    }

    public Infos(LocalDate dateLecture, Employe employe) {
        this.dateLecture = dateLecture;
        this.employe = employe;

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


}


