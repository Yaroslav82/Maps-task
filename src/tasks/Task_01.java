package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class Task_01 {

    private static void getOutput(String title, Map<String, Integer> products) {
        System.out.println(title);
        AtomicInteger counter = new AtomicInteger(1);
        products.forEach((k, v) -> System.out.println(counter.getAndIncrement() + ") " + k + ", " + v + " kg"));
        System.out.println();
    }

    private static void updateProducts(Map<String, Integer> products) {
        products.put("banana", 14);
        products.put("plum", 15);
    }

    private static Map<String, Integer> getProducts() {
        return new HashMap<>(Map.of("orange", 12, "banana", 25, "lemon", 8, "pineapple", 13, "grape", 9));
    }
}
