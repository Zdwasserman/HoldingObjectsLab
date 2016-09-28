package HoldingObjectsLab;

import java.util.HashMap;
/**
 * Created by zacharywasserman on 9/28/16.
 */
public class PhoneBook {
    public HashMap phoneBook = new HashMap();

    public Object lookUp(String name){
        return phoneBook.get(name);
        }
    public void add(String name, String number){
        phoneBook.put(name, number);
    }
    public void remove(String name){
        phoneBook.remove(name);
    }
    public void display(){
        System.out.println(phoneBook);
    }
    }

