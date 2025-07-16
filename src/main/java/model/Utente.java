package model;

public class Utente {
    protected int idUtente;
    protected String passwordUtente;
    protected String nomeUtente;

    //costruttore per arraylist
    public Utente(String nome, String password) {
        this.nomeUtente = nome;
        this.passwordUtente = password;
    }

    //costruttore per classe figlia Giudice
    public Utente(){}

    public String toString(){
        return "nome: " + nomeUtente + " password: " + passwordUtente;
    }

}
