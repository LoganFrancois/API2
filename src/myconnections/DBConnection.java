//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package myconnections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.PropertyResourceBundle;

public class DBConnection {
    private static Connection dbConnect = null;

    private DBConnection() {
    }

    public static Connection getConnection() {
        if (dbConnect != null) {
            return dbConnect;
        } else {
            PropertyResourceBundle properties = (PropertyResourceBundle)PropertyResourceBundle.getBundle("Ressources.application");
            String serverName = properties.getString("cours.DB.server");
            String dbName = properties.getString("cours.DB.database");
            String username = properties.getString("cours.DB.login");
            String password = properties.getString("cours.DB.password");
            String dbPort = properties.getString("cours.DB.port");

            try {
                Class.forName("oracle.jdbc.OracleDriver");
                String url = "jdbc:oracle:thin:@//" + serverName + ":" + dbPort + "/" + dbName;
                dbConnect = DriverManager.getConnection(url, username, password);
                return dbConnect;
            } catch (Exception var7) {
                System.out.println("erreur de connexion " + var7);
                var7.printStackTrace();
                return null;
            }
        }
    }

    public static void closeConnection() {
        try {
            dbConnect.close();
        } catch (Exception var1) {
            System.out.println("erreur de fermeture de connexion " + var1);
        }

        dbConnect = null;
    }
}
