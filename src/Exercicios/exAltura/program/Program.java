package Exercicios.exAltura.program;

import Exercicios.exAltura.pessoa.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas pessoa serão adicionadas: ");
        int numeroPessoa = sc.nextInt();


        String[] nomePessoa = new String[numeroPessoa];
        int[] idadePessoa = new int[numeroPessoa];
        double[] alturaPessoa = new double[numeroPessoa];

        sc.nextLine();
        System.out.println("Digite seu nome: ");
        nomePessoa[numeroPessoa] = sc.nextLine();
        System.out.println("Digite sua idade: ");
        idadePessoa[numeroPessoa] = sc.nextInt();
        System.out.println("Digite sua altura: ");
        alturaPessoa[numeroPessoa] = sc.nextDouble();

        for (int i = 0; i < numeroPessoa; i++) {
            System.out.println("Primeira pessoa" + (i + 1 ));
            nomePessoa[i] = sc.next();
            idadePessoa[i] = sc.nextInt();
            alturaPessoa[i] = sc.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < numeroPessoa; i++) {
            soma = soma + alturaPessoa[i];
            System.out.println(soma);
        }


        sc.close();
    }
}
