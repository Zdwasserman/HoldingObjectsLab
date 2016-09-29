package Wasserman.Zachary.HoldingObjectsLabTest;

import HoldingObjectsLab.PhoneBook;
import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import java.util.HashMap;

public class PhoneBookTest {

    @Test
    public void lookUpTest(){
        PhoneBook book = new PhoneBook();
        HashMap phoneBook = new HashMap();
        ArrayList numbers = new ArrayList();
        numbers.add("111 111-1111");
        phoneBook.put("Zach",numbers);
        Object actual = book.lookUp("Zach");
        Object expected = phoneBook.get(0);
        assertEquals(expected, actual);
    }
    @Test
    public void lookUpTestFailed(){
        PhoneBook book = new PhoneBook();
        HashMap phoneBook = new HashMap();
        ArrayList numbers = new ArrayList();
        numbers.add("111 111-1111");
        phoneBook.put("Zach", numbers);
        Object actual = book.lookUp("Fred");
        Object expected = null;
        assertEquals(expected, actual);
    }
    @Test
    public void addTest() {
        PhoneBook book = new PhoneBook();
        ArrayList numbers = new ArrayList();
        numbers.add("111 111-1111");
        book.add("Zach", numbers);
        int actual = book.phoneBook.size();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void removeEntryTest(){
        PhoneBook book = new PhoneBook();
        ArrayList numbers = new ArrayList();
        book.add("Zach",numbers);
        book.add("bob", numbers);
        book.removeEntry("bob");
        int actual = book.phoneBook.size();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void removeFailedTest(){
        PhoneBook book = new PhoneBook();
        ArrayList numbers = new ArrayList();
        numbers.add("111 111-1111");
        book.add("Zach",numbers);
        book.removeEntry("fred");
        int actual = book.phoneBook.size();
        int expected = 1;
        assertEquals(expected, actual);
    }
    @Test
    public void reverseLookUpTest(){
        PhoneBook book = new PhoneBook();
        //HashMap phoneBook = new HashMap();
        ArrayList numbers = new ArrayList();
        //String num = "111 111-1111";
        numbers.add("111 111-1111");
        book.add("Zach",numbers);
        String actual = book.reverseLookUp("111 111-1111", numbers);
        String expected = "Zach";
        assertEquals(expected, actual);
    }
    @Test
    public void reverseLookUpFailedTest(){
        PhoneBook book = new PhoneBook();
        ArrayList numbers = new ArrayList();
        numbers.add("111 111-1111");
        book.add("Zach",numbers);
        String actual = book.reverseLookUp("111 111-1112", numbers);
        String expected = "Number not found in book";
        assertEquals(expected, actual);
    }
    @Test
    public void removeNumTest(){
        PhoneBook book = new PhoneBook();
        ArrayList<String> numbers = new ArrayList();
        numbers.add("111 111-1111");
        numbers.add("111 111-1112");
        book.add("Zach",numbers);
        book.removeNum("111 111-1112", numbers);
        int actual = numbers.size();
        int expected = 1;
        assertEquals(expected, actual);
    }
}
