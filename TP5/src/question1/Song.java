package question1;
// On étend la classe abstraite SongComponent pour que la classe Song hérite de ses méthode
public class Song extends SongComponent {
    // On déclare 3 variables
    private String songName;
    private String bandName;
    private int releaseYear;
    // On crée un constructeur qui prend 3 arguments en paramètre
    public Song(String songName, String bandName, int releaseYear) {
        this.songName = songName;
        this.bandName = bandName;
        this.releaseYear = releaseYear;
    }
    // On surcharge le getter getSongName() héritée de la classe abstraite SongComponent, pour lui faire retourner la variable songName instanciée
    @Override
    public String getSongName() {
        return songName;
    }le getterla méthode getBandName() héritée de la classe abstraite SongComponent, pour lui faire retourner la variable bandName instanciée
    @Override
    public String getBandName() {
        return bandName;
    }
    // On surcharge le getter getReleaseYear() héritée de la classe abstraite SongComponent, pour lui faire retourner la variable releaseYear instanciée
    @Override
    public int getReleaseYear() {
        return releaseYear;
    }
    // On surcharge la méthode displaySongInfo() héritée de la classe abstraite SongComponent, pour lui faire affichée les infos de Song
    @Override
    public void displaySongInfo () {
        System.out.println(getSongName() + getBandName() + getReleaseYear());
    }


}
