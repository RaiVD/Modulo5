package Ex2;
import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Eu sei dividir!");
        boolean entrada = false;
        while (!entrada) {
            try {
                System.out.println("Informe o primeiro valor: ");
                double x = teclado.nextDouble();
                if (x % 1 == 0) {
                    throw new NumberFormatException("O valor deve ser informada com vírgula");
                }
                if (x < 0) {
                    throw new UnsupportedOperationException("Não é possível inserir número negativo ou zero.");
                }
                System.out.println("Informe o segundo valor: ");
                double y = teclado.nextDouble();
                if (y % 1 == 0) {
                    throw new NumberFormatException("O valor deve ser informada com vírgula");
                }
                if (y < 0) {
                    throw new UnsupportedOperationException("Não é possível inserir número negativo ou zero.");
                }
                double r = (x / y);
                System.out.println("O resultado da soma é: " + r);
                entrada = true;

            } catch (NumberFormatException | UnsupportedOperationException exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
