package tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_02 {

    private final static Map<String, Integer> products = getProducts();

    public static void main(String[] args) {
        findProduct(getProductName());
    }

    private static String getProductName() {
        System.out.print("Enter the name of the product you want to find: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim();
    }

    private static void findProduct(String product) {
        if (products.containsKey(product)) {
            System.out.println("Product name: " + product + "\nQuantity: " + products.get(product));
        } else {
            System.out.println("We couldn't find this product :(");
        }
    }

    private static Map<String, Integer> getProducts() {
        return new HashMap<>(Map.of("pencil", 42, "notebook", 32, "book", 20, "pen", 50, "ruler", 10));
    }
}
