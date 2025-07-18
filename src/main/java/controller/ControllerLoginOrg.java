package controller;

import model.Organizzatore;

import javax.swing.*;

public class ControllerLoginOrg {
    private ControllerTeam controllerTeam;
    private Organizzatore organizzatore;
    private boolean loginFatto = false;

    public ControllerLoginOrg(Organizzatore organizzatore, ControllerTeam controllerTeam) {
        this.organizzatore = organizzatore;
        this.controllerTeam = controllerTeam;
    }

    public boolean getLoginFatto(){
        return loginFatto;
    }

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

    //metodo che permette all'organizzatore di avviare le iscrizioni, solo se ha effettuato il login correttamente
    public void avvioIscrizioni(JFrame frameLogin){
        if (getLoginFatto()){
            JOptionPane.showMessageDialog(frameLogin, "Iscrizioni aperte!");
        }
        else{
            JOptionPane.showMessageDialog(frameLogin, "fai prima login!");
        }
    }

    public void chiudiIscrizioni(JFrame frameLogin, ControllerOrganizzatore controllerOrganizzatore){
        if (getLoginFatto()){
            JOptionPane.showMessageDialog(frameLogin, "Iscrizioni chiuse!");
            controllerOrganizzatore.setPremuto(false);
            controllerTeam.creaTeam("Team Rosso", 0,  controllerTeam.getArrayTeamRosso());
            controllerTeam.creaTeam("Team Verde", 0,  controllerTeam.getArrayTeamVerde());
            controllerTeam.creaTeam("Team Blu", 0,  controllerTeam.getArrayTeamBlu());
            controllerTeam.creaTeam("Team Giallo", 0,  controllerTeam.getArrayTeamGiallo());
            controllerTeam.stampaClassificaTeam(frameLogin);
        }
        else{
            JOptionPane.showMessageDialog(frameLogin, "fai prima login!");
        }
    }

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
