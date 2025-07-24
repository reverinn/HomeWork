package controller;

import model.Team;
import model.Utente;

import javax.swing.*;
import java.util.ArrayList;

/**
 * The type Controller team.
 */
public class ControllerTeam {
    /**
     * The Array team rosso.
     */
    protected ArrayList<Utente> arrayTeamRosso = new ArrayList<>(3);
    /**
     * The Array team verde.
     */
    protected ArrayList<Utente> arrayTeamVerde = new ArrayList<>(3);
    /**
     * The Array team blu.
     */
    protected ArrayList<Utente> arrayTeamBlu = new ArrayList<>(3);
    /**
     * The Array team giallo.
     */
    protected ArrayList<Utente> arrayTeamGiallo = new ArrayList<>(3);
    private ArrayList<Team> arrayTeam = new ArrayList<>(4);
    private String scelta;

    /**
     * Instantiates a new Controller team.
     */
    public ControllerTeam() {  }

    /**
     * Sets scelta.
     *
     * @param scelta the scelta
     */
    public void setScelta(String scelta) { this.scelta = scelta; }

    /**
     * Gets scelta.
     *
     * @return the scelta
     */
    public String getScelta() { return scelta; }


    /**
     * Aggiungi utente al team.
     *
     * @param nomeTeam the nome team
     * @param utente   the utente
     */
    public void aggiungiUtenteAlTeam(String nomeTeam, Utente utente) {
        switch (nomeTeam) {
            case "Team Rosso":
                arrayTeamRosso.add(utente);
                break;
            case "Team Verde":
                arrayTeamVerde.add(utente);
                break;
            case "Team Blu":
                arrayTeamBlu.add(utente);
                break;
            case "Team Giallo":
                arrayTeamGiallo.add(utente);
                break;
            default:
                break;
        }
    }

    /**
     * Crea team.
     *
     * @param nomeSquadra the nome squadra
     * @param voto        the voto
     * @param utente      the utente
     */
    public void creaTeam(String nomeSquadra, int voto, ArrayList<Utente> utente){
        Team team = new Team(nomeSquadra, voto, utente);
        team.setVoto(voto);
        arrayTeam.add(team);
    }

    /**
     * Sets voto.
     *
     * @param voto        the voto
     * @param nomeSquadra the nome squadra
     */
    public void setVoto(int voto, String nomeSquadra) {
        for (Team team : arrayTeam) {
            if (team.getNomeSquadra().equalsIgnoreCase(nomeSquadra)) {
                team.setVoto(voto);
            }
        }
    }

    /**
     * Controlla ok.
     *
     * @param frameHome               the frame home
     * @param frameTeam               the frame team
     * @param selTeam                 the sel team
     * @param controllerOrganizzatore the controller organizzatore
     */
//permette di confermare la scelta se niente è andato storto
    public void controllaOK(JFrame frameHome, JFrame frameTeam, String selTeam, ControllerOrganizzatore controllerOrganizzatore){
        if (!controllerOrganizzatore.getPremuto()) {
            JOptionPane.showMessageDialog(frameTeam, "Le iscrizioni sono chiuse!");
        } else {
            JOptionPane.showMessageDialog(frameTeam, "Scelta avvenuta con successo!");
            setScelta(selTeam);
            JOptionPane.showMessageDialog(frameTeam, "Selezionato: " + getScelta());
        }
    }


    /**
     * Controlla caricamento.
     *
     * @param frameTeam               the frame team
     * @param controllerOrganizzatore the controller organizzatore
     */
//permette di inviare il documento al team se le iscrizioni sono state aperte dall'organizzatore
    public void controllaCaricamento(JFrame frameHome, JFrame frameTeam, ControllerOrganizzatore controllerOrganizzatore){
        if (!controllerOrganizzatore.getPremuto()) {
            JOptionPane.showMessageDialog(frameTeam, "Le iscrizioni sono chiuse!");
        } else {
            JOptionPane.showMessageDialog(frameTeam, "Documento inviato con successo!");
            frameTeam.setVisible(false);
            frameHome.setVisible(true);
        }
    }

    /**
     * Stampa classifica team.
     *
     * @param frameGiudice the frame giudice
     */
    public void stampaClassificaTeam(JFrame frameGiudice) {
      for (Team team : arrayTeam) {
          JOptionPane.showMessageDialog(frameGiudice, team.toString());
      }
    }

    /**
     * Gets array team rosso.
     *
     * @return the array team rosso
     */
    public ArrayList<Utente> getArrayTeamRosso() {
        return arrayTeamRosso;
    }

    /**
     * Gets array team verde.
     *
     * @return the array team verde
     */
    public ArrayList<Utente> getArrayTeamVerde() {
        return arrayTeamVerde;
    }

    /**
     * Gets array team blu.
     *
     * @return the array team blu
     */
    public ArrayList<Utente> getArrayTeamBlu() {
        return arrayTeamBlu;
    }

    /**
     * Gets array team giallo.
     *
     * @return the array team giallo
     */
    public ArrayList<Utente> getArrayTeamGiallo() {
        return arrayTeamGiallo;
    }

    /**
     * Gets array team.
     *
     * @return the array team
     */
    public ArrayList<Team> getArrayTeam() {
        return arrayTeam;
    }
}
