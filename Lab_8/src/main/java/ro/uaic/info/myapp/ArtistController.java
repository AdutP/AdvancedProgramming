package ro.uaic.info.myapp;

import java.sql.*;

public interface ArtistController {

    void create(String name, String country) throws SQLException;

    Integer findByName(String name) throws SQLException;

}
