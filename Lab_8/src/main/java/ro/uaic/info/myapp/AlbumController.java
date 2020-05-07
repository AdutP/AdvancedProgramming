package ro.uaic.info.myapp;

import java.sql.SQLException;
import java.util.ArrayList;

public interface AlbumController {

    void create(String name, int artistId, int releaseYear) throws SQLException;

    ArrayList<Integer> findByArtist(int artistId) throws SQLException;

}
