package ro.uaic.info.myapp;

import java.sql.*;

public class ArtistControllerDao implements ArtistController {


    @Override
    public void create(String name, String country) throws SQLException {
        Connection con = Database.getConnection();
        String sql = "INSERT INTO artists VALUES(id_artist.NEXTVAL, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setString(2, country);
        pstmt.executeQuery();
    }

    @Override
    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        String sql = "SELECT id FROM artists WHERE name = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, name);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()) {
            return rs.getInt("id");
        }
        return null;
    }
}
