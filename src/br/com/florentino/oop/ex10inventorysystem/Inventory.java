package br.com.florentino.oop.ex10inventorysystem;

import br.com.florentino.oop.ex01productclass.Product;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private final DecimalFormat decimalFormat = new DecimalFormat("0.00");
    private final List<Product> products = new ArrayList<>();

    public void registerProduct(String name, double price, int quantity) {
        products.add(new Product(name, price, quantity));
    }

    public void listProducts() {
        int index = 1;

        for (Product product : products) {
            System.out.println(index++ + ". " + product.getName());
        }
    }

    public void searchProductByName(String productName) {
        boolean found = false;

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                found = true;
                System.out.println(productName + " encontrado no estoque.");
                break;
            }
        }

        if (!found) {
            System.out.println(productName + " não encontrado no estoque.");
        }
    }

    public void sellProduct(String productName, int productQuantity) {
        boolean found = false;

        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName)) {
                found = true;

                if (product.getQuantity() >= productQuantity) {
                    product.setQuantity(product.getQuantity() - productQuantity);
                } else {
                    System.out.println("Quantidade insuficiente em estoque. Quantidade disponível: " + product.getQuantity() + ".");
                }

                break;
            }
        }

        if (!found) {
            System.out.println(productName + " não encontrado no estoque.");
        }
    }

    public void generateReport() {
        int productCount = 0;
        double productsTotalStockValue = 0;

        int index = 1;

        for (Product product : products) {
            System.out.println(index++ + ". " + product.getName());
            System.out.println("Preço: R$" + decimalFormat.format(product.getPrice()));
            System.out.println("Quantidade: " + product.getQuantity());


            if (product.getDiscount() != 0) {
                System.out.println("Desconto: " + product.getDiscount());
            }

            double totalStockValue = product.calculateTotalStockValue();
            System.out.println("Valor em estoque do produto " + product.getName() + ": R$" + totalStockValue);

            System.out.println();

            productCount += product.getQuantity();
            productsTotalStockValue += totalStockValue;
        }

        System.out.println("Quantidade de produtos cadastrados: " + products.size() + ".");
        System.out.println("Quantidade de unidades em estoque: " + productCount + ".");
        System.out.println("Valor total do estoque: R$" + decimalFormat.format(productsTotalStockValue) + ".");
    }
}
