import util.PhoneUtil;
import model.PhoneBook;

import java.util.*;

/**
 * Created by ksu on 30.06.16.
 */


public class Book {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final PhoneBook phoneBook = new PhoneBook(PhoneUtil.init());

        System.out.println("Enter name");
        final String name = scanner.nextLine();

        final List<String> phones = PhoneUtil.findNumber(phoneBook.getPersonToPhones(), name);

        if(!phones.isEmpty()) {
            for (int i = 0; i < phones.size(); i++) {
            System.out.println(i + 1 + "." + phones.get(i));
            }
        } else {
            System.out.println("FIO not found");
        }
    }
}
