package ro.uaic.info.myapp;
import java.sql.*;

public final class Database{

    private static Connection con;
    private static String pass = "sql";
    private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
    private static String user = "IPDBA";

    private Database() {}

    public static Connection getConnection() throws SQLException {
        if (con == null || con.isClosed())
            con = DriverManager.getConnection(url, user, pass);

        return con;

    }

    public static void closeConnection() throws SQLException {
        if (con == null) {
            System.out.println("No connection found");
        }
        else {
                con.close();
                con = null;
        }
    }

}
