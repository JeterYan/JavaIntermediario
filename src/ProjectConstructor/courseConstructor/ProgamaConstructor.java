package ProjectConstructor.courseConstructor;

import ProjectConstructor.intitiesConstructor.ProductConstructor;

import java.util.Locale;
import java.util.Scanner;

public class ProgamaConstructor {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Price: ");
        double price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();

        ProductConstructor products = new ProductConstructor(name, price, quantity);

        System.out.println();
        System.out.println("Product data: " + products);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
        products.addProducts(quantity);
        System.out.println("Updated product data: " + products);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stock: ");
        quantity = sc.nextInt();
        products.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated product data: " + products);

        sc.close();
    }
}
