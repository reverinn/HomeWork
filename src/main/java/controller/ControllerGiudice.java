package controller;

import model.Giudice;
import model.Voto;

import javax.swing.*;
import java.util.ArrayList;

public class ControllerGiudice {
    private Giudice giudice;
    private ArrayList<Voto> votiClassifica = new ArrayList<>();

    public ControllerGiudice(Giudice giudice) {
        this.giudice = giudice;
    }

    public void setGiudice(Giudice giudice, String passwordGiudice, String nomeGiudice) {
        giudice.setGiudice(passwordGiudice, nomeGiudice);
    }

    //metodo per controllare che i campi non siano vuoti e che non contengano spazi ed se tutto va bene setta i dati al giudice
    public void controllaConferma(Giudice giudice, JFrame frameHome, JFrame frameGiudice, String nomeGiudice, String passwordGiudice, ControllerOrganizzatore controllerOrganizzatore) {
        if (!controllerOrganizzatore.getApertura()) {
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
