import org.junit.jupiter.api.*;
import java.util.*;
import static org.junit.Assert.*;

class StoreTester {
    @Test
    void addBookTest() {
        Store store = new Store();
        Book book = new Book();
        store.addBook(book);
        assertTrue(true);
    }

    @Test
    void addBookAndPhone() {
        Store store = new Store();
        Phone phone = new Phone();
        Book book = new Book();
        store.addPhone(phone);
        store.addBook(book);
        assertTrue(true);
    }

    @Test
    void phoneTest() {
        Store store = new Store();
        Phone phone = new Phone();
        Phone phone2 = new Phone();
        store.addPhone(phone);
        store.addPhone(phone2);
        store.updatePhonesLocation("Room 512");
        ArrayList<CISItem> phones = store.getAllPhones();

        for (CISItem i : phones) assertEquals(i.getLocation(), "Room 512");
    }

    @Test
    void getItemsTest() {
        Store store = new Store();
        Phone phone = new Phone();
        Phone phone2 = new Phone();
        Book book = new Book();
        Book book2 = new Book();
        Magazine magazine = new Magazine();
        Magazine magazine2 = new Magazine();
        Arduino arduino = new Arduino();
        Arduino arduino2 = new Arduino();

        store.addBook(book);
        store.addBook(book2);
        store.addPhone(phone);
        store.addPhone(phone2);
        store.addMagazine(magazine);
        store.addMagazine(magazine2);
        store.addArduino(arduino);
        store.addArduino(arduino2);

        ArrayList<CISItem> two = store.getItems("phone");
        CISItem[] test = new CISItem[] {phone, phone2};
        for (int i = 0; i < two.size(); i++) assertEquals(two.get(i), test[i]);

        two = store.getItems("BooK");
        CISItem[] test2 = {book, book2};
        for (int i = 0; i < two.size(); i++) assertEquals(two.get(i), test2[i]);

        two = store.getItems("magaZINE");
        CISItem[] test3 = {magazine, magazine2};
        for (int i = 0; i < two.size(); i++) assertEquals(two.get(i), test3[i]);

        two = store.getItems("arduino");
        CISItem[] test4 = {arduino, arduino2};
        for (int i = 0; i < two.size(); i++) assertEquals(two.get(i), test4[i]);
    }

    @Test
    void updateItemsTest() {
        Store store = new Store();
        Phone phone = new Phone();
        Book book = new Book();
        Magazine magazine = new Magazine();
        Arduino arduino = new Arduino();

        store.addBook(book);
        store.addPhone(phone);
        store.addMagazine(magazine);
        store.addArduino(arduino);

        store.updateItems("phoNe", "NETWORKtype", "4G");
        store.updateItems("phone", "sCrEeNsIzE", "10000");
        store.updateItems("BOOK", "title", "Nineteen Eighty-Four");
        store.updateItems("book", "ISBN", "1234567890");
        store.updateItems("book", "EDItion", "first");
        store.updateItems("MAGazine", "coverSTORYtitle", "new look!");
        store.updateItems("magazine", "printdate", "4 February 2024");
        store.updateItems("ARDuINO","version", "1");

        for (CISItem i : store.getItems("phone")) {
            assertEquals(((Phone) i).getNetworkType(), "4G");
            assertEquals(((Phone) i).getScreenSize(), "10000");
        }
        for (CISItem i : store.getItems("book")) {
            assertEquals(((Book) i).getTitle(), "Nineteen Eighty-Four");
            assertEquals(((Book) i).getIsbn(), "1234567890");
            assertEquals(((Book) i).getEdition(), "first");
        }
        for (CISItem i : store.getItems("magazine")) {
            assertEquals(((Magazine) i).getCoverStoryTitle(), "new look!");
            assertEquals(((Magazine) i).getPrintDate(), "4 February 2024");
        }
        for (CISItem i : store.getItems("arduino")) assertEquals(((Arduino) i).getVersion(), "1");
    }
}
