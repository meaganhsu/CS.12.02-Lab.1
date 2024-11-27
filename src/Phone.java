public class Phone extends ElectronicItem{
    private String networkType;
    private int screenSize;

    public int getScreenSize() {
        return screenSize;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
