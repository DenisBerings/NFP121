package question1;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
// On étend la classe abstraite SongComponent pour que la classe SongGroup hérite de ses méthode
public class SongGroup extends SongComponent {
    // On déclare une liste de songComponents... 
    List songComponents = new ArrayList();
    //...ainsi que 2 variables (String) songGroup & songDescription
    String groupName;
    String groupDescription;
    // On crée un constructeur qui prend 2 arguments en paramètres, les String groupName & groupDescription
    public SongGroup(String songGroup, String songDescription) {
        this.groupName = groupName ;
        this.groupDescription = groupDescription ;
    }
    /* On surcharge la méthode add() héritée de la classe abstraite SongComponent, pour 
        - que la nouvelle méthode() appelle celle de la classe mère (augmente la taille de la liste de songComponents
        - qu'elle ajoute le nouveau songComponent à la liste de songComponents instanciée */
    @Override
    public void add(SongComponent songComponent) {
        super.add(newSongComponent);
        songComponents.add(newSongComponent);
    }
    /* On la méthode remove() héritée de la classe abstraite SongComponent, qu'elle retire le 
       songComponent passé en paramètre de la liste de songComponents instanciée */
    @Override
    public void remove(SongComponent songComponent) {
        songComponents.remove(songComponent);
    }
    /* On surcharge la méthode getComponent() (qui prend un index en paramatère) héritée de la classe abstraite SongComponent, pour lui faire
       retourner le membre de la liste songComponents instanciée auquel l'index correspond (en s'assurant de renvoyer sous forme de songComponent*/
    public SongComponent getComponent(int index) {
        return (SongComponent) this.songComponents.get(index);
    }
    // On surcharge la méthode displaySongInfo() héritée de la classe abstraite SongComponent, pour lui faire afficher les infos de Song
    public void displaySongInfo() {
        System.out.println(getSongName());
        Iterator songIterator = this.songComponents.iterator();
        while (songIterator.hasNext()) {
            SongComponent songInfo = (SongComponent) songIterator.next();
        }
    }
}


