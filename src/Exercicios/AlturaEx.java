package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AlturaEx {

    public class Program {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            System.out.println("Quantas pessoa serão adicionadas: ");
            int numeroPessoa = sc.nextInt();


            String[] nomePessoa = new String[numeroPessoa];
            int[] idadePessoa = new int[numeroPessoa];
            double[] alturaPessoa = new double[numeroPessoa];


            for (int i = 0; i < numeroPessoa; i++) {
                System.out.println("Dados da " + (i + 1) + "a pessoa:");
                System.out.print("Nome: ");
                sc.nextLine();
                nomePessoa[i] = sc.nextLine();

                System.out.print("Idade: ");
                idadePessoa[i] = sc.nextInt();

                System.out.print("Altura: ");
                alturaPessoa[i] = sc.nextDouble();
            }

            double soma = 0.0;
            for (int i = 0; i < numeroPessoa; i++) {
                soma = soma + alturaPessoa[i];
            }
            double meidaAltura = soma / numeroPessoa;
            System.out.printf("%nMédia das alturas: %.2f%n", meidaAltura);

            int idadeMenor16 = 0;
            for (int i = 0; i < numeroPessoa; i++) {
                if (idadePessoa[i] < 16) {
                    idadeMenor16++;
                }
            }

            double menor16 = idadeMenor16 * 100.0 / numeroPessoa;

            System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", menor16);

            sc.close();
        }
    }
}
