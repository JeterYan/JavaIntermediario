package ExSecao09.conta;

public class Conta {

    private int numeroConta;
    private String nome;
    private double saldo;

    public Conta(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public Conta(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depSaldo(double saldo) {
        this.saldo += saldo;
    }

    public void saqSaldo(double saldo) {
        this.saldo -= saldo + 5.0;
    }

    public String toString() {
        return  "Account: " + numeroConta + ", Holder: " + nome + ", Balance: " + saldo;
    }
}
