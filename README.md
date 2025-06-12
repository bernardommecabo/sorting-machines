# 🛒 E-Commerce Product Sorting Simulator

This Java project simulates and compares sorting algorithms applied to product data in an e-commerce system. It evaluates each algorithm based on execution time and number of swaps or shifts, using different initial orderings of the product array.

## 📋 Features

- Sorting algorithms implemented from scratch:
  - Bubble Sort (ascending & descending)
  - Insertion Sort (ascending & descending)
  - Easily extendable for Quick Sort, Selection Sort, Heap Sort, etc.
- Product generation with randomized attributes
- Automated experiments with performance reporting:
  - Sorting algorithm used
  - Initial array order (random, ascending, descending)
  - Number of swaps or shifts
  - Execution time (milliseconds)

## 🧠 Educational Purpose

This project is ideal for studying:
- Sorting algorithm behavior and complexity
- Practical performance measurements
- Java arrays, classes, and method abstraction
- Application of algorithms to real-world-like data

## 🏗️ Project Structure

📦 src
┣ 📂 model
┃ ┗ 📄 Product.java
┣ 📂 util
┃ ┣ 📄 ProductGenerator.java
┃ ┣ 📄 SortingMachines.java
┃ ┗ 📄 SortingExperiment.java
┗ 📄 Main.java


- `Product`: represents a product with attributes like name, price, and date.
- `ProductGenerator`: creates arrays of randomly generated products.
- `SortingMachines`: contains sorting algorithm implementations.
- `SortingExperiment`: executes and reports sorting tests.
- `Main`: runs the full simulation and prints experiment results.

## 🚀 Getting Started

1. Clone the repository:

```bash
git clone https://github.com/your-username/ecommerce-sorting-simulator.git
```

2. Open in your preferred IDE (like IntelliJ or Eclipse)

3. Run the Main class.

## 📈 Example Output

Experimento:
- Algoritmo de ordenação utilizado: Bubble Sort
- Organização inicial do vetor: Crescente
- Número de trocas ou deslocamentos: 127
- Tempo de execução (em milissegundos): 1029

## 🛠️ Requirements

- Java 8 or higher
- No external libraries required

Created by Bernardo Mecabo
