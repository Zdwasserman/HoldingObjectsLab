package HoldingObjectsLab;
import java.util.Map.*;
import java.util.Map;
import java.util.HashMap;
/**
 * Created by zacharywasserman on 9/28/16.
 */
public class PhoneBook {
    public Map<String, String> phoneBook = new HashMap();

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
    public String reverseLookUp(String number){
        for(Entry<String, String> entry : phoneBook.entrySet()){
            if(number.equals(entry.getValue())) {
                return entry.getKey();
            }

        }
        return "Number not found int book";

    }


    }

