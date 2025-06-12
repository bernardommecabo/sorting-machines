package util;

import java.time.LocalDate;
import java.util.Random;

import model.Product;


public class ProductGenerator {
    public static Product[] generateProducts() {
        // Last three digits of Registration number (202310209144) = 144
        int size = 10000 + 144; // 10,000 + 144 = 10,144 products

        Product[] products = new Product[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            String name = "Product" + (i + 1);
            String productId = String.format("ID%05d", i + 1);
            double price = 1 + (999 * random.nextDouble());
            LocalDate dateAdded = LocalDate.now().minusDays(random.nextInt(365));
            products[i] = new Product(name, productId, dateAdded, price);
        }
        return products;
    }
}
