package tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task_03 {



    private static Map<String, String> getContacts() {
        return new LinkedHashMap<>(Map.of("Tom", "tom@mail.com", "Lisa", "lisa@mail.com", "Alice", "alisa@mail.com", "Denis", "den@mail.com"));
    }
}
