package Ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ListaMercado {

    Map<String, Double> listaVerdura = new HashMap<>();
    Map<String, Integer> listaLegumes = new HashMap<>();
    Map<String, Double> listaGrao = new HashMap<>();
    Map<String, Integer> listaOutros = new HashMap<>();

    public void comprarVerdura() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas gramas de verdura você deseja? ");
        double quantidade = ler.nextDouble();
        if (quantidade % 1 == 0) {
            throw new NumberFormatException("Para verdura, a quantidade deve ser informada com ponto.");
        }
        System.out.println("Qual Verdura? ");
        String nome = ler.next();
        if (nome.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio.");
        }
        listaVerdura.put(nome, quantidade);
    }

    public void comprarLegumes() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantos legumes você deseja? ");
        int quantidade = ler.nextInt();
        if (quantidade <= 0) {
            throw new UnsupportedOperationException("Não é possível inserir número negativo ou zero.");
        }
        System.out.println("Qual Legume? ");
        String nome = ler.next();
        if (nome.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio.");
        }
        listaLegumes.put(nome, quantidade);
    }

    public void comprarGraos() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas gramas de grão você deseja? ");
        double quantidade = ler.nextDouble();
        if (quantidade % 1 == 0) {
            throw new NumberFormatException("Para verdura, a quantidade deve ser informada com ponto.");
        }
        System.out.println("Qual Grão? ");
        String nome = ler.next();
        if (nome.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio.");
        }
        listaGrao.put(nome, quantidade);
    }


    public void comprarOutros(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Quantas unidades desse produto você deseja? ");
        int  quantidade = ler.nextInt();
        if (quantidade <= 0) {
            throw new UnsupportedOperationException("Não é possível inserir número negativo ou zero.");
        }
        System.out.println("Qual Produto? ");
        String nome = ler.next();
        if (nome.isEmpty()) {
            throw new UnsupportedOperationException("Não é permitido inserir nome vazio.");
        }
        listaOutros.put(nome, quantidade);
    }

    public void listareFinalizar(){
        System.out.println("------------Lista Mercado-------------");
        System.out.println("Quantidade de legumes: " + listaLegumes.size());
        listaLegumes.forEach((k, v) -> System.out.println("Produto: " + k + " Kg" + " | Quantidade: " + v));

        System.out.println("\nQuantidade de verdura: " + listaVerdura.size());
        listaVerdura.forEach((k, v) -> System.out.println("Produto: " + k + " | Quantidade: " + v));

        System.out.println("\nQuantidade de grãos: " + listaGrao.size());
        listaGrao.forEach((k, v) -> System.out.println("Produto: " + k + " Kg" + " | Quantidade: " + v));

        System.out.println("\nQuantidade de outros: " + listaOutros.size());
        listaOutros.forEach((k, v) -> System.out.println("Produto: " + k + " | Quantidade: " + v));

    }


}
