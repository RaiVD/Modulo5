package Ex3;

import java.util.Scanner;

public class Conta {
    private double saldo;
    private double limiteCredito;
    private Scanner ler;

    public Conta() {
        this.saldo = 0;
        this.limiteCredito = 2000;
        this.ler = new Scanner(System.in);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public void setLimite() {
        System.out.println("Limite de crédito: " + limiteCredito);
        try {
            System.out.println("Qual valor deseja usar do seu crédito?");
            double credito = ler.nextDouble();
            if (credito > limiteCredito) {
                throw new ContaExcecao("Valor excede limite de credito disponivel");
            } else {
                setLimiteCredito(getLimiteCredito() - credito);
                System.out.println("Limite de crédito: " + getLimiteCredito());
            }
        }catch (ContaExcecao exception){
            System.out.println(exception.getMessage());
        }
    }


    public void depositar() {
        try {
            System.out.println("Qual valor deseja depositar?");
            double deposito = ler.nextDouble();
            if (deposito < 0) {
                throw new ContaExcecao("Não é possivel depositar valor negativo");
            } else {
                setSaldo(deposito + getSaldo());
                System.out.println("Saldo atual: " + getSaldo());
            }
        }catch (ContaExcecao exception){
            System.out.println(exception.getMessage());
        }
    }

    public void sacar() {
        try {
            System.out.println("Qual valor deseja sacar?");
            double saque = ler.nextDouble();
            if (saque > saldo) {
                throw new ContaExcecao("Valor excede limite de saldo disponivel");
            } else {
                setSaldo(getSaldo() - saque);
                System.out.println("Saldo atual: " + getSaldo());
            }
        }catch (ContaExcecao exception){
            System.out.println(exception.getMessage());
        }
    }
}
