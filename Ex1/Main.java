package Ex1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaMercado mercado = new ListaMercado();
        int escolha = 0;

        while (escolha != 5) {
            try {
                Scanner ler = new Scanner(System.in);
                System.out.println("Menu: \n1 - Verdura \n2 - Legumes \n3 - Grãos \n4 - Outros \n5 - Sair e mostrar lista do mercado");
                escolha = ler.nextInt();

                switch (escolha) {
                    case 1 -> mercado.comprarVerdura();
                    case 2 -> mercado.comprarLegumes();
                    case 3 -> mercado.comprarGraos();
                    case 4 -> mercado.comprarOutros();
                    case 5 -> mercado.listareFinalizar();
                    default -> System.out.println("Opção invalida");

                }
                System.out.println();
            } catch (NumberFormatException exception) {
                System.out.println("Entrada inválida. " + exception.getMessage());
                System.out.println();
            } catch (IllegalArgumentException | UnsupportedOperationException exception) {
                System.out.println(exception.getMessage());
                System.out.println();
            }
        }
    }
}