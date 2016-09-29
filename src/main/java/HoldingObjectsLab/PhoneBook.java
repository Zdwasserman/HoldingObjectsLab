package HoldingObjectsLab;
import java.util.Map.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
/**
 * Created by zacharywasserman on 9/28/16.
 */
public class PhoneBook {
    public Map<String, ArrayList> phoneBook = new HashMap();

    public Object lookUp(String name){
        return phoneBook.get(name);
    }
    public void add(String name, ArrayList numbers){
        phoneBook.put(name, numbers);
    }
    public void removeEntry(String name){
        phoneBook.remove(name);
    }
    public void display(){
        System.out.println(phoneBook);
    }
    public String reverseLookUp(String number,ArrayList<String> numbers) {
        for (Entry<String, ArrayList> entry : phoneBook.entrySet()) {
            for (String num : numbers) {
                if (num.equals(number)) {
                    return entry.getKey();
                }

            }


        }
        return "Number not found in book";
    }
    public void removeNum(String number, ArrayList<String> numbers){
        numbers.remove(number);
    }

}


