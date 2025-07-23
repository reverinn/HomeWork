package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * The type Database connection.
 */
public class DatabaseConnection {
    private static Connection connessione;

    private DatabaseConnection() {}

    /**
     * Gets instance.
     *
     * @return the instance
     * @throws SQLException the sql exception
     */
    public static Connection getInstance() throws SQLException {
        if (connessione == null || connessione.isClosed()) {
            connessione= DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/Hackaton","postgres","prova1234"
            );
        }
        return connessione;
    }
}
