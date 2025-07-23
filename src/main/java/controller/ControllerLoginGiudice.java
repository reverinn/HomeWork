package controller;

import model.Giudice;

import javax.swing.*;

/**
 * The type Controller login giudice.
 */
public class ControllerLoginGiudice {
    private boolean loginFattoGiudice = false;
    private boolean giudiceRegistrato = false;
    /**
     * The Giudice.
     */
    Giudice giudice = new Giudice();
    private ControllerTeam controllerTeam;

    /**
     * Instantiates a new Controller login giudice.
     *
     * @param controllerTeam the controller team
     */
    public ControllerLoginGiudice(ControllerTeam controllerTeam){
        this.controllerTeam = controllerTeam;
    }

    /**
     * Get login fatto giudice boolean.
     *
     * @return the boolean
     */
//restituisce se il login è stato effettuato oppure no, utile per impedire certe operazioni prima di aver fatto il login
    public boolean getLoginFattoGiudice(){
        return loginFattoGiudice;
    }

    /**
     * Controlla password.
     *
     * @param frameLoginGiudice the frame login giudice
     * @param nome              the nome
     * @param password          the password
     */
//metodo che controlla se la password corrisponde o se i campi inseriti sono validi
    public void controllaPassword(JFrame frameLoginGiudice, String nome, String password){
        if (!giudiceRegistrato){
            JOptionPane.showMessageDialog(frameLoginGiudice, "Effettua prima la registrazione!");
        }
        else if (nome.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(frameLoginGiudice, "Inserire tutti i campi!");
        }
        else if (nome.contains(" ") || password.contains(" ") ) {
            JOptionPane.showMessageDialog(frameLoginGiudice, "I campi non possono contenere spazi!");
        }
        else if (giudice.getNomeGiudice().equals(nome) && giudice.getPasswordGiudice().equals(password)) {
            JOptionPane.showMessageDialog(frameLoginGiudice, "Login avvenuta con successo!");
            loginFattoGiudice = true;
        }
        else{
            JOptionPane.showMessageDialog(frameLoginGiudice, "Credenziali non corrette!");
        }
    }

    /**
     * Registra.
     *
     * @param frameLoginGiudice the frame login giudice
     * @param nome              the nome
     * @param password          the password
     */
//permette all'utente di registrarsi
    public void registra(JFrame frameLoginGiudice, String nome, String password){
        if (nome.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(frameLoginGiudice, "Inserire tutti i campi!");
        }
        else if (nome.contains(" ") || password.contains(" ") ) {
            JOptionPane.showMessageDialog(frameLoginGiudice, "I campi non possono contenere spazi!");
        }
        else{
            JOptionPane.showMessageDialog(frameLoginGiudice, "Iscrizione avvenuta con successo!");
            giudice.setGiudice(nome,password);
            giudiceRegistrato = true;
        }
    }


    /**
     * Assegna voto.
     *
     * @param frameLogin      the frame login
     * @param teamSelezionato the team selezionato
     * @param voto            the voto
     */
//metodo per salvare all'interno di un arraylist i voti inseriti dal giudice
    public void assegnaVoto(JFrame frameLogin, String teamSelezionato, int voto){
        if (getLoginFattoGiudice()) {
            switch (teamSelezionato) {
                case "Team Rosso":
                    controllerTeam.setVoto(voto, "Team Rosso");
                    break;
                case "Team Verde":
                    controllerTeam.setVoto(voto, "Team Verde");
                    break;
                case "Team Blu":
                    controllerTeam.setVoto(voto, "Team Blu");
                    break;
                case "Team Giallo":
                    controllerTeam.setVoto(voto, "Team Giallo");
                    break;
                default:
                    break;
            }
        }
        else{
            JOptionPane.showMessageDialog(frameLogin, "Effettua login per poter votare!");
        }
    }

    /**
     * Stampa classifica.
     *
     * @param frameLoginGiudice the frame login giudice
     */
//metodo che pubblica il vincitore della gara
    public void stampaClassifica (JFrame frameLoginGiudice) {
        if (getLoginFattoGiudice()) {
            controllerTeam.stampaClassificaTeam(frameLoginGiudice);
        }
        else {
            JOptionPane.showMessageDialog(frameLoginGiudice, "Effettua login per poter votare!");
        }
    }
}
