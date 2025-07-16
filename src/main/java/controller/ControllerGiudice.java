package controller;

import model.Giudice;

import javax.swing.*;

public class ControllerGiudice {

    public ControllerGiudice() {}

    public void setGiudice(Giudice giudice, String passwordGiudice, String nomeGiudice) {
        giudice.setGiudice(passwordGiudice, nomeGiudice);
    }

    public Giudice getGiudice(Giudice giudice) { return giudice.getGiudice();}
    public String getNomeGiudice(Giudice giudice) { return giudice.getNomeGiudice(); }
    public String getPasswordGiudice(Giudice giudice) { return giudice.getPasswordGiudice(); }

    //metodo per controllare che i campi non siano vuoti e che non contengano spazi ed se tutto va bene setta i dati al giudice
    public void controllaConferma(Giudice giudice, JFrame frameGiudice, String nomeGiudice, String passwordGiudice, ControllerOrganizzatore controllerOrganizzatore) {
        if (!controllerOrganizzatore.getPremuto()) {
            JOptionPane.showMessageDialog(frameGiudice, "Le iscrizioni sono chiuse!");
        } else if (nomeGiudice.toLowerCase().contains(" ") || passwordGiudice.toLowerCase().contains(" ")) {
            JOptionPane.showMessageDialog(frameGiudice, "La password non può contenere spazi iniziali o finali!");
        } else {
            if (!nomeGiudice.isEmpty() || !passwordGiudice.isEmpty()) {
                JOptionPane.showMessageDialog(frameGiudice, "Registrazione avvenuta con successo!");
                setGiudice(giudice, passwordGiudice, nomeGiudice);
            } else {
                JOptionPane.showMessageDialog(frameGiudice, "Inserire tutti i campi!");
            }
        }
    }


}
