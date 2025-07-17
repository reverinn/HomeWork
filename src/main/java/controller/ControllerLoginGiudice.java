package controller;

import javax.swing.*;
import java.util.ArrayList;

public class ControllerLoginGiudice {
    private boolean loginFattoGiudice = false;

    public ControllerLoginGiudice(){}

    //restituisce se il login è stato effettuato oppure no, utile per impedire certe operazioni prima di aver fatto il login
    public boolean getLoginFattoGiudice(){
        return loginFattoGiudice;
    }

    //metodo che controlla se la password corrisponde o se i campi inseriti sono validi
    //DA TORNARCI DOPO! NON TOCCARE!
    public void controllaPassword(JFrame frameLoginGiudice, String nome, String password){
        if (nome.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(frameLoginGiudice, "Inserire tutti i campi!");
        }
        else if (nome.contains(" ") || password.contains(" ") ) {
            JOptionPane.showMessageDialog(frameLoginGiudice, "I campi non possono contenere spazi!");
        }
        else{
            JOptionPane.showMessageDialog(frameLoginGiudice, "Credenziali non corrette!");
        }

    }


    //metodo per salvare all'interno di un arraylist i voti inseriti dal giudice
    public void assegnaVoto(JFrame frameLogin, ControllerTeam controllerTeam, String teamSelezionato, int voto){
        if (getLoginFattoGiudice()) {
            controllerTeam.setTeam(teamSelezionato, voto);
        }
        else{
            JOptionPane.showMessageDialog(frameLogin, "Effettua login per poter votare!");
        }
    }

    //metodo che pubblica il vincitore della gara
    public void stampaClassifica (JFrame frameLogin, ControllerTeam controllerTeam) {
        if (getLoginFattoGiudice()) {
            controllerTeam.stampaTeam(frameLogin);
        }
        else {
            JOptionPane.showMessageDialog(frameLogin, "Effettua login per poter votare!");
        }
    }
}
