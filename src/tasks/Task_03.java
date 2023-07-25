package tasks;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Task_03 {

    public static void main(String[] args) {
        Map<String, String> contacts = getContacts();
        getOutput("Initial contacts:", contacts);
        editContacts(contacts);
        getOutput("Updated contacts:", contacts);
    }

    private static void getOutput(String title, Map<String, String> contacts) {
        System.out.println(title);
        AtomicInteger counter = new AtomicInteger(1);
        contacts.forEach((k, v) -> System.out.println(counter.getAndIncrement() + ") " + k + " - " + v));
        System.out.println();
    }

    private static void editContacts(Map<String, String> contacts) {
        contacts.replace("Tom", "tomasdev@glob.net");
    }

    private static Map<String, String> getContacts() {
        return new LinkedHashMap<>(Map.of("Tom", "tom@mail.com", "Lisa", "lisa@mail.com", "Alice", "alisa@mail.com", "Denis", "den@mail.com"));
    }
}
