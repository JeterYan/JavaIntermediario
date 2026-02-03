package Exercicios;

import java.util.Scanner;

public class Ex02 {
    static void main() {
        Scanner input = new Scanner(System.in);

        int numero = input.nextInt();

        int par = numero * (numero + 1) / 2;
        int impar = numero * (numero + 1) % 2;

        if (par == impar) {
            System.out.println("Par");
        } else  {
            System.out.println("Impar");
        }

    }
}
