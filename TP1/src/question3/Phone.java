package question3;
/* On étend la classe abstraite Device à notre classe Phone pour que 
   cette dernière hérite de ses méthodes (test phoneExtendsDevice()) */
/* On implémente l'interface MobileNetwork à notre classe Phone pour que 
   cette dernière hérite de ses méthodes (test checkPhoneNetworkName()) */
public class Phone extends Device implements MobileNetwork {
    private int batteryLevel;
    /* On crée un constructeur qui prend 2 arguments en paramètres (width & height) 
    récupérés de la classe mère Device (super) (test checkPhoneScreenDimension()) */
    Phone (int width, int height) {
        super.setHeight(height);
        super.setWidth(width);
    }
    /* On crée un constructeur qui prend 1 argument en paramètres (operatingSystem) 
    récupérés de la classe mère Device (super) (test checkPhoneOperatingSystem()) */
    Phone (String operatingSystem){
        super.setOperatingSystem(operatingSystem);
    }
    /* On crée un constructeur qui prend 0 argument en paramètres (test phone checkPhoneNetworkName()) */
    Phone (){
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

    /* On surcharge la méthode networkType() héritée de l'interface MobileNetwork 
       pour qu'elle renvoie le string "4G" (test checkPhoneNetworkName()) */
    @Override
    public String networkType() {
        return "4G";
    }
}
