package model;

import java.util.ArrayList;

public class Giudice extends Utente {
    private String nome;
    private String password;

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

    public Giudice(){}

    public void setGiudice(String password, String nome){
        this.password = password;
        this.nome = nome;
    }

    public String getNomeGiudice(){
        return nome;
    }
    public String getPasswordGiudice(){
        return password;
    }


}