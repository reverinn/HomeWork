package controller;

import model.Organizzatore;

import javax.swing.*;

/**
 * The type Controller login org.
 */
public class ControllerLoginOrg {
    private ControllerTeam controllerTeam;
    private boolean loginFatto = false;

    /**
     * Instantiates a new Controller login org.
     *
     * @param controllerTeam the controller team
     */
    public ControllerLoginOrg(ControllerTeam controllerTeam) {
        this.controllerTeam = controllerTeam;
    }

    /**
     * Get login fatto boolean.
     *
     * @return the boolean
     */
    public boolean getLoginFatto(){
        return loginFatto;
    }

    /**
     * Controlla password.
     *
     * @param frameLogin              the frame login
     * @param organizzatore           the organizzatore
     * @param controllerOrganizzatore the controller organizzatore
     * @param nome                    the nome
     * @param password                the password
     */
//metodo che controlla se la password corrisponde
    public void controllaPassword(JFrame frameLogin, Organizzatore organizzatore, ControllerOrganizzatore controllerOrganizzatore, String nome, String password){
        if(nome.equals(organizzatore.getNomeOrganizzatore()) && password.equals(organizzatore.getPasswordOrganizzatore())) {
            JOptionPane.showMessageDialog(frameLogin, "Login avvenuto con successo!\nle vostre credenziali: " + organizzatore.getNomeOrganizzatore() + " " + organizzatore.getPasswordOrganizzatore() + "\ne\' possibile aprire le iscrizioni ora!");
            loginFatto = true;
            controllerOrganizzatore.setPremuto(true);
        }
        else if (nome.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(frameLogin, "Non Lasciare Spazi Vuoti!");
        }
        else{
            JOptionPane.showMessageDialog(frameLogin, "Credenziali non corrette!");
        }
    }

    /**
     * Avvio iscrizioni.
     *
     * @param frameLogin the frame login
     */
//metodo che permette all'organizzatore di avviare le iscrizioni, solo se ha effettuato il login correttamente
    public void avvioIscrizioni(JFrame frameLogin){
        if (getLoginFatto()){
            JOptionPane.showMessageDialog(frameLogin, "Iscrizioni aperte!");
        }
        else{
            JOptionPane.showMessageDialog(frameLogin, "fai prima login!");
        }
    }

    /**
     * Chiudi iscrizioni.
     *
     * @param frameLogin              the frame login
     * @param controllerOrganizzatore the controller organizzatore
     */
    public void chiudiIscrizioni(JFrame frameLogin, ControllerOrganizzatore controllerOrganizzatore){
        if (getLoginFatto()){
            JOptionPane.showMessageDialog(frameLogin, "Iscrizioni chiuse!");
            controllerOrganizzatore.setPremuto(false);
            controllerTeam.creaTeam("Team Rosso", 0,  controllerTeam.getArrayTeamRosso());
            controllerTeam.creaTeam("Team Verde", 0,  controllerTeam.getArrayTeamVerde());
            controllerTeam.creaTeam("Team Blu", 0,  controllerTeam.getArrayTeamBlu());
            controllerTeam.creaTeam("Team Giallo", 0,  controllerTeam.getArrayTeamGiallo());
        }
        else{
            JOptionPane.showMessageDialog(frameLogin, "fai prima login!");
        }
    }

    /**
     * Verifica apertura iscrizioni.
     *
     * @param frameLogin              the frame login
     * @param controllerOrganizzatore the controller organizzatore
     */
//metodo che vieta all'roganizzatore di aprire le iscrizioni, solo se non ha effettuato il login correttamente
    public void verificaAperturaIscrizioni(JFrame frameLogin, ControllerOrganizzatore controllerOrganizzatore){
        if (controllerOrganizzatore.getPremuto()){
            avvioIscrizioni(frameLogin);
        }
        else{
            JOptionPane.showMessageDialog(frameLogin, "Le iscrizioni sono chiuse!\n effettua login per poterle aprire!");
        }
    }

}
