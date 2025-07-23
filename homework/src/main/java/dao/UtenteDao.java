package dao;

import model.Utente;



public interface UtenteDao {
    void addUtente(String nomeUtente, String password, String teamScelto);
    Utente loginUtente(String nomeUtente, String password);


}
