package model;

import model.*;

import javax.swing.*;
import java.util.ArrayList;

public class Organizzatore extends Utente {
    private String nome;
    private String password;
    public ArrayList <Giudice> giudicescelto = new ArrayList<>();

    //Aggiungo Giudici già esistenti
    public Organizzatore(Giudice a) {
        giudicescelto.add(a);
        a.scelto = this;
    }

    //Aggiungo nuovo Giudice
    public Organizzatore(){
        giudicescelto.add(new Giudice(this));
    }

    public void setOrganizzatore(String nome, String password){
        this.nome = nome;
        this.password = password;
    }

    public void GetOrganizzatore(JFrame frame, String nome, String password){
        JOptionPane.showMessageDialog(frame, "Organizzatore: " + nome + " Password: " + password);
    }

}
