package Ex4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ContaExcecao {
        Conta minhaConta = new Conta();

        boolean entrada = false;
        while (!entrada) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("===Menu===");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Usar limite de crédito");
            System.out.println("4. Finalizar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> minhaConta.depositar();
                case 2 -> minhaConta.sacar();
                case 3 -> minhaConta.setLimite();
                case 4 -> entrada = true;
                default -> System.out.println("Entrada invalida");
            }

        }
    }
}
