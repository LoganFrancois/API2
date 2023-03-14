

package myconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.PropertyResourceBundle;

public class ODBCConnection {
    protected String dbName;
    protected String username;
    protected String password;

    public ODBCConnection() {
        PropertyResourceBundle properties = (PropertyResourceBundle)PropertyResourceBundle.getBundle("resources.application");
        this.dbName = properties.getString("cours.DB.database");
        this.username = properties.getString("cours.DB.login");
        this.password = properties.getString("cours.DB.password");
    }

    public ODBCConnection(String username, String password) {
        this();
        this.username = username;
        this.password = password;
    }

    public Connection getConnection() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            this.dbName = "magasinOracle";
            String url = "jdbc:odbc:" + this.dbName;
            return DriverManager.getConnection(url, this.username, this.password);
        } catch (Exception var2) {
            System.out.println("erreur de connexion " + var2);
            var2.printStackTrace();
            return null;
        }
    }
}
