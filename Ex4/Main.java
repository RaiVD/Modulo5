package Ex4;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Conta> contas = new ArrayList<>();

        Conta contaRaissa = new Conta(0,0,0);
        Conta contaAna = new Conta(0,0,0);
        Conta contaPedro = new Conta(0,0,0);
        Conta contaPaulo = new Conta(0,0,0);

        contas.add(contaRaissa);
        contas.add(contaAna);
        contas.add(contaPedro);
        contas.add(contaPaulo);


        for (Conta calculo :contas) {
            System.out.println("Poupança com tributo: "+calculo.tributosPoupanca()+"\nCorrente com tributo:  "+calculo.tributosContaCorrente()+"\nSeguro de vida com tributo: "+calculo.tributosSeguro());
        }


    }
}

