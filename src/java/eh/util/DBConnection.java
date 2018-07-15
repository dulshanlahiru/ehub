/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eh.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public Connection getConnection() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost/eventhub", "root", "");
        } catch (Exception e) {
            System.err.println("error in connection");
            e.printStackTrace();
        }
        System.out.println("E=======db Connecting======");
        return con;
    }

    public static void main(String[] args) {
        new DBConnection().getConnection();
    }
}
