package controller;

import model.Team;
import model.Utente;

import javax.swing.*;
import java.util.ArrayList;

public class ControllerTeam {
    protected ArrayList<Utente> arrayTeamRosso = new ArrayList<>(3);
    protected ArrayList<Utente> arrayTeamVerde = new ArrayList<>(3);
    protected ArrayList<Utente> arrayTeamBlu = new ArrayList<>(3);
    protected ArrayList<Utente> arrayTeamGiallo = new ArrayList<>(3);
    private ArrayList<Team> arrayTeam = new ArrayList<>(4);
    private String scelta;
    public ControllerTeam() {  }

    public void setScelta(String scelta) { this.scelta = scelta; }
    public String getScelta() { return scelta; }


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

    public void creaTeam(String nomeSquadra, int voto, ArrayList<Utente> utente){
        Team team = new Team(nomeSquadra, voto, utente);
        team.setVoto(voto);
        arrayTeam.add(team);
    }

    public void setVoto(int voto, String nomeSquadra) {
        for (Team team : arrayTeam) {
            if (team.getNomeSquadra().equalsIgnoreCase(nomeSquadra)) {
                team.setVoto(voto);
            }
        }
    }

    //permette di confermare la scelta se niente è andato storto
    public void controllaOK(JFrame frameHome, JFrame frameTeam, String selTeam, ControllerOrganizzatore controllerOrganizzatore){
        if (!controllerOrganizzatore.getPremuto()) {
            JOptionPane.showMessageDialog(frameTeam, "Le iscrizioni sono chiuse!");
        } else {
            JOptionPane.showMessageDialog(frameTeam, "Scelta avvenuta con successo!");
            setScelta(selTeam);
            frameTeam.setVisible(false);
            frameHome.setVisible(true);
            JOptionPane.showMessageDialog(frameTeam, "Selezionato: " + getScelta());
        }
    }


    //permette di inviare il documento al team se le iscrizioni sono state aperte dall'organizzatore
    public void controllaCaricamento(JFrame frameTeam, ControllerOrganizzatore controllerOrganizzatore){
        if (!controllerOrganizzatore.getPremuto()) {
            JOptionPane.showMessageDialog(frameTeam, "Le iscrizioni sono chiuse!");
        } else {
            JOptionPane.showMessageDialog(frameTeam, "Documento inviato con successo!");
            frameTeam.setVisible(false);
        }
    }

    public void stampaClassificaTeam(JFrame frameGiudice) {
      for (Team team : arrayTeam) {
          JOptionPane.showMessageDialog(frameGiudice, team.toString());
      }
    }

    public ArrayList<Utente> getArrayTeamRosso() {
        return arrayTeamRosso;
    }
    public ArrayList<Utente> getArrayTeamVerde() {
        return arrayTeamVerde;
    }
    public ArrayList<Utente> getArrayTeamBlu() {
        return arrayTeamBlu;
    }
    public ArrayList<Utente> getArrayTeamGiallo() {
        return arrayTeamGiallo;
    }
    public ArrayList<Team> getArrayTeam() {
        return arrayTeam;
    }
}
