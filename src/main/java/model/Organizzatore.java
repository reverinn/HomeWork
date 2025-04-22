package model;

import model.*;
import java.util.ArrayList;

public class Organizzatore extends Utente {
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

}
