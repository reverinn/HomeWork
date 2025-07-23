package model;


/**
 * The type Voto.
 */
public class Voto {
    /**
     * The Valore voto.
     */
    public String valoreVoto;
    /**
     * The Nome squadra.
     */
    public String nomeSquadra;


    /**
     * Instantiates a new Voto.
     *
     * @param squadra    the squadra
     * @param valoreVoto the valore voto
     */
    public Voto(String squadra, String valoreVoto){
        this.nomeSquadra = squadra;
        this.valoreVoto = valoreVoto;
    }

    /**
     * Gets valore voto.
     *
     * @return the valore voto
     */
    public String getValoreVoto() {
        return valoreVoto;
    }

    /**
     * Gets nome squadra.
     *
     * @return the nome squadra
     */
    public String getNomeSquadra() {
        return nomeSquadra;
    }

    /**
     * Voto as int int.
     *
     * @return the int
     */
    public int votoAsInt(){
        return Integer.parseInt(valoreVoto);
    }

    public String toString(){
        return "nome: " + nomeSquadra + " voto: " + valoreVoto;
    }
}
