package Ex2;

import java.util.HashSet;
import java.util.Set;

public class Exercicio2 {
    public static void main(String[] args) {


        Set<Integer> listaDeNumeros = new HashSet<>();

        boolean listaVazia = listaDeNumeros.isEmpty();
        System.out.println("A lista esta vazia? "+listaVazia);

        listaDeNumeros.add(1);
        listaDeNumeros.add(5);
        listaDeNumeros.add(5);
        listaDeNumeros.add(6);
        listaDeNumeros.add(7);
        listaDeNumeros.add(8);
        listaDeNumeros.add(8);
        listaDeNumeros.add(8);

        System.out.println("Conjunto de nomes: " + listaDeNumeros);
        System.out.println("---------------------------------------------------");

        // O conjunto não mostra todos os numeros atribuidos a ele, pois ele não repete os numeros.

    }
}
