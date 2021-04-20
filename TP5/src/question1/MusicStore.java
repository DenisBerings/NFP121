package question1;

import java.util.List;
import java.util.ArrayList;

public class MusicStore extends SongComponent {

    private SongComponent everySong;
    public List songList = new ArrayList();


    public MusicStore(SongComponent everySong) {
        super();
    }

    public void getSongList() {
        everySong.displaySongInfo();
    }

}
