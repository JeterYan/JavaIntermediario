package Exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número " + numero + " é Par.");
        } else {
            System.out.println("O número " + numero + " é Ímpar.");
        }

    }
}
