package controller;

import model.Team;
import javax.swing.*;
import java.util.ArrayList;

public class ControllerTeam {
    private ArrayList<Team> arrayTeam = new ArrayList<>();
    private String scelta;
    public ControllerTeam() {  }

    public void setScelta(String scelta) { this.scelta = scelta; }
    public String getScelta() { return scelta; }


    public void setTeam(String nomeTeam, int voto) {
        Team team = new Team(nomeTeam, voto);
        arrayTeam.add(team);
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

    public void stampaTeam(JFrame frameGiudice) {
        for (Team team : arrayTeam) {
            JOptionPane.showMessageDialog(frameGiudice, "Nome team: " + team.getNomeSquadra() + " - Voto: " + team.getVoto());
        }
    }


}
