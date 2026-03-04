package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class exArray01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int tamanhoArray = sc.nextInt();

        int[] lista = new int[tamanhoArray];
        for (int i = 0; i < lista.length; i++) {
            System.out.println("Digite um numero: ");
            lista[i] = sc.nextInt();
        }

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] < 0) {
                System.out.print(lista[i] + " ");
            }
        }
        sc.close();
    }
}
