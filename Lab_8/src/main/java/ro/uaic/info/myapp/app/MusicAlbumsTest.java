package ro.uaic.info.myapp.app;
import ro.uaic.info.myapp.AlbumControllerDao;
import ro.uaic.info.myapp.ArtistControllerDao;
import ro.uaic.info.myapp.Database;

import java.util.ArrayList;
import java.util.Arrays;

public class MusicAlbumsTest {
    public static void main(String[] args) {

        try {
            ArtistControllerDao artistC = new ArtistControllerDao();
            AlbumControllerDao albumC = new AlbumControllerDao();

            //artistC.create("Dao Mao", "China");
            //albumC.create("Wo Mia", 4, 1999);
            //albumC.create("Wo Mia 2", 4, 2001);

            Integer id_DaoMao = artistC.findByName("Dao Mao");
            if (id_DaoMao == null) {
                System.out.println("There is no Dao Mao registered in the Artists database;");
            } else {
                System.out.println(id_DaoMao.intValue());
            }

            ArrayList<Integer> id_WoMia = albumC.findByArtist(4);
            if (id_WoMia == null) {
                System.out.println("There is no Wo Mia registered in the Albums database;");
            } else {
                    System.out.print(Arrays.toString(id_WoMia.toArray()));
            }
            Database.closeConnection();
        }catch(Exception e){System.out.println(e.getMessage());}

    }

}
