package controller;

import model.Organizzatore;

import javax.swing.*;

public class ControllerOrganizzatore {
    private Organizzatore organizzatore;
    private boolean apertura;
    private boolean premuto = false;

    public ControllerOrganizzatore(Organizzatore organizzatore) {
        this.organizzatore = organizzatore;
    }

    public void setOrganizzatore(String passwordOrganizzatore, String nomeOrganizzatore) {
        organizzatore.setOrganizzatore(passwordOrganizzatore, nomeOrganizzatore);
    }

    public void setApertura(boolean apertura) {
        organizzatore.setApertura(apertura);
    }

    public boolean getApertura() {
        return organizzatore.getApertura();
    }

    public void setPremuto(boolean premuto) {
        this.premuto = premuto;
    }

    public boolean getPremuto() {
        return premuto;
    }

    public void Avvio(JFrame frame) {
        if (getApertura()) {
            JOptionPane.showMessageDialog(frame, "Le iscrizioni sono aperte!");
        } else {
            JOptionPane.showMessageDialog(frame, "Le iscrizioni sono chiuse!");
        }
    }

    public void controllaConferma(JFrame frameOrganizzatore, String nomeOrganizzatore, String passwordOrganizzatore, boolean premuto) {
        if (nomeOrganizzatore.toLowerCase().contains(" ") || passwordOrganizzatore.toLowerCase().contains(" ")) {
            JOptionPane.showMessageDialog(frameOrganizzatore, "La password non può contenere spazi iniziali o finali!");
        }
        else if (nomeOrganizzatore.isEmpty() && passwordOrganizzatore.isEmpty()){
            JOptionPane.showMessageDialog(frameOrganizzatore,"Inserire tutti i campi!");
        }
        else{
            premuto = true;
            setPremuto(premuto);
            JOptionPane.showMessageDialog(frameOrganizzatore, "Iscrizione avvenuta con successo!");
        }
    }

    public void controllaApertura(JFrame frameHome, JFrame frameOrganizzatore, String nomeOrganizzatore, String passwordOrganizzatore){
        if (nomeOrganizzatore.toLowerCase().contains(" ") || passwordOrganizzatore.toLowerCase().contains(" ")) {
            JOptionPane.showMessageDialog(frameOrganizzatore, "La password non può contenere spazi iniziali o finali!");
        }
        else if (nomeOrganizzatore.isEmpty() && passwordOrganizzatore.isEmpty()){
            JOptionPane.showMessageDialog(frameOrganizzatore,"Inserire tutti i campi!");
        }
        else if (getPremuto()){
            apertura = true;
            setApertura(apertura);
            Avvio(frameOrganizzatore);
        }
        else if (!getPremuto()){
            JOptionPane.showMessageDialog(frameOrganizzatore,"Premere conferma prima di poter aprire le iscrizioni!");
        }
    }

    public void controllaChiusura(JFrame frameHome, JFrame frameOrganizzatore, String nomeOrganizzatore, String passwordOrganizzatore){
        if (nomeOrganizzatore.toLowerCase().contains(" ") || passwordOrganizzatore.toLowerCase().contains(" ")) {
            JOptionPane.showMessageDialog(frameOrganizzatore, "La password non può contenere spazi iniziali o finali!");
        }
        else if (nomeOrganizzatore.isEmpty() || passwordOrganizzatore.isEmpty()){
            JOptionPane.showMessageDialog(frameOrganizzatore,"Inserire tutti i campi!");
        }
        else if (getPremuto()) {
            JOptionPane.showMessageDialog(frameOrganizzatore,"Le iscrizioni sono chiuse!");
            apertura = false;
            setApertura(apertura);
        }
        else{
            JOptionPane.showMessageDialog(frameOrganizzatore,"Premere conferma prima di poter aprire le iscrizioni!");
        }
    }

    public void controllaLogin(JFrame frameOrganizzatore, String nomeOrganizzatore, String passwordOrganizzatore){
        if (getPremuto()){
            frameOrganizzatore.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(frameOrganizzatore,"Premere conferma prima di poter accedere!");
        }


    }



}
