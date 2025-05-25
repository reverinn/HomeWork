package controller;

import model.Giudice;
import model.Voto;
import javax.swing.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ControllerLoginGiudice {
    private boolean loginFattoGiudice = false;
    private Giudice giudice;
    private ArrayList<Voto> voti = new ArrayList<>();

    public ControllerLoginGiudice(Giudice giudice, String nome, String password){
        this.giudice = giudice;
        giudice.setGiudice(password, nome);
    }

    public ControllerLoginGiudice(){}

    //restituisce se il login è stato effettuato oppure no, utile per impedire certe operazioni prima di aver fatto il login
    public boolean getLoginFattoGiudice(){
        return loginFattoGiudice;
    }

    //metodo che controlla se la password corrisponde o se i campi inseriti sono validi
    public void controllaPassword(JFrame frameLoginGiudice, String nome, String password){
        if (nome.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(frameLoginGiudice, "Inserire tutti i campi!");
        }
        else if (nome.contains(" ") || password.contains(" ") ) {
            JOptionPane.showMessageDialog(frameLoginGiudice, "I campi non possono contenere spazi!");
        }
        else if (nome.equals(giudice.getNomeGiudice()) && password.equals(giudice.getPasswordGiudice())) {
                JOptionPane.showMessageDialog(frameLoginGiudice, "Login avvenuto con successo!\nle vostre credenziali: " + giudice.getNomeGiudice() + " " + giudice.getPasswordGiudice() + "\ne\' possibile ora dare i voti!");
                loginFattoGiudice = true;
            }
            else{
                JOptionPane.showMessageDialog(frameLoginGiudice, "Credenziali non corrette!");
            }
    }

    //metodo che controlla se il login è stato fatto oppure no, utile per impedire certe operazioni prima di aver fatto il login
    public void controllaLogin(JFrame frameLogin){
        if (!getLoginFattoGiudice()){
            JOptionPane.showMessageDialog(frameLogin, "Effettua login per poter votare!");
        }
    }
    //metodo per salvare all'interno di un arraylist i voti inseriti dal giudice
    public void aggiungiVoto(JFrame frameLogin, String teamScelto, String votoDato){
        controllaLogin(frameLogin);
        voti.add(new Voto(teamScelto, votoDato) );
        voti.add(new Voto(teamScelto, votoDato) );
        voti.add(new Voto(teamScelto, votoDato) );
        voti.add(new Voto(teamScelto, votoDato) );
    }

    public ArrayList<Voto> getVoti() {
        return voti;
    }

    //metodo che pubblica il vincitore della gara
    public void Classifica(JFrame frameLoginGiudice){
        int i = 0;
        controllaLogin(frameLoginGiudice);
        ArrayList<Voto> votiClassifica = voti.stream().filter(voto -> voto.votoAsInt() > 0).collect(Collectors.toCollection(ArrayList::new));
        votiClassifica.sort((v1, v2) -> v2.votoAsInt() - v1.votoAsInt());
        votiClassifica.stream().collect(Collectors.toCollection(ArrayList::new));
        JOptionPane.showMessageDialog(frameLoginGiudice, "Il Team vincitore: \n"+ votiClassifica.get(i));
    }

}
