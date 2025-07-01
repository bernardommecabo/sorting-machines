package util;

import model.Product;

public class SortingMachines {
    private static int size;

    public int bubbleSortPriceAscending(Product[] products){
        int count = 0;
        size = products.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (products[j].getPrice() > products[j + 1].getPrice()) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                    count++;
                }
            }
        }
        return count;
    }

    public int bubbleSortPriceDescending(Product[] products){
        int count = 0;
        size = products.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (products[j].getPrice() < products[j + 1].getPrice()) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                    count++;
                }
            }
        }
        return count;
    }

    public int insertionSortPriceAscending(Product[] products){
        int count = 0;
        size = products.length;
        for (int i = 1; i < size; i++) {
            Product key = products[i];
            int j = i;
            while (j > 0 && products[j-1].getPrice() > key.getPrice()) {
                products[j] = products[j - 1];
                j--;
            }
            products[j] = key;
            count++;
        }
        return count;
    }

    public int insertionSortPriceDescending(Product[] products){
        int count = 0;
        size = products.length;
        for (int i = 1; i < size; i++) {
            Product key = products[i];
            int j = i;
            while (j > 0 && products[j-1].getPrice() < key.getPrice()) {
                products[j] = products[j - 1];
                j--;
            }
            products[j] = key;
            count++;
        }
        return count;
    }
}
