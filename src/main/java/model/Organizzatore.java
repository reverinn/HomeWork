package model;


/**
 * The type Organizzatore.
 */
public class Organizzatore {
    private String nome;
    private String password;
    private boolean apertura;


    /**
     * Set organizzatore.
     *
     * @param nome     the nome
     * @param password the password
     */
    public void setOrganizzatore(String nome, String password){
        this.nome = nome;
        this.password = password;
    }

    /**
     * Set premuto.
     *
     * @param apertura the apertura
     */
    public void setPremuto(boolean apertura){
        this.apertura = apertura;
    }

    /**
     * Get premuto boolean.
     *
     * @return the boolean
     */
    public boolean getPremuto(){
        return apertura;
    }

    /**
     * Get nome organizzatore string.
     *
     * @return the string
     */
    public String getNomeOrganizzatore(){
        return nome;
    }

    /**
     * Get password organizzatore string.
     *
     * @return the string
     */
    public String getPasswordOrganizzatore(){
        return password;
    }


}
