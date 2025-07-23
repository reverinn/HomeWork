package daoImplements;
import dao.UtenteDao;
import database.DatabaseConnection;
import model.Utente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UtenteDAOImpls implements UtenteDao {

    public void addUtente(String nomeUtente, String password, String teamScelto) {
        try(Connection connection= DatabaseConnection.getInstance()){
            String sql = "INSERT INTO utenti (nome_utente, password, team_scelto) VALUES (?, ?, ?)";
            PreparedStatement stmt= connection.prepareStatement(sql);
            stmt.setString(1,nomeUtente);
            stmt.setString(2,password);
            stmt.setString(3,teamScelto);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Utente loginUtente(String nomeUtente, String password) {
        String sql="select * from utenti where nome_utente=? and password=?";
        try(Connection connection= DatabaseConnection.getInstance()){
            PreparedStatement stmt=connection.prepareStatement(sql);
            stmt.setString(1 ,nomeUtente);
            stmt.setString(2,password);
            try(ResultSet rs= stmt.executeQuery()){
                if(rs.next()){
                    String teamScelto=rs.getString("team_scelto");
                    return new Utente(nomeUtente,password,teamScelto);
                }else{
                    return null;
                }
            }
        }catch(SQLException e){
            e.printStackTrace();
            return null;
        }
    }
}
