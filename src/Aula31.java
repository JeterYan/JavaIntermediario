import java.util.Locale;

public class Aula31 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String prod1 = "Computer";
        String prod2 = "Office desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf(prod1 + ", which price is $%.2f%n", price1);
        System.out.printf(prod2 + ", which price is %.2f%n", price2);

        System.out.println("Record: " + age + " years old, code " + code + " and gender: " + gender);

        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f%n", measure);

    }
}
