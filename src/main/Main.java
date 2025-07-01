package main;

import model.Product;
import util.ProductGenerator;
import util.SortingExperiment;
import util.SortingMachines;

public class Main {
    public static void main(String[] args) throws Exception {
        Product[] arrayOne = ProductGenerator.generateProducts();
        Product[] arrayTwo = ProductGenerator.generateProducts();
        Product[] arrayThree = ProductGenerator.generateProducts();

        SortingMachines sorter = new SortingMachines();
        
        sorter.bubbleSortPriceAscending(arrayOne);
        sorter.bubbleSortPriceDescending(arrayTwo);
        sorter.insertionSortPriceAscending(arrayThree);
        sorter.insertionSortPriceDescending(arrayThree);

        new SortingExperiment(arrayOne, "Bubble Sort", "Crescente", products -> sorter.bubbleSortPriceAscending(products)).run();
        new SortingExperiment(arrayTwo, "Bubble Sort", "Decrescente", products -> sorter.bubbleSortPriceDescending(products)).run();
        new SortingExperiment(arrayThree, "Insertion Sort", "Crescente", products -> sorter.insertionSortPriceAscending(products)).run();
        new SortingExperiment(arrayThree, "Insertion Sort", "Decrescente", products -> sorter.insertionSortPriceDescending(products)).run();
    }
}
