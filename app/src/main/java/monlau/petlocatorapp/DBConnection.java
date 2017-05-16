package monlau.petlocatorapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Created by miquelvidpor on 12/05/2017.
 */
public class DBConnection {
    String url = "jdbc:jtds:sqlserver://oracle-srv:1521/registro_cliente";
    String user = "dam2_14";
    String pass = "oracle";
    Connection conn = null;

    public void conectar (){
        try {
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
