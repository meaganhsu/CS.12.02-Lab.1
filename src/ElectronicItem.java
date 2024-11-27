public class ElectronicItem extends CISItem{
    private int storageCapacity;
    private String model;
    private String maker;
    private String operatingSystem;

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public String getModel() {
        return model;
    }

    public String getMaker() {
        return maker;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
}
