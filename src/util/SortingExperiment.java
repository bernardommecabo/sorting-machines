package util;

import model.Product;
import java.util.function.Function;

public class SortingExperiment {

    private Product[] products;
    private String algorithmName;
    private String initialOrder;
    private Function<Product[], Integer> sortFunction;

    public SortingExperiment(Product[] products, String algorithmName, String initialOrder,
                            Function<Product[], Integer> sortFunction) {
        this.products = products;
        this.algorithmName = algorithmName;
        this.initialOrder = initialOrder;
        this.sortFunction = sortFunction;
    }

    public void run() {
        Product[] copy = products.clone(); // para não modificar o original

        long start = System.currentTimeMillis();
        int moves = sortFunction.apply(copy);
        long end = System.currentTimeMillis();

        printReport(moves, end - start);
    }

    private void printReport(int moves, long elapsedMillis) {
        System.out.println("\nExperimento:");
        System.out.println("- Algoritmo de ordenação utilizado: " + algorithmName);
        System.out.println("- Organização inicial do vetor: " + initialOrder);
        System.out.println("- Número de trocas ou deslocamentos: " + moves);
        System.out.println("- Tempo de execução (em milissegundos): " + elapsedMillis);
    }
}
