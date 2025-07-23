package model;

public class Utente {
    protected String passwordUtente;
    protected String nomeUtente;
    private String teamScelto;

    //costruttore per arraylist
    public Utente(String nome, String password, String teamScelto) {
        this.nomeUtente = nome;
        this.passwordUtente = password;
        switch (teamScelto) {
            case "Team Rosso":
                this.teamScelto = "Team Rosso";
                break;
            case "Team Giallo":
                this.teamScelto = "Team Giallo";
                break;
            case "Team Verde":
                this.teamScelto = "Team Verde";
                break;
            case "Team Blu":
                this.teamScelto = "Team Blu";
                break;
            default:
                break;
        }
    }

    //costruttore per classe figlia Giudice
    public Utente(){}

    public String toString(){
        return "nome: " + nomeUtente + " password: " + passwordUtente;
    }

}
