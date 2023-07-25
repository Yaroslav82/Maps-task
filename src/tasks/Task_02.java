package tasks;

import java.util.HashMap;
import java.util.Map;

public class Task_02 {

    private final static Map<String, Integer> products = getProducts();

    private static Map<String, Integer> getProducts() {
        return new HashMap<>(Map.of("pencil", 42, "notebook", 32, "book", 20, "pen", 50, "ruler", 10));
    }
}
