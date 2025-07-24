package controller;

import model.Organizzatore;

import javax.swing.*;

/**
 * The type Controller organizzatore.
 */
public class ControllerOrganizzatore {
    private Organizzatore organizzatore;
    private boolean premuto = false;

    /**
     * Instantiates a new Controller organizzatore.
     *
     * @param organizzatore the organizzatore
     */
    public ControllerOrganizzatore(Organizzatore organizzatore) {
        this.organizzatore = organizzatore;
    }

    /**
     * Sets organizzatore.
     *
     * @param nomeOrganizzatore     the nome organizzatore
     * @param passwordOrganizzatore the password organizzatore
     */
    public void setOrganizzatore(String nomeOrganizzatore, String passwordOrganizzatore) { organizzatore.setOrganizzatore(nomeOrganizzatore, passwordOrganizzatore); }

    /**
     * Get nome organizzatore string.
     *
     * @return the string
     */
    public String getNomeOrganizzatore(){
        return organizzatore.getNomeOrganizzatore();
    }

    /**
     * Get password organizzatore string.
     *
     * @return the string
     */
    public String getPasswordOrganizzatore(){
        return organizzatore.getPasswordOrganizzatore();
    }

    /**
     * Sets premuto.
     *
     * @param premuto the premuto
     */
    public void setPremuto(boolean premuto) { organizzatore.setPremuto(premuto); }

    /**
     * Gets premuto.
     *
     * @return the premuto
     */
    public boolean getPremuto() {
        return organizzatore.getPremuto();
    }


    /**
     * Controlla conferma.
     *
     * @param frameOrganizzatore    the frame organizzatore
     * @param nomeOrganizzatore     the nome organizzatore
     * @param passwordOrganizzatore the password organizzatore
     */
//metodo che verifica se i dati inseriti sono validi e aggiorna se il pulsante conferma sia stato premuto o meno
    public void controllaConferma(JFrame frameOrganizzatore, String nomeOrganizzatore, String passwordOrganizzatore) {
        if (nomeOrganizzatore.toLowerCase().contains(" ") || passwordOrganizzatore.toLowerCase().contains(" ")) {
            JOptionPane.showMessageDialog(frameOrganizzatore, "La password non può contenere spazi iniziali o finali!");
        }
        else if (nomeOrganizzatore.isEmpty() || passwordOrganizzatore.isEmpty()){
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
