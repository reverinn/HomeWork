package model;


public class Voto {
    public String valoreVoto;
    public String nomeSquadra;



    public Voto(String squadra, String valoreVoto){
        this.nomeSquadra = squadra;
        this.valoreVoto = valoreVoto;
    }

    public String getValoreVoto() {
        return valoreVoto;
    }

    public String getNomeSquadra() {
        return nomeSquadra;
    }

    public int votoAsInt(){
        return Integer.parseInt(valoreVoto);
    }

    public String toString(){
        return "nome: " + nomeSquadra + " voto: " + valoreVoto;
    }
}
