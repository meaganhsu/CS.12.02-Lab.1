public class CISItem extends Store{
    private String name;
    private String location;
    private int price;
    private String description;

    public String getLocation() {
        return location;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setName(String name) {
        this.name = name;
    }
}
