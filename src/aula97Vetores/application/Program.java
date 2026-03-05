package aula97Vetores.application;

import aula97Vetores.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade de pessoas?");
        int quantidadePessoas = sc.nextInt();

        Pessoa[] pessoas = new Pessoa[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Digite seu nome:");
            String nome = sc.next();
            System.out.println("Digite sua idade:");
            int idade = sc.nextInt();
            System.out.println("Digite sua altura:");
            double altura = sc.nextDouble();
            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        int soma = 0;
        for (int i = 0; i < quantidadePessoas; i++) {
            soma += pessoas[i].getIdade();
        }
        int mediaIdade = soma / quantidadePessoas;
        System.out.println("Media idades das pessoas: " + mediaIdade);

        int idadeMenor16 = 0;
        for (int i = 0; i < quantidadePessoas; i++) {
            if (pessoas[i].getIdade() < 16) {
                idadeMenor16++;
            }
        }

        double menor16 = idadeMenor16 * 100.0 / quantidadePessoas;
        System.out.printf("Porcentagem de essoas com menos de 16 anos: %.1f%%%n", menor16);

        sc.nextLine();
    }
}
