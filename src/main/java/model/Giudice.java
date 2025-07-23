package model;

import java.util.ArrayList;

/**
 * The type Giudice.
 */
public class Giudice extends Utente {
    private String nome;
    private String password;

    /**
     * Instantiates a new Giudice.
     *
     * @param o the o
     */
//Associazione con Classe Organizzatore
    public Giudice(Organizzatore o) {
        scelto = o;
    }

    /**
     * The Scelto.
     */
    public Organizzatore scelto;

    /**
     * The Documento commentato.
     */
//Associazione con Classe Documento
    public ArrayList <Documento> documentoCommentato = new ArrayList<>();

    /**
     * Instantiates a new Giudice.
     *
     * @param d the d
     */
    public Giudice(Documento d) {
        documentoCommentato.add(d);
        d.giudiceCommentatore.add(this);
    }

    /**
     * The Voti dati.
     */
//Associazione con Voto e Piattaforma
    public ArrayList <Voto> votiDati = new ArrayList<>();
    /**
     * The Piattaforma.
     */
    Piattaforma piattaforma;

    /**
     * Instantiates a new Giudice.
     *
     * @param voto        the voto
     * @param piattaforma the piattaforma
     */
    public Giudice(Voto voto, Piattaforma piattaforma) {
        votiDati.add(voto); //aggiunge un voto alla lista dei voti da spedire alla piattaforma
        this.piattaforma = piattaforma;
    }

    /**
     * Instantiates a new Giudice.
     */
    public Giudice(){}

    /**
     * Set giudice.
     *
     * @param password the password
     * @param nome     the nome
     */
    public void setGiudice(String password, String nome){
        this.password = password;
        this.nome = nome;
    }

    /**
     * Get nome giudice string.
     *
     * @return the string
     */
    public String getNomeGiudice(){
        return nome;
    }

    /**
     * Get password giudice string.
     *
     * @return the string
     */
    public String getPasswordGiudice(){
        return password;
    }


}