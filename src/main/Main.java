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
        
        SortingMachines.bubbleSortPriceAscending(arrayOne);
        SortingMachines.bubbleSortPriceDescending(arrayTwo);
        SortingMachines.insertionSortPriceAscending(arrayThree);
        SortingMachines.insertionSortPriceDescending(arrayThree);

        new SortingExperiment(arrayOne, "Bubble Sort", "Crescente", SortingMachines::bubbleSortPriceAscending).run();
        new SortingExperiment(arrayTwo, "Bubble Sort", "Decrescente", SortingMachines::bubbleSortPriceDescending).run();
        new SortingExperiment(arrayThree, "Insertion Sort", "Crescente", SortingMachines::insertionSortPriceAscending).run();
        new SortingExperiment(arrayThree, "Insertion Sort", "Decrescente", SortingMachines::insertionSortPriceDescending).run();
    }
}
