import java.util.Locale;

public class Aula47 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double preco = 34.5;

        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println("Desconto: " + desconto);

    }
}
