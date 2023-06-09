package Ex2;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final BigDecimal americano = new BigDecimal("5.25");
    private static final BigDecimal canadense = new BigDecimal("4.15");
    private static final BigDecimal euro = new BigDecimal("6.15");
    private static final BigDecimal esterlina = new BigDecimal("7.50");
    public static void main(String[] args) {
        System.out.println("============ Bem-vindo ao conversor de moedas ============");
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            try {
                System.out.println("=========== Qual moeda você deseja converter? ============");
                System.out.println("Dólar americano | Dólar canadense | Euro | Libra Esterlina");
                String moeda = scanner.nextLine();

                BigDecimal cotacao;
                switch (moeda.toLowerCase()) {
                    case "dólar americano":
                        cotacao = americano;
                        break;
                    case "dólar canadense":
                        cotacao = canadense;
                        break;
                    case "euro":
                        cotacao = euro;
                        break;
                    case "libra esterlina":
                        cotacao = esterlina;
                        break;
                    default:
                        throw new IllegalArgumentException("Tipo de moeda inválido");
                }

                System.out.println("O programa só converte para Real");

                System.out.println("Digite o valor a ser convertido:");
                String valorParaConvercao = scanner.nextLine();
                if (valorParaConvercao.isEmpty()) {
                    throw new NumberFormatException("Para moeda, o valor monetário deve ser um número decimal");
                }
                BigDecimal valor = new BigDecimal(valorParaConvercao);

                if (valor.compareTo(BigDecimal.ZERO) <= 0) {
                    System.out.println("Valor inválido, pr, tente novamente.");
                    continue;
                }

                BigDecimal valorConvertido = valor.multiply(cotacao);

                DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
                System.out.println("Cotação atual da(o) "+moeda+" é: "+cotacao);
                System.out.println("Valor a ser convertido: "+ valor);
                System.out.println("O valor convertido em reais é R$"+decimalFormat.format(valorConvertido));

                System.out.println("Deseja fazer outra conversão?\n s. Sim| n. Não");
                String resposta = scanner.nextLine();
                if (!resposta.equalsIgnoreCase("s")) {
                    continuar = false;
                }
            } catch (NumberFormatException exception) {
                System.out.println("Erro: " + exception.getMessage());
            } catch (IllegalArgumentException exception) {
                System.out.println("Erro: " + exception.getMessage());
            }
        }
        System.out.println("=====Obrigado=====");
    }
}

