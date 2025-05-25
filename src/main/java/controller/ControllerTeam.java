package controller;

import model.Team;

import javax.swing.*;

public class ControllerTeam {
    private Team team;
    private String scelta;
    public ControllerTeam(Team team) { this.team = team; }

    public void setScelta(String scelta) { this.scelta = scelta; }
    public String getScelta(String scelta) { return scelta; }

    //permette di confermare la scelta se niente è andato storto
    public void controllaOK(JFrame frameHome, JFrame frameTeam, String selTeam, ControllerOrganizzatore controllerOrganizzatore){
        if (!controllerOrganizzatore.getApertura()) {
            JOptionPane.showMessageDialog(frameTeam, "Le iscrizioni sono chiuse!");
        } else {
            JOptionPane.showMessageDialog(frameTeam, "Scelta avvenuta con successo!");
            frameTeam.setVisible(false);
            frameHome.setVisible(true);
            JOptionPane.showMessageDialog(frameTeam, "Selezionato: " + getScelta(selTeam));
        }
    }

    //permette di inviare il documento al team se le iscrizioni sono state aperte dall'organizzatore
    public void controllaCaricamento(JFrame frameTeam, ControllerOrganizzatore controllerOrganizzatore){
        if (!controllerOrganizzatore.getApertura()) {
            JOptionPane.showMessageDialog(frameTeam, "Le iscrizioni sono chiuse!");
        } else {
            JOptionPane.showMessageDialog(frameTeam, "Documento inviato con successo!");
            frameTeam.setVisible(false);
        }
    }

}
