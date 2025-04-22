package model;

import model.*;
import java.util.ArrayList;

public class Giudice extends Utente {

    //Associazione con Classe Organizzatore
    public Giudice(Organizzatore o) {
        scelto = o;
    }
    public Organizzatore scelto;

    //Associazione con Classe Documento
    public ArrayList <Documento> documentoCommentato = new ArrayList<>();
    public Giudice(Documento d) {
        documentoCommentato.add(d);
        d.giudiceCommentatore.add(this);
    }

    //Associazione con Voto e Piattaforma
    public ArrayList <Voto> votiDati = new ArrayList<>();
    Piattaforma piattaforma;
    public Giudice(Voto voto, Piattaforma piattaforma) {
        votiDati.add(voto); //aggiunge un voto alla lista dei voti da spedire alla piattaforma
        this.piattaforma = piattaforma;
    }

}
