package controller;

import model.Giudice;

import javax.swing.*;

public class ControllerGiudice {
    private Giudice giudice;
    public ControllerGiudice(Giudice giudice) { this.giudice = giudice; }

    public void setGiudice(String passwordGiudice, String nomeGiudice){
        giudice.setGiudice(passwordGiudice, nomeGiudice);
    }
}
