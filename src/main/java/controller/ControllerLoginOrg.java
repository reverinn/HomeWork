package controller;

import model.Organizzatore;

import javax.swing.*;

public class ControllerLoginOrg {
    private Organizzatore organizzatore;
    private String nomeCorretto;
    private String passwordCorretta;
    boolean loginFatto = false;

    public ControllerLoginOrg(Organizzatore organizzatore, String nomeCorretto, String passwordCorretta){
        this.organizzatore = organizzatore;
        organizzatore.setNome(nomeCorretto);
        organizzatore.setPassword(passwordCorretta);
    }

    public ControllerLoginOrg(){
    }

    public void setNomeCorretto(String nomeCorretto){
        this.nomeCorretto = organizzatore.getNomeOrganizzatore();
    }

    public void setLoginFatto(boolean loginFatto){
        this.loginFatto = loginFatto;
    }

    public boolean getLoginFatto(){
        return loginFatto;
    }


    public void ControllaPassword(JFrame frameOrganizzatore, JFrame frameLogin, String nome, String password){
        if (nome.contains(" ") || password.contains(" ") || nome.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(frameLogin, "Inserire tutti i campi o rimuovere gli spazi!");
        }
        else if(nome.equals(organizzatore.getNomeOrganizzatore()) && password.equals(organizzatore.getPasswordOrganizzatore())) {
            JOptionPane.showMessageDialog(frameLogin, "Login avvenuto con successo!\nle vostre credenziali: " + nome + " " + password);
            frameOrganizzatore.setVisible(true);
            frameLogin.dispose();
            setLoginFatto(true);
        }
        else{
            JOptionPane.showMessageDialog(frameLogin, "Credenziali non corrette!");
        }
    }
}
