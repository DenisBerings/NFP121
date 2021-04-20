package question3;
/* On étend la classe abstraite Device à notre classe Phone pour que cette dernière hérite de ses méthodes.
 */
public class Phone extends Device implements MobileNetwork {
    private int batteryLevel;

    Phone (){

    }
    // On crée un constructeur qui prend 2
    Phone (int width, int height) {
        super.setHeight(height);
        super.setWidth(width);
    }

    Phone (String operatingSystem){
        super.setOperatingSystem(operatingSystem);
    }

    public boolean isTactile() {
        return true;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }


    @Override
    public String networkType() {
        return "4G";
    }
}
