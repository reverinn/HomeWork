package controller;

import model.Utente;
import java.util.ArrayList;
import javax.swing.*;

public class ControllerUtente {
    ArrayList<Utente> arrayUtente = new ArrayList<>();


    public void setUtente(String nomeUtente, String passwordUtente) {
        Utente nuovoUtente = new Utente(nomeUtente, passwordUtente);
        arrayUtente.add(nuovoUtente);
    }

    public ArrayList<Utente> getArrayUtente() {
        return arrayUtente;
    }

    public void stampaArrayUtente() {
        for (int i = 0; i < arrayUtente.size(); i++) {
            System.out.println("Utente [" + i + "] : " + arrayUtente.get(i) + "\n");
        }
    }

    //metodo che controlla i vari casi del pulsante conferma
    public void controllaConferma(JFrame frameHome, JFrame frameUtente, String nomeUtente, String passwordUtente, ControllerOrganizzatore controllerOrganizzatore) {
        if (!controllerOrganizzatore.getPremuto()){
            JOptionPane.showMessageDialog(frameUtente,"Le iscrizioni sono chiuse!");
        }
        else if (nomeUtente.toLowerCase().contains(" ") || passwordUtente.toLowerCase().contains(" ")){
            JOptionPane.showMessageDialog(frameUtente, "La password non può contenere spazi iniziali o finali!");
        }
        else {
            if (!nomeUtente.isEmpty() && !passwordUtente.isEmpty()) {
                JOptionPane.showMessageDialog(frameUtente, "Registrazione avvenuta con successo!");
                setUtente(nomeUtente, passwordUtente);
            } else {
                JOptionPane.showMessageDialog(frameUtente, "Inserire tutti i campi!");
            }
        }
    }


}
