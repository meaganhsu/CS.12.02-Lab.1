import java.lang.reflect.Array;
import java.util.*;
public class Store {
    private ArrayList<CISItem> cisItems;
    public Store() {
        cisItems = new ArrayList<>();
    }
    public void addBook(Book book) {
        cisItems.add(book);
    }
    public void addPhone(Phone phone) {
        cisItems.add(phone);
    }
    public void addMagazine(Magazine magazine) {
        cisItems.add(magazine);
    }
    public void addArduino(Arduino arduino) {
        cisItems.add(arduino);
    }
    public void updatePhonesLocation(String location) {
        for (CISItem i : cisItems) {
            if (i instanceof Phone) i.setLocation(location);
        }
    }
    public ArrayList<CISItem> getAllPhones() {
        ArrayList<CISItem> phones = new ArrayList<>();

        for (CISItem i : cisItems) if (i instanceof Phone) phones.add(i);

        return phones;
    }
    public ArrayList<CISItem> getItems(String itemType) {
        ArrayList<CISItem> items = new ArrayList<>();

        for (CISItem i : cisItems) {
            if (itemType.equalsIgnoreCase(String.valueOf(i.getClass()))) items.add(i);
        }

        return items;
    }
    public void updateItems(String itemType, String property, String value) {
        for (CISItem i : cisItems) {
            if (itemType.equalsIgnoreCase(String.valueOf(i.getClass()))) {
                if (property.equalsIgnoreCase("location")) i.setLocation(value);
                else if (property.equalsIgnoreCase("description")) i.setDescription(value);
                else if (property.equalsIgnoreCase("name")) i.setName(value);
                else if (property.equalsIgnoreCase("price")) i.setPrice(Integer.parseInt(value));

                if (itemType.equalsIgnoreCase("phone") && i instanceof Phone) {
                    if (property.equalsIgnoreCase("networktype")) ((Phone) i).setNetworkType(value);
                    else if (property.equalsIgnoreCase("screensize")) ((Phone) i).setScreenSize(Integer.parseInt(value));
                } else if (itemType.equalsIgnoreCase("book") && i instanceof Book) {
                    if (property.equalsIgnoreCase("isbn")) ((Book) i).setIsbn(value);
                    else if (property.equalsIgnoreCase("edition")) ((Book) i).setEdition(value);
                    else if (property.equalsIgnoreCase("title")) ((Book) i).setTitle(value);
                } else if (itemType.equalsIgnoreCase("magazine") && i instanceof Magazine) {
                    if (property.equalsIgnoreCase("coverstorytitle")) ((Magazine) i).setCoverStoryTitle(value);
                    else if (property.equalsIgnoreCase("printdate")) ((Magazine) i).setPrintDate(value);
                } else if (itemType.equalsIgnoreCase("arduino") && i instanceof Arduino) {
                    if (property.equalsIgnoreCase("version")) ((Arduino) i).setVersion(value);
                }
            }
        }
    }
    public void showAllInfo(CISItem cisItem) {
        for (CISItem i : cisItems) {
            System.out.println(i);
        }
    }
}
