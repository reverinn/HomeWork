package daoImplements;
import database.DatabaseConnection;
import model.Organizzatore;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class OrganizzatoreDAOImpls {
    public void addOrganizzatore(String nomeUtente, String password) {
        try(Connection connection= DatabaseConnection.getInstance()){
            String sql = "INSERT INTO organizzatori (nome_utente, password) VALUES (?, ?, ?)";
            PreparedStatement stmt= connection.prepareStatement(sql);
            stmt.setString(1,nomeUtente);
            stmt.setString(2,password);
            stmt.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

}
