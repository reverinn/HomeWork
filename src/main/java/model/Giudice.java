package model;

import model.*;

import javax.swing.*;
import java.util.ArrayList;

public class Giudice extends Utente {
    private Giudice giudice;
    private String nome;
    private String password;


    public Giudice(){}

    public void setGiudice(String password, String nome){
        this.password = password;
        this.nome = nome;
    }
    public Giudice getGiudice(){
        return giudice;
    }

    public String getNomeGiudice(){
        return nome;
    }
    public String getPasswordGiudice(){
        return password;
    }


}
