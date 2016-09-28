package Wasserman.Zachary.HoldingObjectsLabTest;

import HoldingObjectsLab.PhoneBook;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.HashMap;

public class PhoneBookTest {

    @Test
    public void lookUpTest(){
        PhoneBook book = new PhoneBook();
        HashMap phoneBook = new HashMap();
        phoneBook.put("Zach", "111 111-1111");
        Object actual = book.lookUp("Zach");
        Object expected = phoneBook.get(1);
        assertEquals(expected, actual);
    }
    @Test
    public void lookUpTestFailed(){
        PhoneBook book = new PhoneBook();
        HashMap phoneBook = new HashMap();
        phoneBook.put("Zach", "111 111-1111");
        Object actual = book.lookUp("Fred");
        Object expected = null;
        assertEquals(expected, actual);
    }
    @Test
    public void add() {
        PhoneBook book = new PhoneBook();
        //HashMap phoneBook = new HashMap();
        book.add("Zach", "111 111-1111");
        int actual = book.phoneBook.size();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void remove(){
        PhoneBook book = new PhoneBook();
        book.add("Zach", "111 111-1111");
        book.add("bob", "222 222-2222");
        book.remove("bob");
        int actual = book.phoneBook.size();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void removeFailed(){
        PhoneBook book = new PhoneBook();
        book.add("Zach", "111 111-1111");
        book.add("bob", "222 222-2222");
        book.remove("fred");
        int actual = book.phoneBook.size();
        int expected = 2;
        assertEquals(expected, actual);
    }
    @Test
    public void reverseLookUpTest(){
        PhoneBook book = new PhoneBook();
        book.add("Zach", "111 111-1111");
        book.add("bob", "222 222-2222");
        book.remove("fred");
        String actual = book.reverseLookUp("111 111-1111");
        String expected = "Zach";
        assertEquals(expected, actual);
    }
    @Test
    public void reverseLookUpFailedTest(){
        PhoneBook book = new PhoneBook();
        book.add("Zach", "111 111-1111");
        book.add("bob", "222 222-2222");
        book.remove("fred");
        String actual = book.reverseLookUp("111 111-1112");
        String expected = "Number not found int book";
        assertEquals(expected, actual);
    }
}
