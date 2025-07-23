package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConnection {
    private static Connection connessione;

    private DatabaseConnection() {}

    public static Connection getInstance() throws SQLException {
        if (connessione == null || connessione.isClosed()) {
            connessione= DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Hackaton","postgres","prova1234"
            );
        }
        return connessione;
    }
}
