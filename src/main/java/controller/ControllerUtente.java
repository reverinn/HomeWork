package controller;

import model.Utente;
import java.util.ArrayList;
import javax.swing.*;

public class ControllerUtente extends ControllerTeam{
    private ArrayList<Utente> arrayUtenti = new ArrayList<>();
    public ControllerUtente() { super(); }

    //metodo che controlla i vari casi del pulsante conferma
    public void controllaConferma(JFrame frameUtente, String nomeUtente, String passwordUtente, ControllerOrganizzatore controllerOrganizzatore, String teamScelto) {
        if (!controllerOrganizzatore.getPremuto()){
            JOptionPane.showMessageDialog(frameUtente,"Le iscrizioni sono chiuse!");
        }
        else if (nomeUtente.toLowerCase().contains(" ") || passwordUtente.toLowerCase().contains(" ")){
            JOptionPane.showMessageDialog(frameUtente, "La password non può contenere spazi iniziali o finali!");
        }
        else {
            if (!nomeUtente.isEmpty() && !passwordUtente.isEmpty() && !teamScelto.contains("-")) {
                JOptionPane.showMessageDialog(frameUtente, "Registrazione avvenuta con successo!");
                Utente utente = new Utente(nomeUtente, passwordUtente, teamScelto);
                arrayUtenti.add(utente);
                aggiungiUtenteAlTeam(teamScelto, utente);
            } else {
                JOptionPane.showMessageDialog(frameUtente, "Inserire tutti i campi!");
            }
        }
    }


}
