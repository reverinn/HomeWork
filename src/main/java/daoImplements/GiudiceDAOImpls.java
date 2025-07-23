package daoImplements;

import database.DatabaseConnection;
import dao.GiudiceDao;

import java.sql.*;
import java.util.ArrayList;

public class GiudiceDAOImpls implements GiudiceDao {

    public void addGiudice(String nomeUtente, String password) {
    try(Connection connection= DatabaseConnection.getInstance()){
        String sql = "INSERT INTO giudici (nome_utente, password) VALUES (?, ?, ?)";
        PreparedStatement stmt= connection.prepareStatement(sql);
        stmt.setString(1,nomeUtente);
        stmt.setString(2,password);
        stmt.executeUpdate();
    }catch(SQLException e){
        e.printStackTrace();
    }
}

    @Override
    public void assegnaVoto(String nomeGiudice, String nomeTeam, int voto) {
        String sql = "INSERT INTO voti (nome_Giudice, nome_Team, voto) VALUES (?, ?, ?) " +
                "ON CONFLICT (nome_Giudice, nome_Team) " +
                "DO UPDATE SET voto = EXCLUDED.voto";
        try (Connection connection = DatabaseConnection.getInstance();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nomeGiudice);
            stmt.setString(2, nomeTeam);
            stmt.setInt(3, voto);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void stampaClassifiche(ArrayList<String> team, ArrayList<Integer> voti) {
        try(Connection conn= DatabaseConnection.getInstance()){
            String sql="SELECT * FROM team";
            Statement stmt=conn.createStatement();
            ResultSet rs =stmt.executeQuery(sql);
            while(rs.next()){
                team.add(rs.getString("Team"));
                voti.add(rs.getInt("Voti"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
}
