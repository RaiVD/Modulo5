package Ex4;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente(123, "Raissa");

        conta.depositoConta(100.0);
        conta.saqueConta(50.0);
        conta.saqueConta(55.0);
    }

}
