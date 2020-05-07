package ro.uaic.info.myapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AlbumControllerDao implements AlbumController {

    @Override
    public void create(String name, int artistId, int releaseYear) throws SQLException {

        Connection con = Database.getConnection();
        String sql = "INSERT INTO albums VALUES(id_album.NEXTVAL, ?, ?, ?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, name);
        pstmt.setInt(2, artistId);
        pstmt.setInt(3, releaseYear);
        pstmt.executeQuery();

    }

    @Override
    public ArrayList<Integer> findByArtist(int artistId) throws SQLException {

        Connection con = Database.getConnection();
        String sql = "SELECT id FROM albums WHERE artist_id = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, artistId);
        ResultSet rs = pstmt.executeQuery();
        ArrayList<Integer> id_list = new ArrayList<>();
        while(rs.next()) {
            id_list.add(rs.getInt("id"));
        }
        if (id_list.isEmpty()) return null;
        return id_list;

    }
}
