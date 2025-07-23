package model;

import java.util.ArrayList;

/**
 * The type Documento.
 */
public class Documento {
    /**
     * The Nome documento.
     */
//Attributi Classe Associativa
    public String nomeDocumento;
    /**
     * The Versione rilascio.
     */
    public double versioneRilascio;
    /**
     * The Orario aggiornamento.
     */
    public String orarioAggiornamento;

    /**
     * The Giudice commentatore.
     */
//Associazione Classe Giudice
    public ArrayList <Giudice> giudiceCommentatore = new ArrayList<>();

    /**
     * The Team caricatori.
     */
//Classe Associativa Team e Piattaforma
    public ArrayList <Team> teamCaricatori = new ArrayList<>();
    /**
     * The Piattaforma.
     */
    public Piattaforma piattaforma;

    /**
     * Instantiates a new Documento.
     *
     * @param nomeDocumento       the nome documento
     * @param versioneRilascio    the versione rilascio
     * @param orarioAggiornamento the orario aggiornamento
     * @param team                the team
     * @param piattaforma         the piattaforma
     */
    public Documento(String nomeDocumento, double versioneRilascio, String orarioAggiornamento, Team team, Piattaforma piattaforma) {
        this.nomeDocumento = nomeDocumento;
        this.versioneRilascio = versioneRilascio;
        this.orarioAggiornamento = orarioAggiornamento;
        this.piattaforma = piattaforma;
        teamCaricatori.add(team); //aggiungo i team alla lista dei team che hanno caricato un documento
    }

}