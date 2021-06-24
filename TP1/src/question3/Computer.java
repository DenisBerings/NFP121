package question3;
/* On étend la classe abstraite Device à notre classe Computer pour que cette 
   dernière hérite de ses méthodes (test computerExtendsDevice()) */
/* On implémente l'interface Ethernet à notre classe Computer pour que cette 
   dernière hérite de ses méthodes (test checkComputerCableConnection()) */
public class Computer extends Device implements Ethernet {
    private int ramSlot;
    private String videoCardname;

    public int getRamSlot() {
        return ramSlot;
    }

    public void setRamSlot(int ramSlot) {
        this.ramSlot = ramSlot;
    }

    public String getVideoCardname() {
        return videoCardname;
    }

    public void setVideoCardname(String videoCardname) {
        this.videoCardname = videoCardname;
    }

    /* On surcharge la méthode cableConnected() (héritée de l'interface Ethernet) 
       pour qu'elle renvoie "true" (test checkComputerCableConnection()) */
    @Override
    public boolean cableConnected() {
        return true;
    }
}
