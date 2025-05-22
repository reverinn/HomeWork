package controller;

import model.Organizzatore;
import gui.OrganizzatoreGUI;

import javax.swing.*;

public class ControllerOrganizzatore {
    private Organizzatore organizzatore;
    private boolean apertura;

    public ControllerOrganizzatore(Organizzatore organizzatore){
        this.organizzatore = organizzatore;
    }

    public void setOrganizzatore(String passwordOrganizzatore, String nomeOrganizzatore){
        organizzatore.setOrganizzatore(passwordOrganizzatore, nomeOrganizzatore);
    }

    public void setApertura(boolean apertura){
        organizzatore.setApertura(apertura);
    }

    public boolean getApertura(){
        return organizzatore.getApertura();
    }

    public void Avvio(JFrame frame, boolean apertura){
        if (getApertura()){
            JOptionPane.showMessageDialog(frame, "Le iscrizioni sono aperte!");
        }
        else{
            JOptionPane.showMessageDialog(frame, "Le iscrizioni sono chiuse!");
        }
    }
}
