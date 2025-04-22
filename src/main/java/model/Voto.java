package model;

import java.util.ArrayList;
import model.*;

public class Voto {
    public int valoreVoto;
    private int idGiudice; //riconoscitivo del singolo giudice che da il voto
    public String nomeSquadra;

    //Classe Associativa Giudice e Piattaforma
    Giudice giudice;
    Piattaforma piattaforma;
    public Voto(String nomeSquadra, Piattaforma piattaforma, Giudice giudice) {
        this.nomeSquadra = nomeSquadra;
        this.piattaforma = piattaforma;
        this.giudice = giudice;
    }

}
