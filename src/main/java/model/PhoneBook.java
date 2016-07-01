package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ksu on 30.06.16.
 */
public class PhoneBook {

    private Map<String, List<String>> personToPhones = new HashMap<String, List<String>>();

    public PhoneBook() {
    }

    public PhoneBook(Map<String, List<String>> personToPhones) {
        this.personToPhones = personToPhones;
    }

    public Map<String, List<String>> getPersonToPhones() {
        return personToPhones;
    }

    public void setPersonToPhones(Map<String, List<String>> personToPhones) {
        this.personToPhones = personToPhones;
    }
}
