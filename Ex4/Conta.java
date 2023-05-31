package Ex4;
public class Conta implements Tributos {
    private double saldoSeguro;
    private double saldoCorrente;
    private double saldoPoupanca;
    public Conta(double saldoPoupanca,double saldoCorrente, double saldoSeguro) {
        this.saldoSeguro = saldoSeguro;
        this.saldoCorrente = saldoCorrente;
        this.saldoPoupanca = saldoPoupanca;
    }
    @Override
    public double tributosSeguro() {
        return (42 * saldoSeguro);
    }
    @Override
    public double tributosContaCorrente() {
        return 0.01* saldoCorrente;
    }

    @Override
    public double tributosPoupanca() {
        return saldoPoupanca - saldoPoupanca;
    }
}