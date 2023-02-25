package Metier;


import java.time.LocalDate;
import java.util.Objects;

/**
 * Classe métier de gestion d'un centre de partage d'email
 *
 * @author Logan Francois
 */

public class Bureau {

    /**
     * Générateur statique de l'id d'un bureau
     */
    private static int idBureauAct = 0;

    /**
     * identifiant unique du bureau
     */
    private int idBureau;

    /**
     * sigle UNIQUE du bureau
     */
    private String sigle;

    /**
     * tel du bureau
     */
    private String tel;


    /**
     * Constructeur par défaut
     */

    public Bureau() {
    }

    public Bureau(String sigle) {
        this.sigle = sigle;
    }

    /**
     * Constructeur paramétré
     *
     * @param idBureau   identifiant unique du bureau affecté par la base de données
     * @param sigle      sigle unique du bureau
     * @param tel        telephone du bureau
     */

    public Bureau(int idBureau, String sigle, String tel) {
        this.idBureau = idBureau;
        this.sigle = sigle;
        this.tel = tel;
    }



    /**
     * getter idBureau
     *
     * @return identifiant du bureau
     */

    public int getIdBureau() {
        return idBureau;
    }

    /**
     * setter idBureau
     *
     * @param idBureau identifiant du bureau
     */


    public void setIdBureau(int idBureau) {
        this.idBureau = idBureau;
    }

    /**
     * getter sigle
     *
     * @return sigle unique du bureau
     */
    public String getSigle() {
        return sigle;
    }

    /**
     * setter sigle
     *
     * @param sigle    sigle unique du bureau
     */

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }



    /**
     * getter tel du bureau
     *
     * @return telephone du bureau
     */
    public String getTel() {
        return tel;
    }

    /**
     * setter idBureau
     *
     * @param tel telephone du bureau
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Bureau{" +
                "idBureau=" + idBureau +
                ", sigle='" + sigle + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
