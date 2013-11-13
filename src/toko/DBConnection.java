/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package toko;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cak-ust
 */
public class DBConnection {
    Connection connection = null;
    public DBConnection(){
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
					"jdbc:postgresql://localhost:5432/SHPL", "test",
					"test");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConn(){
        return connection;
    }
}
