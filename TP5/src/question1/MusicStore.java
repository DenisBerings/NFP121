package question1;

public class MusicStore {
    // On déclare une variable de type SongComponent
    SongComponent songList;
    // On crée un constructeur qui prend le SongComponent en paramètre et l'instancie
    public MusicStore(SongComponent songList) {
        this.songList = songList;
    }
    // On crée une méthode qui va appeler la méthode displayInfo() sur le songComponent instancié
    public void getSongList() {
        songList.displaySongInfo();
    }
}
