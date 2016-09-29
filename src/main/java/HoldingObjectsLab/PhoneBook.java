package HoldingObjectsLab;
import java.util.Map.*;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * Created by zacharywasserman on 9/28/16.
 */
public class PhoneBook {
    public Map<String, ArrayList> phoneBook = new HashMap();
    public ArrayList<String> numbers = new ArrayList();

    public Object lookUp(String name){
        return phoneBook.get(name);
        }
    public void add(String name, String number){
        numbers.add(number);
        phoneBook.put(name, numbers);
    }
    public void remove(String name){
        phoneBook.remove(name);
    }
    public void display(){
        System.out.println(phoneBook);
    }
    public String reverseLookUp(String number){
        for(Entry<String, ArrayList> entry : phoneBook.entrySet()){
            if(numbers.contains(number)) {
                return entry.getKey();
            }

        }
        return "Number not found in book";

    }


    }

