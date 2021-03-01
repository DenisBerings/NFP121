package question3;

public class Phone extends Device implements MobileNetwork {
    private int batteryLevel;

    public boolean isTactile() {
        return true;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Phone () {
    }

    public Phone (int width, int height) {
        super.setWidth(width);
        super.setHeight(height);
    }

    public Phone (String operatingSystem) {
        super.setOperatingSystem(operatingSystem);
    }

    public String networkType() {
        return "4G";
    }

}
