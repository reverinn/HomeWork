package model;

/**
 * The type Utente.
 */
public class Utente {
    /**
     * The Password utente.
     */
    protected String passwordUtente;
    /**
     * The Nome utente.
     */
    protected String nomeUtente;
    private String teamScelto;

    /**
     * Instantiates a new Utente.
     *
     * @param nome       the nome
     * @param password   the password
     * @param teamScelto the team scelto
     */
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

    /**
     * Instantiates a new Utente.
     */
//costruttore per classe figlia Giudice
    public Utente(){}

    public String toString(){
        return "nome: " + nomeUtente + " password: " + passwordUtente;
    }

}
