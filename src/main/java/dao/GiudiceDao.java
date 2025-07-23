package dao;
import model.Giudice;

import java.util.ArrayList;
import java.util.List;


/**
 * The interface Giudice dao.
 */
public interface GiudiceDao {
    /**
     * Add giudice.
     *
     * @param nomeUtente      the nome utente
     * @param passwordGiudice the password giudice
     */
    void addGiudice(String nomeUtente, String passwordGiudice);

    /**
     * Assegna voto.
     *
     * @param nomeGiudice the nome giudice
     * @param nomeTeam    the nome team
     * @param voto        the voto
     */
    void assegnaVoto(String nomeGiudice, String nomeTeam, int voto);

    /**
     * Stampa classifiche.
     *
     * @param team the team
     * @param voti the voti
     */
    void stampaClassifiche(ArrayList<String> team, ArrayList<Integer> voti);
}
