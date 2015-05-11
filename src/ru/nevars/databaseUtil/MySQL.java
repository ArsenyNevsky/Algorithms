package ru.nevars.databaseUtil;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by erafiil on 02.05.15.
 */
public class MySQL {

    public void executeConnection() {
        Connection connection = null;
        Statement statement = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("CONNECTED\n");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            statement = connection.createStatement();
            ResultSet res = statement.executeQuery("select username, login, note from USER u, NOTE n  where n.id_user = u.id_user");
            System.out.println("Username\t\tLogin");
            while (res.next()) {
                String username = res.getString("username");
                String login    = res.getString("login");
                String note     = res.getString("note");
                System.out.println(username + "\t" + login + "\t" + note);
            }
        } catch (Exception e) {

        } finally {
            try {
                statement.close();
                connection.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private String USER = "root";
    private String PASSWORD = "";
    private String URL = "jdbc:mysql://localhost:3306/webnote";
}
