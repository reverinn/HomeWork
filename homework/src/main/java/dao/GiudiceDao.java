package dao;
import model.Giudice;

import java.util.ArrayList;
import java.util.List;


public interface GiudiceDao {
    void addGiudice(String nomeUtente, String passwordGiudice);
    void assegnaVoto(String nomeGiudice, String nomeTeam, int voto);
    void stampaClassifiche(ArrayList<String> team, ArrayList<Integer> voti);
}
