package ArrayListAula107EX.program;

import ArrayListAula107EX.classObjetc.Funcionarios;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantos funcionários serão registrados?");
        int quantFuncionarios = sc.nextInt();

        Funcionarios[] funcionarios = new Funcionarios[quantFuncionarios];

        for (int i = 0; i <= quantFuncionarios; i++) {
            System.out.println("ID: ");
            int id = sc.nextInt();
            System.out.println("Nome: ");
            String nome = sc.next();
            System.out.println("Salario: ");
            double salario = sc.nextDouble();

            funcionarios[i] = new Funcionarios(id, nome, salario);
        }

        System.out.println("Insira o ID do funcionário que terá aumento salarial: ");
        int idFuncionario = sc.nextInt();


        for (int i = 0; i < quantFuncionarios; i++) {
            funcionarios[i].aumentarSalario(sc.nextDouble());
        }
        sc.close();
    }
}
