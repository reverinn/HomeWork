package dao;
import model.Organizzatore;


/**
 * The interface Organizzatore dao.
 */
public interface OrganizzatoreDao {
    /**
     * Add organizzatore.
     *
     * @param nomeUtente the nome utente
     * @param password   the password
     */
    void addOrganizzatore(String nomeUtente, String password);
}
