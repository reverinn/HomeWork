package dao;

import model.Utente;


/**
 * The interface Utente dao.
 */
public interface UtenteDao {
    /**
     * Add utente.
     *
     * @param nomeUtente the nome utente
     * @param password   the password
     * @param teamScelto the team scelto
     */
    void addUtente(String nomeUtente, String password, String teamScelto);

    /**
     * Login utente utente.
     *
     * @param nomeUtente the nome utente
     * @param password   the password
     * @return the utente
     */
    Utente loginUtente(String nomeUtente, String password);


}
