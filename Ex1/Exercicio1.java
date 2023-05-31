package Ex1;
import java.util.ArrayList;
import java.util.List;

public class Exercicio1 {
    public static void main(String[] args) {
        List<Integer> listaDeNumeros = new ArrayList<>();

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

        // A lista ela mostra todos os numeros atribuidos a ela, incluindo os repetidos.
    }
}
