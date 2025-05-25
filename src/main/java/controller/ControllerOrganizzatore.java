package controller;

import model.Organizzatore;

import javax.swing.*;

public class ControllerOrganizzatore {
    private ControllerLoginOrg controllerLoginOrg;
    private Organizzatore organizzatore;
    private boolean apertura;
    private boolean premuto = false;

    public ControllerOrganizzatore(Organizzatore organizzatore) {
        this.organizzatore = organizzatore;
    }


    public void setOrganizzatore(String nomeOrganizzatore, String passwordOrganizzatore) {
        organizzatore.setOrganizzatore(nomeOrganizzatore, passwordOrganizzatore);
    }

    public String getNomeOrganizzatore(){
        return organizzatore.getNomeOrganizzatore();
    }

    public String getPasswordOrganizzatore(){
        return organizzatore.getPasswordOrganizzatore();
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

    //metodo che verifica se i dati inseriti sono validi e aggiorna se il pulsante conferma sia stato premuto o meno
    public void controllaConferma(JFrame frameOrganizzatore, String nomeOrganizzatore, String passwordOrganizzatore, boolean premuto, ControllerOrganizzatore controllerOrganizzatore) {
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
            controllerOrganizzatore.setOrganizzatore(nomeOrganizzatore, passwordOrganizzatore);
        }
    }

    public Organizzatore getOrganizzatore() {
        return organizzatore.getOrganizzatore();
    }

}
