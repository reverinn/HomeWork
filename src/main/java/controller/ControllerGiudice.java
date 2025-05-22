package controller;

import model.Giudice;

import javax.swing.*;

public class ControllerGiudice {
    private Giudice giudice;

    public ControllerGiudice(Giudice giudice) {
        this.giudice = giudice;
    }

    public void setGiudice(String passwordGiudice, String nomeGiudice) {
        giudice.setGiudice(passwordGiudice, nomeGiudice);
    }

    public void controllaConferma(JFrame frameHome, JFrame frameGiudice, String nomeGiudice, String passwordGiudice, ControllerOrganizzatore controllerOrganizzatore) {
        if (!controllerOrganizzatore.getApertura()) {
            JOptionPane.showMessageDialog(frameGiudice, "Le iscrizioni sono chiuse!");
        } else if (nomeGiudice.toLowerCase().contains(" ") || passwordGiudice.toLowerCase().contains(" ")) {
            JOptionPane.showMessageDialog(frameGiudice, "La password non può contenere spazi iniziali o finali!");
        } else {
            if (!nomeGiudice.isEmpty() || !passwordGiudice.isEmpty()) {
                JOptionPane.showMessageDialog(frameGiudice, "Registrazione avvenuta con successo!");
                setGiudice(passwordGiudice, nomeGiudice);
            } else {
                JOptionPane.showMessageDialog(frameGiudice, "Inserire tutti i campi!");
            }
        }
    }
}
