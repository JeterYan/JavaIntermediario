package ProjetoEstoque.course;

import ProjetoEstoque.intities.Products;

import java.util.Locale;
import java.util.Scanner;

public class Progam {
    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Products products = new Products();

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        products.name = sc.nextLine();
        System.out.println("Price: ");
        products.price = sc.nextDouble();
        System.out.println("Quantity in stock: ");
        products.quantity = sc.nextInt();

        System.out.println(products.name + " " +  products.price + " " + products.quantity);

        sc.close();
    }
}
