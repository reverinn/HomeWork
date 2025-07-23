package controller;

import model.Organizzatore;

import javax.swing.*;

public class ControllerOrganizzatore {
    private Organizzatore organizzatore;
    private boolean premuto = false;

    public ControllerOrganizzatore(Organizzatore organizzatore) {
        this.organizzatore = organizzatore;
    }
    public void setOrganizzatore(String nomeOrganizzatore, String passwordOrganizzatore) { organizzatore.setOrganizzatore(nomeOrganizzatore, passwordOrganizzatore); }

    public String getNomeOrganizzatore(){
        return organizzatore.getNomeOrganizzatore();
    }
    public String getPasswordOrganizzatore(){
        return organizzatore.getPasswordOrganizzatore();
    }

    public void setPremuto(boolean premuto) { organizzatore.setPremuto(premuto); }
    public boolean getPremuto() {
        return organizzatore.getPremuto();
    }


    //metodo che verifica se i dati inseriti sono validi e aggiorna se il pulsante conferma sia stato premuto o meno
    public void controllaConferma(JFrame frameOrganizzatore, String nomeOrganizzatore, String passwordOrganizzatore) {
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
            setOrganizzatore(nomeOrganizzatore, passwordOrganizzatore);
        }
    }

}
