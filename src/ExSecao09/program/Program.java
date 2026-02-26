package ExSecao09.program;

import ExSecao09.conta.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        System.out.println("Enter account number: ");
        int numeroConta = sc.nextInt();
        System.out.println("Enter account houder: ");
        String nome = sc.next();
        System.out.println("Is there na initial deposit (y/n) ?: ");
        String saldo = sc.next();

        if (saldo == "y") {
            System.out.println("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            conta = new Conta(numeroConta, nome, initialDeposit);
        } else {
            conta = new Conta(numeroConta, nome);
        }

        System.out.println(conta);

        System.out.println("Enter a deposit value: ");
        double depositoSaldo = sc.nextDouble();
        conta.depSaldo(depositoSaldo);
        System.out.println("Update account data:");
        System.out.println(conta);

        System.out.println("Enter a withdraw value: ");
        double saqueSaldo = sc.nextDouble();
        conta.saqSaldo(saqueSaldo);
        System.out.println("Update account data:");
        System.out.println(conta);

        sc.close();

    }
}
