package question1;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class SongGroup extends SongComponent {
    //
    List songComponents = new ArrayList();
    String songGroup;
    String songDescription;

    public SongGroup(String songGroup, String songDescription) {
        songGroup = this.songGroup;
        songDescription = this.songDescription;
    }

    public SongComponent getComponent(int index) {
        return (SongComponent) this.songComponents.get(index);
    }

    @Override
    public void add(SongComponent songComponent) {
        this.songComponents.add(songComponent);
    }

    @Override
    public void remove(SongComponent songComponent) {
        this.songComponents.remove(songComponent);
    }

    public void displaySongInfo() {
        System.out.println(getSongName());
        Iterator songIterator = this.songComponents.iterator();
        while (songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent) songIterator.next();
        }
    }
}


