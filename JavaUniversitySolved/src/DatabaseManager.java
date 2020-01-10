
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

final public class DatabaseManager {

    private DatabaseManager() {

    }

    public static Connection getConnection() {
        Connection conObj = null;
        try {
                conObj = DriverManager.getConnection("jdbc:mysql://localhost:3306/UmlUniversity",
                    "root", "test");

        } catch (SQLException ex) {
            System.out.println("An error occured -> " + ex.toString());
        }
        return conObj;
    }

}
