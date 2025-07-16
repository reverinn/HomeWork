package model;

import model.*;

import javax.swing.*;
import java.util.ArrayList;

public class Organizzatore {
    private String nome;
    private String password;
    private boolean apertura;

    public void Organizzatore(){}

    public void setOrganizzatore(String nome, String password){
        this.nome = nome;
        this.password = password;
    }

    public void setPremuto(boolean apertura){
        this.apertura = apertura;
    }
    public boolean getPremuto(){
        return apertura;
    }

    public String getNomeOrganizzatore(){
        return nome;
    }
    public String getPasswordOrganizzatore(){
        return password;
    }


}
