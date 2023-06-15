package Ex4;

public class ContaCorrente {
    private int numeroConta;
    private String nomeCorrentista;
    private double saldoConta;
    double valor;

    public ContaCorrente(int numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldoConta = 5.0;
    }
    public double getSaldoConta() {
        return saldoConta;
    }
    public void depositoConta(double valor) {
        saldoConta += valor;
        System.out.println("Depósito de R$" + valor + " realizado.\nNovo saldo: R$" + saldoConta);
        System.out.println("====================================================================");
    }
    public void saqueConta(double valor) {
        if (saldoConta - valor < 5.0) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldoConta -= valor;
            System.out.println("Saque de R$" + valor + " realizado.\nNovo saldo: R$" + saldoConta);
            System.out.println("====================================================================");
        }
    }
}
