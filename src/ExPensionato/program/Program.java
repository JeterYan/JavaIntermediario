package ExPensionato.program;

import ExPensionato.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rent[] numeroDeQuartos = new Rent[10];

        System.out.println("Qual o numero de estudantes: ");
        int numeroDeEstudantes = sc.nextInt();

        for (int i = 1; i <= numeroDeEstudantes; i++) {
            System.out.println();
            System.out.println("Numero do quarto " + i + ": ");
            System.out.println("Digite o nome do estudante: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Digite seu e-mail: ");
            String email = sc.next();
            System.out.println("Qual numero do quarto: ");
            int numeroDoQuarto = sc.nextInt();

            numeroDeQuartos[numeroDoQuarto] = new Rent(nome, email);

        }
        System.out.println();
        System.out.println("Quartos: ");
        for (int i = 0; i < 10; i++) {
            if (numeroDeQuartos[i] != null) {
                System.out.println(i + ": " + numeroDeQuartos[i]);
            }
        }
        sc.close();
    }


}
