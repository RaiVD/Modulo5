package Ex3;

public class Main {
    public static void main(String[] args) {
        NumeroPar numeroPar = new NumeroPar(0);

        System.out.println("2 é um numero par? "+numeroPar.verificarPar(2));
        System.out.println("10 é um numero par? "+numeroPar.verificarPar(10));
        System.out.println("20 é um numero par? "+numeroPar.verificarPar(20));
    }
}
