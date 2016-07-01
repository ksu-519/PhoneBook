package util;

import java.util.*;

/**
 * Created by ksu on 30.06.16.
 */
public class PhoneUtil {
    public static Map<String, List<String>> init() {
        Map<String, List<String>> data = new HashMap<String, List<String>>();

        List<String> phones = Arrays.asList("+8 800 2000 500", "+8 800 200 600");
        data.put("Иванов И.И.", phones);

        phones = Arrays.asList("+8 800 2000 700");
        data.put("Петров П.П.", phones);

        phones = Arrays.asList("+8 800 2000 800","+8 800 2000 900", "+8 800 2000 000");
        data.put("Сидоров С.С.", phones);
        return data;
    }

    public static List<String> findNumber(final Map<String, List<String>> data, final String name) {
        if(data.containsKey(name)) {
            return data.get(name);
        } else {
            return Collections.EMPTY_LIST;
        }
    }
}
