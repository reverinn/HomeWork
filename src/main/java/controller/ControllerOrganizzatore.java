package controller;

import model.Organizzatore;
import gui.OrganizzatoreGUI;

import javax.swing.*;

public class ControllerOrganizzatore {
    private Organizzatore organizzatore;

    public ControllerOrganizzatore(Organizzatore organizzatore){
        this.organizzatore = organizzatore;
    }

    public void setOrganizzatore(String passwordOrganizzatore, String nomeOrganizzatore){
        organizzatore.setOrganizzatore(passwordOrganizzatore, nomeOrganizzatore);
    }

    public void mostraOrganizzatore(JFrame frame, String passwordOrganizzatore, String nomeOrganizzatore){
        organizzatore.GetOrganizzatore(frame, passwordOrganizzatore, nomeOrganizzatore);
    }
}
