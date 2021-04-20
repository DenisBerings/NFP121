package question3;
/* On étend la classe abstraite Device à notre classe Computer pour que cette dernière hérite de ses méthodes.
 */
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


    @Override
    public boolean cableConnected() {
        return true;
    }
}
