package controller;

import model.Organizzatore;

import javax.swing.*;

public class ControllerLoginOrg {
    private Organizzatore organizzatore;
    private String nomeCorretto;
    private String passwordCorretta;
    private boolean loginFatto = false;
    private boolean premuto = false;

    public ControllerLoginOrg(Organizzatore organizzatore, String nomeCorretto, String passwordCorretta){
        this.organizzatore = organizzatore;
        organizzatore.setOrganizzatore(nomeCorretto, passwordCorretta);
    }


    public boolean getLoginFatto(){
        return loginFatto;
    }

    public void ControllaPassword(JFrame frameOrganizzatore, JFrame frameLogin, Organizzatore organizzatore, ControllerOrganizzatore controllerOrganizzatore, String nome, String password){
        if(nome.equals(organizzatore.getNomeOrganizzatore()) && password.equals(organizzatore.getPasswordOrganizzatore())) {
            JOptionPane.showMessageDialog(frameLogin, "Login avvenuto con successo!\nle vostre credenziali: " + organizzatore.getNomeOrganizzatore() + " " + organizzatore.getPasswordOrganizzatore() + "\ne\' possibile aprire le iscrizioni ora!");
            loginFatto = true;
            controllerOrganizzatore.setApertura(true);
        }
        else{
            JOptionPane.showMessageDialog(frameLogin, "Credenziali non corrette!");
        }
    }

    public void avvioIscrizioni(JFrame frameLogin, ControllerOrganizzatore controllerOrganizzatore){
        if (getLoginFatto()){
            JOptionPane.showMessageDialog(frameLogin, "Iscrizioni aperte!");
        }
        else{
            JOptionPane.showMessageDialog(frameLogin, "fai prima login!");
        }
    }

    public void verificaAperturaIscrizioni(JFrame frameLogin, ControllerOrganizzatore controllerOrganizzatore){
        if (controllerOrganizzatore.getApertura()){
            avvioIscrizioni(frameLogin, controllerOrganizzatore);
        }
        else{
            JOptionPane.showMessageDialog(frameLogin, "Le iscrizioni sono chiuse!\n effettua login per poterle aprire!");
        }
    }

}
